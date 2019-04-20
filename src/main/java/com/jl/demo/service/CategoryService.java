package com.jl.demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jl.demo.dao.ProductDAO;
import com.jl.demo.dto.ColorSwatcheDTO;
import com.jl.demo.dto.ProductDTO;
import com.jl.demo.model.Category;
import com.jl.demo.model.ColorSwatch;
import com.jl.demo.model.Price;
import com.jl.demo.model.Product;
import com.jl.demo.util.ColorUtil;
import com.jl.demo.util.CurrencyUtil;

@Service
public class CategoryService {

	@Autowired
	private CurrencyUtil currencyUtil;
	@Autowired
	private ColorUtil colorUtil;
	@Autowired
	private ProductDAO productDAO;
	
	public List<ProductDTO> getFormatedProducts(String labelType) {
		Category category=null;
		try {
			category = productDAO.getProducts();
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<ProductDTO> list = new ArrayList<ProductDTO>();
		if(category!=null && category.getProducts()!=null && !category.getProducts().isEmpty()) {
			for(Product p : category.getProducts()) {
				ProductDTO pDTO = new ProductDTO();
				pDTO.setTitle(p.getTitle());
				pDTO.setProductId(p.getProductId());
				pDTO.setColorSwatches(new ArrayList<ColorSwatcheDTO>());
				pDTO.setNowPrice(currencyUtil.getCurrencySymbol(p.getPrice().getCurrency())+p.getPrice().getNow().getTo());
				pDTO.setPrice(p.getPrice().getNow().getTo()!=null?Float.parseFloat(p.getPrice().getNow().getTo()):null);
				if(p.getColorSwatches()!=null && !p.getColorSwatches().isEmpty()) {
					for(ColorSwatch cs : p.getColorSwatches()) {
						ColorSwatcheDTO csDTO = new ColorSwatcheDTO();
						csDTO.setSkuid(cs.getSkuId());
						csDTO.setColor(cs.getColor());
						csDTO.setRgbColor(colorUtil.getColorHexaByName(cs.getBasicColor()));
						pDTO.getColorSwatches().add(csDTO);
					}
				}
				pDTO.setPriceLabel(generatePriceLabel(p.getPrice(),labelType));
				list.add(pDTO);
			}
		}
		Collections.sort(list, ProductDTO.priceComparator);
		return list;
	}
	
	private String generatePriceLabel(Price price, String labelType) {
		if(labelType.equalsIgnoreCase("ShowWasNow")) {
			return getShowWasNow(price);
		}else if(labelType.equalsIgnoreCase("ShowWasThenNow")) {
			if((price.getThen2()!=null&&!price.getThen2().isEmpty()) || (price.getThen1()!=null&&!price.getThen1().isEmpty())) 
			return getShowWasThenNow(price);
			else
				return getShowWasNow(price);
		}else if(labelType.equalsIgnoreCase("ShowPercDscount")) {
			return getShowPercDscount(price);
		}else {
			return "";
		}
	}
	
	private String getShowWasNow(Price price) {
		return String.format("Was %s%s, now %s%s", currencyUtil.getCurrencySymbol(price.getCurrency()), price.getWas(), 
				currencyUtil.getCurrencySymbol(price.getCurrency()), price.getNow().getTo());
	}
	
	private String getShowWasThenNow(Price price) {
		return String.format("Was %s%s, then %s%s, now %s%s", currencyUtil.getCurrencySymbol(price.getCurrency()), price.getWas(), 
				currencyUtil.getCurrencySymbol(price.getCurrency()), price.getThen2()!=null&&!price.getThen2().isEmpty()?price.getThen2():price.getThen1(),
						currencyUtil.getCurrencySymbol(price.getCurrency()), price.getNow().getTo());
	}
	
	private String getShowPercDscount(Price price) {
		try {
			if(price.getWas()!=null && !price.getWas().isEmpty() && price.getNow().getTo()!=null && !price.getNow().getTo().isEmpty())
				return String.format("%d%% off - now %s%s", caluculatePercentage(Float.parseFloat(price.getWas()), Float.parseFloat(price.getNow().getTo())), 
					currencyUtil.getCurrencySymbol(price.getCurrency()), price.getNow().getTo());
			else
				return String.format("Now %s%s", currencyUtil.getCurrencySymbol(price.getCurrency()), price.getNow().getTo());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return String.format("Now %s%s", currencyUtil.getCurrencySymbol(price.getCurrency()), price.getNow().getTo());
	}
	
	private int caluculatePercentage(float was, float now) {
		return (int) (((was-now)/was)*100);
	}
}

package com.jl.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.jl.demo.dao.ProductDAO;
import com.jl.demo.dto.ProductDTO;
import com.jl.demo.model.Category;
import com.jl.demo.model.ColorSwatch;
import com.jl.demo.model.Price;
import com.jl.demo.model.PriceNow;
import com.jl.demo.model.Product;
import com.jl.demo.service.CategoryService;
import com.jl.demo.util.ColorUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDemoApplicationTest {
	
	@Autowired
	private ColorUtil colorUtil;
	@Autowired
	private CategoryService categoryService;
	
	@MockBean
    private ProductDAO productDAO;
	
	@Test
	public void contextLoads() {
	}
	
	@Before
	public void setUp() {
		Category cat = new Category();
		cat.setProducts(new ArrayList<Product>());
		Product prod = new Product();
		prod.setColorSwatches(new ArrayList<ColorSwatch>());
		ColorSwatch cs = new ColorSwatch();
		cs.setSkuId("sku123");
		cs.setBasicColor("brown");
		cs.setColor("Brown");
		prod.getColorSwatches().add(cs);
		prod.setProductId("12345");
		prod.setTitle("Shoe");
		Price p = new Price();
		p.setCurrency("GBP");
		p.setWas("7.50");
		p.setThen2("7.25");
		PriceNow pn = new PriceNow();
		pn.setFrom("7.50");
		pn.setTo("7.00");
		p.setNow(pn);
		prod.setPrice(p);
		
		Product prod2 = new Product();
		prod2.setColorSwatches(new ArrayList<ColorSwatch>());
		ColorSwatch cs2 = new ColorSwatch();
		cs2.setSkuId("sku123");
		cs2.setBasicColor("Mult");
		cs2.setColor("Brown");
		prod2.getColorSwatches().add(cs2);
		prod2.setProductId("12346");
		prod2.setTitle("Shoe");
		Price p2 = new Price();
		p2.setCurrency("GBP");
		p2.setWas("7.50");
		p2.setThen1("7.25");
		PriceNow pn2 = new PriceNow();
		pn2.setFrom("7.50");
		pn2.setTo("7.00");
		p2.setNow(pn2);
		prod2.setPrice(p2);
		
		Product prod3 = new Product();
		prod3.setProductId("12347");
		prod3.setTitle("Shoe");
		Price p3 = new Price();
		p3.setCurrency("GBP");
		p3.setWas("7.50");
		//p3.setThen1("7.25");
		PriceNow pn3 = new PriceNow();
		pn3.setFrom("7.50");
		pn3.setTo("7.00");
		p3.setNow(pn3);
		prod3.setPrice(p3);
		
		cat.getProducts().add(prod);
		cat.getProducts().add(prod2);
		cat.getProducts().add(prod3);
		
	    Mockito.when(productDAO.getProducts()).thenReturn(cat);
	}
	
	@Test
	public void testColorUtilWhenRed() {
		String hexa = colorUtil.getColorHexaByName("red");
		assertThat(hexa).isEqualTo("FF0000");
	}
	
	@Test
	public void testColorUtilWhenGreen() {
		String hexa = colorUtil.getColorHexaByName("GREEN");
		assertThat(hexa).isEqualTo("008000");
	}

	@Test
	public void testWhenLabelTypeIsShowWasNow() {
		List<ProductDTO> list = categoryService.getFormatedProducts("ShowWasNow");
		assertThat(list).isNotEmpty();
		assertThat(list.get(0).getPriceLabel()).isEqualTo("Was £7.50, now £7.00");
	}
	
	@Test
	public void testWhenLabelTypeIsShowWasThenNow() {
		List<ProductDTO> list = categoryService.getFormatedProducts("ShowWasThenNow");
		assertThat(list).isNotEmpty();
		assertThat(list.get(0).getPriceLabel()).isEqualTo("Was £7.50, then £7.25, now £7.00");
	}
	
	@Test
	public void testWhenLabelTypeIsShowWasThenNowAndThen2PriceEmpty() {
		List<ProductDTO> list = categoryService.getFormatedProducts("ShowWasThenNow");
		assertThat(list).isNotEmpty();
		List<ProductDTO> fliterList = list.stream().filter(x -> x.getProductId().equals("12346")).collect(Collectors.toList());
		assertThat(fliterList.get(0).getPriceLabel()).isEqualTo("Was £7.50, then £7.25, now £7.00");
	}
	
	@Test
	public void testWhenLabelTypeIsShowWasThenNowAndThen1Then2PriceEmpty() {
		List<ProductDTO> list = categoryService.getFormatedProducts("ShowWasThenNow");
		assertThat(list).isNotEmpty();
		List<ProductDTO> fliterList = list.stream().filter(x -> x.getProductId().equals("12347")).collect(Collectors.toList());
		assertThat(fliterList.get(0).getPriceLabel()).isEqualTo("Was £7.50, now £7.00");
	}
	
	@Test
	public void testWhenLabelTypeIsShowPercDscount() {
		List<ProductDTO> list = categoryService.getFormatedProducts("ShowPercDscount");
		assertThat(list).isNotEmpty();
		assertThat(list.get(0).getPriceLabel()).isEqualTo("6% off - now £7.00");
	}
	
	@Test
	public void testRgbColorWhenColorIsBrown() {
		List<ProductDTO> list = categoryService.getFormatedProducts("ShowPercDscount");
		assertThat(list).isNotEmpty();
		List<ProductDTO> fliterList = list.stream().filter(x -> x.getProductId().equals("12345")).collect(Collectors.toList());
		assertThat(fliterList.get(0).getColorSwatches().get(0).getColor()).isEqualTo("Brown");
		assertThat(fliterList.get(0).getColorSwatches().get(0).getRgbColor()).isEqualTo("A52A2A");
	}
	
	@Test
	public void testRgbColorWhenBsicColorIsInvalid() {
		List<ProductDTO> list = categoryService.getFormatedProducts("ShowPercDscount");
		assertThat(list).isNotEmpty();
		List<ProductDTO> fliterList = list.stream().filter(x -> x.getProductId().equals("12346")).collect(Collectors.toList());
		assertThat(fliterList.get(0).getColorSwatches().get(0).getColor()).isEqualTo("Brown");
		assertThat(fliterList.get(0).getColorSwatches().get(0).getRgbColor()).isEmpty();
	}
	
	@Test
	public void testProductTitle() {
		List<ProductDTO> list = categoryService.getFormatedProducts("ShowPercDscount");
		assertThat(list).isNotEmpty();
		List<ProductDTO> fliterList = list.stream().filter(x -> x.getProductId().equals("12346")).collect(Collectors.toList());
		assertThat(fliterList.get(0).getTitle()).isEqualTo("Shoe");
	}
	
	@Test
	public void testProductNowPrice() {
		List<ProductDTO> list = categoryService.getFormatedProducts("ShowPercDscount");
		assertThat(list).isNotEmpty();
		List<ProductDTO> fliterList = list.stream().filter(x -> x.getProductId().equals("12346")).collect(Collectors.toList());
		assertThat(fliterList.get(0).getNowPrice()).isEqualTo("£7.00");
	}
}

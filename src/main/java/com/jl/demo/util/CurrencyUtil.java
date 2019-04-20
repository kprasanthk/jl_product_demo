package com.jl.demo.util;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

@Component
public class CurrencyUtil {
	private static Map<String,String> currencyMap = new TreeMap<String,String>(String.CASE_INSENSITIVE_ORDER);
	static {
		currencyMap.put("GBP", "£");
		currencyMap.put("USD", "$");
		currencyMap.put("EUR", "€");
	}
	
	public String getCurrencySymbol(String code) {
		return currencyMap.get(code)!=null?currencyMap.get(code):"";
	}
}

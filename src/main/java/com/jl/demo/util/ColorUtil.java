package com.jl.demo.util;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

@Component
public class ColorUtil {

	private static Map<String,String> color2HexaMap = new TreeMap<String,String>(String.CASE_INSENSITIVE_ORDER);
	static {
		color2HexaMap.put("Red", "FF0000");
		color2HexaMap.put("Green", "008000");
		color2HexaMap.put("Blue", "0000FF");
		color2HexaMap.put("Black", "000000");
		color2HexaMap.put("White", "FFFFFF");
		color2HexaMap.put("Orange", "FFA500");
		color2HexaMap.put("Pink", "FFC0CB");
		color2HexaMap.put("Purple", "800080");
		color2HexaMap.put("Brown", "A52A2A");
		color2HexaMap.put("Navy", "000080");
		color2HexaMap.put("Gray", "808080");
		color2HexaMap.put("Yellow", "FFFF00");
	}
	
	public String getColorHexaByName(String colorName) {
		return color2HexaMap.get(colorName)!=null?color2HexaMap.get(colorName):"";
	}
}

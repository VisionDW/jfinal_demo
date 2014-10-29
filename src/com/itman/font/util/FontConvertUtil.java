package com.itman.font.util;

import com.spreada.utils.chinese.ZHConverter;

public class FontConvertUtil {
	/**
	 * 简繁体转换方法
	 * @param str
	 * @param type
	 * @return
	 */
	public static String fontConvertUtil(String str,String type) {
		ZHConverter converter =null;
		String fontStr="";
		if("simplified".equals(type)){
			converter = ZHConverter.getInstance(ZHConverter.SIMPLIFIED); 
			fontStr=converter.convert(str); 
		}else if("traditional".equals(type)){
			converter = ZHConverter.getInstance(ZHConverter.TRADITIONAL); 
			fontStr=converter.convert(str);
		}
		return fontStr;
	}
}

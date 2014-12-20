package com.zlf.anotation;

public @interface Type {
	
	CONSTANT_TYPE type() default CONSTANT_TYPE.String;
	/**
	 * 是否包含多个配置信息
	 * @return
	 */
	boolean single() default true;
	
	
	public static enum CONSTANT_TYPE{
		Integer, Long, String, Boolean
	}
}

package com.zlf.anotation;
/**
 * 扫描的配置文件，以,隔开
 * @author EBOX
 *
 */
public @interface ScanRange {
	String value() default "constant.properties";
}

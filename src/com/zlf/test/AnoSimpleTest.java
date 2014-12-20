package com.zlf.test;

import com.zlf.anotation.TestAnota;

@TestAnota
public class AnoSimpleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestAnota isAno = AnoSimpleTest.class.getAnnotation(TestAnota.class);
		System.out.println(isAno.toString());
		System.out.println(AnoSimpleTest.class.isAnnotationPresent(TestAnota.class));
	}

}

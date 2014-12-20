package com.zlf.test;

import java.lang.reflect.Field;

public class PropAutoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Field[] fields = PropAutoTest.class.getFields();
		for (Field field : fields) {
			System.out.println(field.toString());
		}
	}

}

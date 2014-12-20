package com.zlf.test;

import com.zlf.anotation.ScanRange;
import com.zlf.anotation.Type;
import com.zlf.anotation.Type.CONSTANT_TYPE;

@ScanRange(value="app.properties")
public class Constant {

	@Type(type=CONSTANT_TYPE.Integer, single = true)
	private int appname;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

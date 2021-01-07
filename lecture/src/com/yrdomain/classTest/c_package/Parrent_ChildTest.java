package com.yrdomain.classTest.c_package;

import com.yrdomain.classTest.a_package.*;
import com.yrdomain.classTest.b_package.*;

public class Parrent_ChildTest {

	public static void main(String[] args) {
		Parrent c = new Child();

//		System.out.println(c.m_strParrentPublic);
//		System.out.println(c.m_strChildPublic);

		c.methodParrentPublic();
		// c.methodChildPublic();

		// c.methodParrentProtected();
	}

}

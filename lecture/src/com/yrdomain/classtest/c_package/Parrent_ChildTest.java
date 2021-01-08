package com.yrdomain.classtest.c_package;

import com.yrdomain.classtest.a_package.*;
import com.yrdomain.classtest.b_package.*;

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

package com.mydomain.classtest.c_package;

import com.mydomain.classtest.a_package.*;
import com.mydomain.classtest.b_package.*;

public class Parrent_ChildTest {

	public static void main(String[] args) {
		Parrent c = new Child();

		//	System.out.println(c.m_strParrentPublic);
		//	System.out.println(c.m_strChildPublic);

		c.methodParrentPublic();
		// c.methodChildPublic();
		// c.methodParrentProtected();

		Parrent cc = new ChildOfChild();

		((ChildOfChild) cc).methodParrentPublic();

	}

}
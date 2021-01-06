package com.yrdomain.test;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
class GraphicsEx6 extends Frame {
	Image img;

	public GraphicsEx6() {
		super("ImageTest");

		setBounds(200, 200, 300, 300);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}
		});
	}

	public void paint(java.awt.Graphics g) {
		//��Ŭ������ src ������ �̹����� ������ �ڵ����� bin������ �̹��� ������ �����. �׷��Ƿ� getResource �� ������ �� ����

		img = Toolkit.getDefaultToolkit().getImage(GraphicsEx6.class.getResource("").getPath()+"dog.jpg");

//img = Toolkit.getDefaultToolkit().getImage("C:/sou/002_javabasic02/java_basic_02/bin/pack00_TemporaryPackage/testpic.jpg"); 

		g.drawImage(img, 50, 80, 200, 200, this);  // g.drawImage(�̹���, x��ǥ, y��ǥ, ����, �ʺ�, this)

	}

	public static void main(String[] args) {

		new GraphicsEx6();

	}
}
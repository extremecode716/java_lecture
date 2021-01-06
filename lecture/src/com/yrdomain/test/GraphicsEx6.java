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
		//이클립스의 src 폴더에 이미지를 넣으면 자동으로 bin폴더에 이미지 파일이 복사됨. 그러므로 getResource 로 가져올 수 있음

		img = Toolkit.getDefaultToolkit().getImage(GraphicsEx6.class.getResource("").getPath()+"dog.jpg");

//img = Toolkit.getDefaultToolkit().getImage("C:/sou/002_javabasic02/java_basic_02/bin/pack00_TemporaryPackage/testpic.jpg"); 

		g.drawImage(img, 50, 80, 200, 200, this);  // g.drawImage(이미지, x좌표, y좌표, 높이, 너비, this)

	}

	public static void main(String[] args) {

		new GraphicsEx6();

	}
}
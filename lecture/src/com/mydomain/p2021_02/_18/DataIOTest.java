package com.mydomain.p2021_02._18;
/* 지금까지 배운 클래스들은 모두 데이터를 바이트나 문자 단위로만 취급하고    */
/*  입,출력을 했었다.                                                        */
/* 정수형이나 실수형 같은 기본 데이터 타입을 유지 하면서 입.출력하는 방법은? */
/* DataInputStream, DataOutputStream 클래스를 이용하는 방법                  */

import java.io.*;

public class DataIOTest {

    public static void main( String[] args ) {
	try {
	    // 파일에 저장하기 위한 FileOutputStream 객체 생성
	    FileOutputStream fos = new FileOutputStream( "iodata.txt" );

	    // FileOutputStream 객체를 argument로 받아 들이는 
		//  DataOutputStream 객체 생성	    
	    DataOutputStream dos = new DataOutputStream( fos );

	    // 각 데이터 타입에 맞는 write 메소드를 호출해 파일에 
		// 데이터를 저장 	    
	    dos.writeBoolean( true );
	    dos.writeChar( 'j' );
	    dos.writeInt( 1234 );
	    dos.writeFloat( 3.14F );
	    dos.writeDouble( 123.5423 );
	    dos.writeUTF( "gemini" );

	    // 파일에서 데이터를 읽어 들이기 위한 FileInputStream 객체
		// 생성	    
	    FileInputStream fis = new FileInputStream( "iodata.txt" );
			
	    // 각 데이터 타입별로 데이터를 읽어 들이기 위한 
	    //  DataInputStream 객체 생성
	    DataInputStream dis = new DataInputStream( fis );

	    // 각 데이터 타입에 맞게 read()를 호출해
  	    //  파일에서 데이터를 읽어 들여 화면 출력
  	    System.out.println( dis.readBoolean() );
	    System.out.println( dis.readChar() );		
	    System.out.println( dis.readInt() );
	    System.out.println( dis.readFloat() );
	    System.out.println( dis.readDouble() );
	    System.out.println( dis.readUTF() );
			
	    // 파일 스트림 해제
	    dos.close();
	    dis.close();
	} catch ( IOException io ) {
	    System.out.println( io.toString() );
	}
    }
}

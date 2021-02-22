package com.mydomain.p2021_02._18;
// 객체를 실제로 입.출력 시키는 클래스

import java.io.*;
import java.util.*; //java.util.Date;

public class ObjectStreamTest {
	
    // PersonInforamtion 객체를 선언
    PersonInformation gemini;
    PersonInformation johnharu;
    Date d;

    // 생성자
    public ObjectStreamTest() {
    	
	// PersonInforamtion 객체를 생성
	gemini = new PersonInformation( "gemini", 10, "seoul", "02-321-3234" );
	johnharu = new PersonInformation( "johnharu", 20, "seoul", "02-473-4232" );
	
	// 날짜 정보를 지니는 Data 객체 생성
	d = new Date();
    }//생성자 end

    // File에 객체를 저장하는 메소드
    public void writeObjectFile() {
	try {
	    // 파일에 저장하기 위한 FileOutputStream 생성
	    FileOutputStream fos = new FileOutputStream( "person.dat" );
			
	    // 파일에 객체를 저장하기 위한 ObjectOutputStream 객체 생성
	    // argument로 FileOutputStream 객체를 받음
	    ObjectOutputStream oos = new ObjectOutputStream( fos );

	    // write()를 이용해 객체를 file에 저장
	    oos.writeObject( gemini );
	    oos.writeObject( johnharu );
	    oos.writeObject( d );
	} catch( Exception e ) {
	    System.out.println( e.toString() );
	}
    }

    // File에서 객체를 읽어오는 메소드
    public void readObjectFile() {
	try {
	    // 파일에서 데이터를 읽어오기 위한 FileInputStream 객체 생성
	    FileInputStream fis = new FileInputStream( "person.dat" );
			
	    // File에 저장된 객체를 읽어 오기 위해 
	    // FileInputStream 객체를 생성자 argument를 받아 객체 생성
	    ObjectInputStream ois = new ObjectInputStream( fis );

	    Object o = null;
	    // 파일(person.dat)에 저장된 객체를 모두 읽어 올 때까지 반복
  	    while(( o = ois.readObject() ) != null ) {

			// if( 변수 instanceof 클래스명) 
			//  : 변수가 이 클래스의 instance인지 아닌지를 체크함.
			// 만약 읽어온 객체가 PersonInforamtion 객체이면
			if( o instanceof PersonInformation ) {
				System.out.print(((PersonInformation)o).getName() + " : ");
				System.out.print(((PersonInformation)o).getAge() + " : " );
				System.out.print(((PersonInformation)o).getAddress() + " : " );
				System.out.print(((PersonInformation)o).getTelephone() );

				System.out.println();
			} else {
				System.out.println( o.toString() );
			}
	    }//while end
	} catch ( Exception e ) {
	}
    }

    public static void main( String[] args ) {
		ObjectStreamTest ost = new ObjectStreamTest();
		ost.writeObjectFile();
		ost.readObjectFile();
    }
}

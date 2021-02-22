package com.mydomain.p2021_02._18;
//객체 직렬화: 각 사람에 대한 객체를 만들어 놓고 객체 단위로 
// 입.출력 하는 것을 말함.
// 독립 객체들도 내부적으로는 사방에 흩어져 존재 하지만 
// 입.출력 할때는 줄을 세워서 입.출입 하기 때문에 객체 직렬화라함
//객체 단위로 저장하고 읽기 위해서 2개의 클래스가 제공된다.
// (ObjectInputStream, ObjectOutputStream)

// 신상 정보를 간직한 객체를 만들기 위한 클래스

import java.io.*;

// 객체 직렬화를 위해서는 Serializable이라는 인터페이스를 상속 
// 받아야 한다.(메소드는 없음)
// 단지, Serializable 인터페이스는 직렬화 한다는 표시자의 역할만 함.
// Serializable 인터페이스를 구현한 클래스로 객체를 만들고 
// 입.출력을 하면 우리가 프로그램에서 체크하지 않아도 중복된 객체가
//  입.출력하는 것을 방지해 준다.
public class PersonInformation implements Serializable {
	
    // 멤버 변수
    private String name;
    private int age;
    private String address;
    private String telephone;
	
    // 생성자
public PersonInformation( String name, int age, String address, String telephone ) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.telephone = telephone;
    }

    // 각 멤버 변수의 값을 리턴시키는 getXXX()메소드
    public String getName() {
		return name;
    }

    public int getAge() {
		return age;
    }

    public String getAddress() {
		return address;
    }

    public String getTelephone() {
		return telephone;
    }
}
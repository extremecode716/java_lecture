package com.yrdomain.p2021_02._04;

public class ExplicitConversion2 {

    public static void main( String[] args ) {
    	
        // int�� ������ 97�� �ʱ�ȭ
        int intValue = 97;

        // int�� ���� ���� char������ ��ȯ �� �Ҵ�
        char charValue = ( char )intValue;
        System.out.println( "charValue = " + charValue );

        // float�� ���� �ʱ�ȭ.
        float floatValue = 3.14F;

        // float�� ���� ���� int������ ��ȯ �� �Ҵ�
        int intValue2 = ( int )floatValue;
        System.out.println( "intValue2 = " + intValue2 );

        // float�� ���� �ʱ�ȭ
        double doubleValue = 21.12345;
        
        // double�� ���� ���� float������ ��ȯ �� �Ҵ�
        float floatValue2 = ( float )doubleValue;
        System.out.println( "floatValue2 = " + floatValue2 );
    }
}
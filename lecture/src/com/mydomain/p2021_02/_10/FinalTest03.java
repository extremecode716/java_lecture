package com.mydomain.p2021_02._10;

final class FinalClass{
  String str="Java ";
    public void setStr(String s){
      str=s;
    System.out.println(str);
  }
}
//class FinalEx extends FinalClass{    
//   int a=10; 
//   public void setA(int a)  {
//    this.a=a;
//   }
//   public void setStr(String s){
//    str+=s;
//    System.out.println(str);
//   }
//}
public class FinalTest03{
   public static void main(String[] args) {
    FinalEx fe= new FinalEx( );
   }   
}          
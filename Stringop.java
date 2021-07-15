import java.util.*;
public class Stringop{
    String str;
    Stringop(String str1){
        str=str1;
    }
   void operation(){
       System.out.println(str.substring(0,1).toLowerCase()+str.substring(1,str.length()-1)+str.substring(str.length()-1).toUpperCase());
   }
    void operation1(){
        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1,str.length()-1)+str.substring(str.length()-1).toUpperCase());
    }
    public static void main(String args[]){
        Stringop obj=new Stringop("I am feeling great in java Exam");
        Stringop obj1=new Stringop("jay xavier");
        obj.operation();
        obj1.operation1();
    }
}
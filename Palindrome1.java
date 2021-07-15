import java.util.Scanner;
public class Palindrome1 {
    String str,str1="";
    Scanner scan=new Scanner(System.in);
    void Input(){
        System.out.println("****without STRING Buffer Class****");
        System.out.println("Enter the String to check whether it is palindrome or not:");
        str= scan.nextLine();
    }
    void Operation(){
       for (int i=str.length()-1;i>=0;i--){
           str1=str1+str.charAt(i);
       }
        System.out.println("Reverse of that String:"+str1);
    }
    void Output(){
        if (str1.equalsIgnoreCase(str)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    void Operation1(){
        String str;
        System.out.println("****with STRING Buffer Class****");
        System.out.println("Enter the String to check for palindrome");
        str= scan.nextLine();
        String sb=new StringBuffer(str).reverse().toString();
        System.out.println("Reverse:"+sb);
        if(str.equalsIgnoreCase(sb)){
            System.out.println("It is palindrome");
        }else
            System.out.println("It is not a palindrome");
    }
    public static void main(String []args){
        Palindrome1 obj= new Palindrome1();
        obj.Input();
        obj.Operation();
        obj.Output();
        obj.Operation1();
    }
}

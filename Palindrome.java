import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str;
        System.out.println("Enter the String to check for palindrome");
        str= scan.nextLine();
        String sb=new StringBuffer(str).reverse().toString();
        System.out.println("Reverse:"+sb);
        if(str.equalsIgnoreCase(sb)){
            System.out.println("It is palindrome");
       }else
            System.out.println("It is not palindrome");

    }
}

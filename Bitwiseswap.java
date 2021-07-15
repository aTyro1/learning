import java.util.Scanner;
public class Bitwiseswap {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the First number");
        n1=scan.nextInt();
        System.out.println("Enter the second number");
        n2= scan.nextInt();
        System.out.println("Before 'XOR' operation numbers are:");
        System.out.println("num1="+n1+" "+"num2="+n2);
        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        System.out.println("After 'XOR' operation swaped numbers are:");
        System.out.println("num1="+n1+" "+"num2="+n2);
    }
}

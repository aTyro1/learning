import java.util.Scanner;
public class Conversion {
    public static void main(String args[]){
    int number,choice;
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 3 Digit Decimal number:");
        number=scan.nextInt();
        System.out.println("Enter the Choice");
        System.out.println("Press '1' to find its Binary Equivalent:");
        System.out.println("Press '2' to find its Octal Equivalent:");
        System.out.println("Press '3' to find its Hexadecimal Equivalent:");
        choice=scan.nextInt();
        while (choice!=1&&choice!=2&&choice!=3)
        {
            System.out.println("Try Again:");
            choice=scan.nextInt();
        }
        switch (choice){
            case 1:
                System.out.println("Binary is:"+Integer.toBinaryString(number));
                break;
            case 2:
                System.out.println("Octal is:"+Integer.toOctalString(number));
                break;
            case 3:
                System.out.println("Hexadecimal is:"+Integer.toHexString(number));
                break;
            default:
                System.out.println("Oops Wrong Choice!!");
        }
    }
}

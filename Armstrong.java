import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]) {
        int num=0,cube=0,n1=0,sum=0,temp=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the three digit number");
           num=scan.nextInt();
           temp=num;
           while(num!=0)
        {
            n1=num%10;
            cube=(int)Math.pow(n1,3);
            sum=sum+cube;
            num=num/10;
        }
        if (sum==temp)
        {
            System.out.println("It is Armstrong number");
        }else
            System.out.println("It is not a Armstrong number");
    }
}

import java.util.Scanner;
public class Compoundinterest {
    int t,n,power;
    double p,r,ci;
    Scanner scan = new Scanner(System.in);
    void getdata(){
        System.out.println("Enter the value of Principle");
        p = scan.nextDouble();
        System.out.println("Enter the value of Rate");
        r = scan.nextDouble();
        System.out.println("Enter the value of time");
        t = scan.nextInt();
        System.out.println("Enter the number of times interest applied per time period");
        n = scan.nextInt();
    }
    void calc(){
        power=n*t;
        ci = (double) Math.pow(p * (1 + (r / n)),power);
    }
    void disp(){
        calc();
        System.out.println("Value of principle:" + p);
        System.out.println("Value of Rate:" + r);
        System.out.println("Value of Time:" + t);
        System.out.println("Enter the number of times interest applied per time period:" + n);
        System.out.println("Value of Compound interest:" + ci);
    }
    public static void main(String args[]){
        Compoundinterest myobj=new Compoundinterest();
        myobj.getdata();
        myobj.disp();
    }
}

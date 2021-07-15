import java.util.Scanner;
public class Simpleintrest {
    int r,t;
    double p,si;
    Scanner sc= new Scanner(System.in);
     void Getdata(){
         System.out.println("Enter the values of p,r,t");
         p=sc.nextDouble();
         r=sc.nextInt();
        t=sc.nextInt();
    }
      void Calc(){
         si=(p*r*t)/100;
    }
      void Display(){
         Calc();
        System.out.println("Rate=" + r);
        System.out.println("Time=" + t);
        System.out.println("Principle=" + p);
        System.out.println("simple interest=" + si);
    }
    public static void main(String[] args){
        Simpleintrest myobj=new Simpleintrest();
        myobj.Getdata();
        myobj.Display();
    }
}

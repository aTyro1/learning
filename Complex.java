import java.util.Scanner;
public class Complex {
    int real,img;
    Complex(){real=0;img=0;}
    Complex(int x,int y){
        real=x;
        img=y;
    }
    void add(Complex x,Complex y){
        real=x.real+y.real;
        img=x.img+y.img;
    }
    void  show(){
        System.out.println("Sum of complex is:"+real+"+i"+img);
    }
    public static void main(String args[]){
        int x,y;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 'Real' and 'Imaginary' part of a Complex number:");
        x= scan.nextInt();y= scan.nextInt();
        Complex c1=new Complex(x,y);
        Complex c2=new Complex(5,9);
        Complex c3=new Complex();
        c3.add(c1,c2);
        c1.show();
        c2.show();
        c3.show();
      /*  System.out.println("Value of object c1:"+c1);
        System.out.println("Value of object c2:"+c2);
        System.out.println("Value of object c3:"+c3);*/
    }
}


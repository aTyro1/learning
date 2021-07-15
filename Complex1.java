import java.util.Scanner;
public class Complex1 {
        int real, img;
        Complex1() { real =0; img =0;}
        Complex1(int x, int y) {
            real =x;
            img =y;
        }
        void add(Complex1 x,Complex1 y){
            this.real= x.real +y.real;
            this.img = x.img+ y.img;
        }
        void show(){
            //System.out.println("current object is "+ this);
            System.out.println("complex number is"+ this.real + " +i"+ this.img);
        }
    }
    class UseCom {
        public static void main(String args[]) {
            int x,y,i,j;
            Scanner scan =new Scanner(System.in);
            System.out.println("Enter the 'Real' and 'Imaginary' part of 1st Complex number:");
            x=scan.nextInt(); y= scan.nextInt();
            System.out.println("Enter the 'Real' and 'Imaginary' part of 2nd Complex number:");
            i=scan.nextInt(); j= scan.nextInt();
            Complex1 c1 = new Complex1(x,y);
            Complex1 c2 = new Complex1(i,j);
            Complex1 c3 = new Complex1();
           /* System.out.println("value of c1 is "+ c1);
            System.out.println("value of c2 is "+ c2);
            System.out.println("value of c3 is "+ c3);*/
            c3.add(c1,c2);
            c1.show();
            c2.show();
            c3.show();
        }
    }


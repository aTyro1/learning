import java.util.Scanner;
public class Inheritanceconstruct {
int length,breadth;
Inheritanceconstruct(int a,int b){
    this.length=a;
    this.breadth=b;
}
int Arearectangle(){
    return length*breadth;
}
}
class square extends Inheritanceconstruct{
    int side;
    square(int a,int b,int c){
        super(a,b);
        this.side=c;
    }
    int Areasquare(){
        return side*side;
    }
}
 class circle extends Inheritanceconstruct{
    double radius;
    circle(int a, int b, double d){
        super(a,b);
        this.radius=d;
    }
    double Areacircle(){
        return 3.14*radius*radius;
    }
     public static void main(String args[]){
         int j,i,k;
         double l;
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter the values");
         System.out.println("Enter the length of the rectangle:");
         i=scan.nextInt();
         System.out.println("Enter the breadth of the rectangle:");
         j= scan.nextInt();
         System.out.println("Enter the side of the square:");
         k= scan.nextInt();
         System.out.println("Enter the radius of the circle");
         l= scan.nextDouble();
         square obj1=new square(i,j,k);
         circle obj=new circle(i,j, l);
         System.out.println("************Calculated AREAS***********");
         System.out.println("Area of Rectangle:"+obj.Arearectangle());
         System.out.println("Area of Square:"+obj1.Areasquare());
         System.out.println("Area of Circle:"+obj.Areacircle());
     }
}


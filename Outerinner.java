import java.util.Scanner;
public class Outerinner {
int x,y;
Outerinner(int a,int b){
    x=a;
    y=b;
}
class Inner{
    void Add(){
        System.out.println("Addition="+(x+y));
    }
    void Multiply(){
        System.out.println("Multiplication="+(x*y));
    }
}
class Inner1{
    int Subtract(){
        return x-y;
    }
    int Divide(){
        return x/y;
    }
}
public static void main(String[] args){
    int i,j;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    i=scan.nextInt();j= scan.nextInt();
    Outerinner obj=new Outerinner(i,j);
    Outerinner.Inner obj1=obj.new Inner();
    obj1.Add();
    obj1.Multiply();
    Outerinner.Inner1 obj2=obj.new Inner1();
    obj2.Divide();
    obj2.Subtract();
    System.out.println("Subtraction="+obj2.Subtract());
    System.out.println("Divide="+obj2.Divide());
}
}



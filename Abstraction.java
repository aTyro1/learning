import java.util.Scanner;
abstract class Abstraction {
    int Num1,Num2;
    abstract int Add();
    abstract int Subtract();
    int Divide(){
          return Num1/Num2;
    }
    int Multiply(){
        return Num1*Num2;
    }
}
class derived extends Abstraction{
   derived(int x,int y){
       Num1=x;
       Num2=y;
   }
    @Override
    int Add() {
        return Num1+Num2;
    }

    @Override
    int Subtract() {
        return Num1-Num2;
    }

    @Override
    int Divide() {
        return super.Divide();
    }

    @Override
    int Multiply() {
        return super.Multiply();
    }
}
class FinalAbstraction{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the two numbers:");
        System.out.println("Ist number:");
        x= scan.nextInt();
        System.out.println("IInd number:");
        y= scan.nextInt();
        derived obj=new derived(x,y);
        obj.Add();
        obj.Subtract();
        obj.Multiply();
        obj.Divide();
        System.out.println("Addition of the two numbers are:"+obj.Add());
        System.out.println("Subtraction of the two numbers are:"+obj.Subtract());
        System.out.println("Multiplication of the two numbers are:"+obj.Multiply());
        System.out.println("Division of the two numbers are:"+obj.Divide());
    }
}
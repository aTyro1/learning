import java.util.Scanner;
interface ArithematicClass{
    public void Add();
    public void Subtract();
    public void Multiply();
    public void Divide();
}
interface LogicalClass{
    public void Logic();
}
interface RelationalClass{
    public void Relation();
}
class TestAll implements ArithematicClass,LogicalClass,RelationalClass{
    int Num1,Num2;
    TestAll(int x,int y){
        Num1=x;
        Num2=y;
    }
    @Override
    public void Add() {
        System.out.println("Addition="+(Num1+Num2));
    }
    @Override
    public void Subtract() {
        System.out.println("Subtraction="+(Num1-Num2));
    }
    @Override
    public void Multiply() {
        System.out.println("Multiplication="+(Num1*Num2));
    }
    @Override
    public void Divide() {
        System.out.println("Division="+(Num1/Num2));
    }
    @Override
    public void Logic() {
        System.out.println("AND operation="+(Num1&Num2));
        System.out.println("OR operation="+(Num1|Num2));
        System.out.println("XOR operation="+(Num1^Num2));
    }
    @Override
    public void Relation() {
        if (Num1<Num2){
            System.out.println(Num2+" "+"is Greater than"+" "+Num1);
        }
        else if (Num1==Num2){
            System.out.println(Num2+" "+"is Equal to"+" "+Num1);
        }
        else {
            System.out.println(Num1+" "+"is Greater than"+" "+Num2);
        }
    }
     public static void main(String args[]){
         Scanner scan=new Scanner(System.in);
         int x,y;
         System.out.println("Enter the two numbers:");
         System.out.println("Ist number:");
         x= scan.nextInt();
         System.out.println("IInd number:");
         y= scan.nextInt();
        TestAll obj=new TestAll(x,y);
         obj.Add();
         obj.Subtract();
         obj.Multiply();
         obj.Divide();
         obj.Logic();
         obj.Relation();
     }
}
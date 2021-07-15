import java.util.Scanner;
interface Operations {
    public void Add();
    public void Subtract();
    public void Multiply();
    public void Divide();
    public void Logic();
    public void Relation();
}
class ArithematicOperation implements Operations{
    int Num1,Num2;
    ArithematicOperation(int x,int y){
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
    public void Logic(){

    }
    @Override
    public void Relation() {

    }
}
class LogicalOperation implements Operations{
    int Num1,Num2;
    LogicalOperation(int x,int y){
        Num1=x;
        Num2=y;
    }
    @Override
    public void Add() {

    }
    @Override
    public void Subtract() {

    }
    @Override
    public void Multiply() {

    }
    @Override
    public void Divide() {

    }
    @Override
    public void Logic() {
        System.out.println("AND operation="+(Num1&Num2));
        System.out.println("OR operation="+(Num1|Num2));
        System.out.println("XOR operation="+(Num1^Num2));
    }
    @Override
    public void Relation() {

    }
}
class RelationalOperation implements Operations{
    int Num1,Num2;
    RelationalOperation(int x,int y){
        Num1=x;
        Num2=y;
    }
    @Override
    public void Add() {

    }
    @Override
    public void Subtract() {

    }
    @Override
    public void Multiply() {

    }
    @Override
    public void Divide() {

    }
    @Override
    public void Logic() {

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
}
class FinalizeOperations{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the two numbers:");
        System.out.println("Ist number:");
        x= scan.nextInt();
        System.out.println("IInd number:");
        y= scan.nextInt();
        ArithematicOperation obj1=new ArithematicOperation(x,y);
        LogicalOperation obj2=new LogicalOperation(x,y);
        RelationalOperation obj3=new RelationalOperation(x,y);
        obj1.Add();
        obj1.Subtract();
        obj1.Multiply();
        obj1.Divide();
        obj2.Logic();
        obj3.Relation();
    }
}

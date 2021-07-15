import java.util.*;
public class StackOperation1 {
    int[] Num=new int[6];
    int num;
    Scanner scan=new Scanner(System.in);
    Stack<Integer> Elementin=new Stack<Integer>();
    void pushElement(){
        System.out.println("<------PUSH OPERATION------>");
        System.out.println("Enter the Elements to put it inside the Stack:");
        for (int i=1;i<Num.length;i++){
            System.out.println("Enter the"+" "+i+" "+"Element=");
            Num[i]= scan.nextInt();
            Elementin.push(Num[i]);
        }
        System.out.println("Elements in the Stack:"+Elementin);
    }
    void popElement(){
        System.out.println("<------POP OPERATION------>");
        System.out.println("Enter the number of times to pop the element from the stack:");
        num= scan.nextInt();
        for (int i=0;i<num;i++){
            Elementin.pop();
        }
        System.out.println("Element in the Stack after the pop Operation:"+Elementin);
    }
    void displayElement(){
        System.out.println("Element in the Stack after the pop Operation:"+Elementin);
    }
}
class stack2 extends StackOperation1{
    int m,n,ch;
    void pushElement1(){
        super.pushElement();
        System.out.println("Do you want to add any other Element");
        System.out.println("Press-'1' to Add!!:");
        System.out.println("Press-'2' to jump Away:");
        ch= scan.nextInt();
        while (ch!=1&&ch!=2){
            System.out.println("Oops not this Try Again:");
            ch= scan.nextInt();
        }
        if (ch==1){
            System.out.println("Enter the Elements to put it inside the Stack:");
            m= scan.nextInt();
            Elementin.push(m);
        }
        else if (ch==2){
            System.out.println("Final Elements in Stack:"+Elementin);
        }
        if (Elementin.size()>5){
            throw new ArithmeticException("Stack size is '5' can't take extra Element"+":Stack Overflow:");
        }
    }
    void popElement1(){
        super.popElement();
        ch=0;
        System.out.println("Do you want to pop the Elements Again:");
        System.out.println("Press-'1' to pop!!:");
        System.out.println("Press-'2' to jump Away:");
        ch= scan.nextInt();
        while (ch!=1&&ch!=2){
            System.out.println("Oops not this Try Again:");
            ch= scan.nextInt();
        }
        if (ch==1){
            System.out.println("Enter the number of times to pop the element from the stack:");
            n= scan.nextInt();
            while (n!=0&&n!=1&&n!=2&&n!=3&&n!=4&&n!=5){
                throw new ArithmeticException("Stack doesn't contain"+" "+n+" "+"elements"+" "+"Stack Underflow:");
            }
            for (int i=0;i<n;i++){
                Elementin.pop();
            }
        }
        else if (ch==2){
            System.out.println("Final Stack after the pop Operation:"+Elementin);
        }

    }
    @Override
    void displayElement() {
        super.displayElement();
    }
}
class FinalStackOperation1{
    public static void main(String args[]){
        stack2 obj=new stack2();
        obj.pushElement1();
        obj.popElement1();
        obj.displayElement();
    }
}

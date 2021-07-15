import java.util.*;
public class StackOperation {
   int[] Num=new int[6];
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
}
class Stack1 extends StackOperation{
   int num;
   void popElement() {
      super.pushElement();
      System.out.println("<------POP OPERATION------>");
      System.out.println("Enter the number of times to pop the element from the stack:");
      num= scan.nextInt();
      while (num!=0&&num!=1&&num!=2&&num!=3&&num!=4&&num!=5){
         System.out.println("Stack doesn't contain"+" "+num+" "+"elements"+" "+"Stack Underflow:");
         System.out.println("Try Again:");
         num= scan.nextInt();
      }
      for (int i=0;i<num;i++){
         Elementin.pop();
      }
   }
   void displayElement(){
      System.out.println("Element in the Stack after the pop Operation:"+Elementin);
   }
}
class FinalStackOperation{
   public static void main(String[] args){
      Stack1 obj=new Stack1();
      obj.popElement();
      obj.displayElement();
   }
}


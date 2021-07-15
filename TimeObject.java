import java.util.Scanner;
public class TimeObject {
    int hrs1,hrs2;
    int min1,min2;
    TimeObject(int x,int y,int i,int j){
        hrs1=x;
        hrs2=y;
        min1=i;
        min2=j;
    }
    void sum(){
        int sum1=hrs1+hrs2;
        int sum2=min1+min2;
        if(sum1>=12&&sum2>=60){
            sum1-=12;
            sum2-=60;
            System.out.println("Time="+sum1+":"+sum2);
        }else{
            System.out.println("Time="+sum1+":"+sum2);
        }
    }
    public static void main(String args[]){
        int hrs1,hrs2;
        int min1,min2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 1st time int x-Hours ,y-Minutes:");
        hrs1= scan.nextInt();min1= scan.nextInt();
        System.out.println("Enter the 2nd time int x-Hours ,y-Minutes:");
        hrs2= scan.nextInt();min2= scan.nextInt();
        TimeObject t1=new TimeObject(hrs1,hrs2,min1,min2);
        TimeObject t2=new TimeObject(5,8,32,48);
        System.out.println("Input taken by console:");
        t1.sum();
        System.out.println("Input taken by constructor:");
        t2.sum();
    }
}

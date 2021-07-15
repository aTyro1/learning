import java.util.Scanner;
public class ThreadOperation extends Thread{
   int num;
    Scanner scan=new Scanner(System.in);
    void getdata(){
        System.out.println("Enter the Number to print its table:");
        num=scan.nextInt();
    }
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
    public static void main(String args[]){
        ThreadOperation t1=new ThreadOperation();
        ThreadOperation t2=new ThreadOperation();
        t1.getdata();
        t2.getdata();
        System.out.println("<------*****------>");
        t1.setPriority(7);
        t1.run();
        System.out.println("<------*****------>");
        t2.setPriority(4);
        t2.run();
        System.out.println("Priority of Thread 't1':"+t1.getPriority());
        System.out.println("Priority of Thread 't2':"+t2.getPriority());
    }
}


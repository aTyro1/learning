/*A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.
Threads are independent. If there occurs exception in one thread, it doesn't affect other threads. It uses a shared memory area.*/

/*If the class implements the Runnable interface, the thread can be run by passing an instance of the class
to a Thread object's constructor and then calling the thread's start() method:*/
public class ThreadExample1 implements Runnable{
    public  void run(){
        System.out.println("\n Implementing Thread class by Runnable interface!!");
    }
    public static void main(String args[]){
        // Method-1:
        ThreadExample1 obj=new ThreadExample1();
        Thread t=new Thread(obj);
        // Method-2:
        Thread t1=new Thread(new ThreadExample1());
        t.run();
        t1.run();
    }
}


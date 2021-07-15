/*Threads allows a program to operate more efficiently by doing multiple things at the same time.
Threads can be used to perform complicated tasks in the background without interrupting the main program.*/

/*There are two ways to create a thread:-
(1).It can be created by extending the Thread class and overriding its run() method:
(2).Another way to create a thread is to implement the Runnable interface:*/
public class ThreadExample extends Thread{
    public void run(){
        System.out.println("\n This is my first Thread!!!");
    }
    public static void main(String args[]){
        ThreadExample obj=new ThreadExample();
        obj.run();
    }
}

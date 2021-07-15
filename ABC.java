import java.util.Scanner;
public class ABC{
    int a,b,c;
    ABC(int x,int y,int z){
        this.a=x;
        this.b=y;
        this.c=z;
    }
    ABC(ABC j,ABC i){
        this.a=j.a+ i.a;
        this.b=j.b+ i.b;
        this.c=j.c+ i.c;
    }
    void display(){
        System.out.println("Value of all the three integers:"+this.a+","+this.b+","+this.c);
    }
   public static void main(String args[]){
       Scanner scan=new Scanner(System.in);
       int a,b,c;
       System.out.println("Enter the three integers:");
       a= scan.nextInt();b= scan.nextInt();c= scan.nextInt();
       ABC c1=new ABC(5,6,9);
       ABC c2=new ABC(a,b,c);
       ABC c3=new ABC(c1,c2);
       System.out.println("Value given by constructor:");
       c1.display();
       System.out.println("Value given by console:");
       c2.display();
       System.out.println("Added values of console and constructr:");
       c3.display();
   }
}

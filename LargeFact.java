import java.util.Scanner;
public class LargeFact {
    int num1,num2,num3,num4,temp=0;
    long temp1=0;
    Scanner scan=new Scanner(System.in);
    void Getdata(){
        System.out.println("Enter any four Number to find Greatest among them:-");
        System.out.println("Number 1:");
        num1=scan.nextInt();
        System.out.println("Number 2:");
        num2=scan.nextInt();
        System.out.println("Number 3:");
        num3=scan.nextInt();
        System.out.println("Number 4:");
        num4=scan.nextInt();
    }
    void Greater(){
        int x=Math.max(num1,num2);
        int y=Math.max(num3,num4);
        int g=Math.max(x,y);
        System.out.println("Greatest among them:"+g);
        temp=g;
        temp1=temp;
    }
    void fact() {
        int f = 1;
        for (int i =1; i<=temp; i++) {
            f =f*i;
        }
        System.out.println("Factorial of that number:" +temp+"\t in 'int' data type is:" +f);
    }
     void ltype(){
        long s=1;
        for(long z=1;z<temp1;z++){
            s=s*z;
        }
        System.out.println("Factorial of that number:" +temp1+"\t in 'long' data type is:" +s);
    }
    public static void main(String args[]){
        LargeFact x=new LargeFact();
        x.Getdata();
        x.Greater();
        x.fact();
        x.ltype();
    }
}

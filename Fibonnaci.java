import java.util.Scanner;
public class Fibonnaci {
    int num,i,n1=0,n2=1,n3=0;
    Scanner scan=new Scanner(System.in);
    void getdata(){
        System.out.println("Enter the number:");
        num= scan.nextInt();
    }
    void calc(){
        for(i=2;i<num;i++)
        {
            if (num==1){
                System.out.println(1);
                break;
            }
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
    void disp(){
        calc();
        System.out.println("Number for fibonnaci series:"+num);
        System.out.println("Fibonnaci series:"+n3);
    }
    public static void main(String args[]){
        Fibonnaci x=new Fibonnaci();
        x.getdata();
        x.disp();
    }
}

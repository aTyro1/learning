import java.util.Scanner;
public class MaxiMin {
    int firstint,secondint,thirdint;
    double firstdouble,seconddouble,thirddouble;
    char firstchar,secondchar,thirdchar;
    MaxiMin(int x,int y, int z){
        firstint=x;secondint=y;thirdint=z;
        int max=Math.max(x,y);
        int max2=Math.max(max,z);
        System.out.println("Maximum among all the three Integers is:"+max2);
    }
    MaxiMin(double x,double y,double z){
        firstdouble=x;seconddouble=y;thirddouble=z;
        double min=Math.min(x,y);
        double min2=Math.min(min,z);
        System.out.println("Minimum among all the three Doubles is:"+min2);
    }
    MaxiMin(char x,char y,char z){
        firstchar=x;secondchar=y;thirdchar=z;
        char secmax;
        if (x>y&&x>z){
            if(y>z){
                secmax=y;
            }else{
                secmax=z;
            }
        }
        else if (y>x&&y>z){
            if (x>z){
                secmax=x;
            }else{
                secmax=z;
            }
        }
        else{
            if(y>x){
                secmax=y;
            }
            else{
                secmax=x;
            }
        }
        System.out.println("Second largest character among all is:"+secmax);
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        double i,j,k;
        char x,y,z;
        System.out.println("Enter the three integers:");
        a= scan.nextInt();b= scan.nextInt();c= scan.nextInt();
        System.out.println("Enter the three doubles:");
        i= scan.nextDouble();j= scan.nextDouble();k= scan.nextDouble();
        System.out.println("Enter the three characters:");
        x=scan.next().charAt(0);y=scan.next().charAt(0);z=scan.next().charAt(0);
        //MaxiMin m1=new MaxiMin(a,b,c);
       // MaxiMin m2=new MaxiMin(i,j,k);
       // MaxiMin m3=new MaxiMin(x,y,z);
        new MaxiMin(a,b,c);
        new MaxiMin(i,j,k);
        new MaxiMin(x,y,z);
    }
}

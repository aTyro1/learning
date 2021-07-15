import java.util.Scanner;
public class PrimeFactors {
    int number,sum=0;
   Scanner scan=new Scanner(System.in);
   void getdata(){
       System.out.println("Enter the number to find its prime factors:");
       number= scan.nextInt();
   }
    void calc(){
        for (int i=2;i<number;i++) {
            while (number%i==0) {
                System.out.println(i);
                sum=sum+i;
                number = number / i;
            }
        }
        if (number>2){
            System.out.println(number);
            sum=sum+number;
        }
   }
    void sum(){
        System.out.println("Sum of all its prime factors is:"+sum);
    }
    public static void main(String args[]){
        PrimeFactors x=new PrimeFactors();
        x.getdata();
        x.calc();
        x.sum();
    }
}


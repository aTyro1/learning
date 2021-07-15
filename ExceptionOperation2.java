import java.util.Scanner;
public class ExceptionOperation2 {
    public static void main(String args[]){
        int[] arr=new int[5],m=new int[5];
        Scanner scan=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Enter any five Elements");
            m[i]=scan.nextInt();
            if(m[i]%2==0){
                arr[i]=m[i];
            }else {
                throw new ArithmeticException("Element is Odd!! Only Even Element Allowed:");
            }
        }
        System.out.println("Final Elements in the Array:");
        for (int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}

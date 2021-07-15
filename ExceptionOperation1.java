import java.util.*;
public class ExceptionOperation1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        int find,pos,i;
        try {
            for (i = 0; i <= 5; i++) {
                System.out.println("Enter the Elements:");
                arr[i] = scan.nextInt();
            }
        }
         catch (ArithmeticException e){
             System.out.println("More elements than the required ones");
         }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Elements are greater than the size of array:");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Elements are greater than the size of string:");
        }

        finally {
            System.out.println("Execution Terminated:");
        }
        System.out.println("Final Elements in tha array:");
        for (i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter the Elements to find its position in the array:");
        find= scan.nextInt();
        while (find!=arr[0]&&find!=arr[1]&&find!=arr[2]&&find!=arr[3]&&find!=arr[4]){
            System.out.println("Element not present in the array Try Again!!:");
            find= scan.nextInt();
        }
        pos= Arrays.binarySearch(arr,find);
        System.out.println("Position of the Element:"+pos);
    }
}

import java.util.Scanner;
public class StringOperation1 {
    public static void main(String args[]){
        String str;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Email id");
        str= scan.nextLine();
        if( str.indexOf('@')!=-1&&str.indexOf("@.")!=-1&&str.indexOf('@')>0){
            System.out.println("valid");
        }else
            System.out.println("invalid");
    }
}

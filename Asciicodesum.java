import java.util.Scanner;
public class Asciicodesum {
        String str;
        int sum,inum;
        Scanner scan =new Scanner(System.in);
        void Input(){
            System.out.println("Enter the String of Characters:");
            str= scan.nextLine();
        }
        void Operation(){
            for (int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                inum=str.charAt(i);
                    sum+=inum;
                System.out.println("ASCII code of"+" "+ch+":"+inum);

            }
        }
        void Output(){
            System.out.println("Sum of all ASCII Code of all Characters in the string:"+sum);
        }
        public static void main(String []args){
            Asciicodesum obj=new Asciicodesum();
            obj.Input();
            obj.Operation();
            obj.Output();
        }
}

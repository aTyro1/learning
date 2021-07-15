import java.util.Scanner;
public class Capital {
    String str;
    char[] ch;
    boolean foundSpace=true;
    void getdata(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String:");
        str=scan.nextLine();
    }
    void operation() {
        ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
         if (Character.isLetter(ch[i])){
             if (foundSpace){
                 ch[i]=Character.toUpperCase(ch[i]);
                 foundSpace=false;
             }
         }else {
             foundSpace=true;
         }
        }
        str=String.valueOf(ch);
        System.out.println("Regenerated String:" + str);
    }
    public static void main(String args[]){
        Capital obj=new Capital();
        obj.getdata();
        obj.operation();
    }
}


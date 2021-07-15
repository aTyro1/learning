import java.util.Scanner;
public class OccurenceRemove {
    String str,str1,con;
    char ch;
    int count=0;
    Scanner scan =new Scanner(System.in);
    void getdata(){
        System.out.println("Enter the string to remove a character from it:");
        str= scan.nextLine();
        System.out.println("Enter the character to remove from a string:");
        ch=scan.next().charAt(0);
    }
    void operation(){
        for (int x=0;x<str.length();x++) {
                if (ch == str.charAt(x)) {
                    count++;
                    con = String.valueOf(ch);
                    str1 = str.replace(con, "");
                    str.compareTo(str1);
                }
        }
        System.out.println("Number of occurence:"+count);
        System.out.println("Updated string:"+str1);
    }
    public static void main(String args[]){
        OccurenceRemove obj=new OccurenceRemove();
        obj.getdata();
        obj.operation();
    }
}

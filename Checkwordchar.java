import java.util.Scanner;
public class Checkwordchar {
    String str;
    char[] ch;
    int count=0,x,i;
    Scanner scan=new Scanner(System.in);
    void input(){
        System.out.println("Enter the String:");
        str= scan.nextLine();
    }
    void charoperation(){
        ch=str.toCharArray();
        for (i=0;i<ch.length;i++) {
            for(x=0;x<str.length();x++){
                if (ch[i]==str.charAt(x)){
                    count++;
                }
            }
            System.out.println("Number of character" + " " + ch[i] + " " + "in string=" + count);
            count = 0;
        }
    }
    void wordoperation(){
        count=1;
        char chr=' ';
        for (int j=0;j<str.length();j++){
            if (str.charAt(j)==chr){
                count++;
            }
        }
        System.out.println("Number of words in string:"+count);
    }
}
class Final{
    public static void main(String[] args){
        Checkwordchar obj=new Checkwordchar();
        obj.input();
        obj.charoperation();
        obj.wordoperation();
    }
}

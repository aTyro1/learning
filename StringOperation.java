import java.util.Scanner;
public class StringOperation {
    public static void main(String args[]) {
        int count=0,j,temp=0,x;
        String str="Suratia Naimesh kumar Bhupat Singh Baruchwala at patna";
        System.out.println("String is:"+str);
        System.out.println("Length of the string:"+str.length());
        System.out.println("Character  1st index (i) in given string:"+str.indexOf('i'));
        System.out.println("Character Last index (i) in given string:"+str.lastIndexOf('i'));
        System.out.println("Substring 'pat' Ist index:"+str.indexOf("pat"));
        System.out.println("Substring 'pat' last index:"+str.lastIndexOf("pat"));
        temp=str.length();
        for (j=0;j<temp;j++){
            if('i'==str.charAt(j)){
                   count++;
               }
        }
        System.out.println("Occurrence of character 'i' in string is:"+count);
        count=0;
        x=str.indexOf("pat");
        while (x!=-1){
            count++;
            x=str.indexOf("pat",x+1);
        }
        System.out.println("Occurrence of substring 'pat' in string is:"+count);
    }
}

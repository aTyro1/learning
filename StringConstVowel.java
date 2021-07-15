import java.util.*;
    public class StringConstVowel{
        public static void main(String[] args){
            String str,str3;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the String:");
            str=scan.nextLine();
            str3=str;
            String str1= new StringBuffer(str).reverse().toString();
            System.out.println("Reverse String:"+str1);
            if(str.equalsIgnoreCase(str1)){
                System.out.println("It is palindrome:");
                char ch[]=str3.toCharArray();
                for(int i=0;i<str3.length();i++){
                    if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')||(ch[i]=='A')
                            ||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U')){
                        ch[i]=Character.toUpperCase(ch[i]);
                        str3=String.valueOf(ch);
                    }
                }
                System.out.println("String having all vowel's in Upper case:");
                System.out.println(str3);
            }else{
                System.out.println("It is not a palindrome:");
                char ch[]=str3.toCharArray();
                for(int i=0;i<str3.length();i++){
                    if((ch[i]!='a')&&(ch[i]!='e')&&(ch[i]!='i')&&(ch[i]!='o')&&(ch[i]!='u')&&(ch[i]!='A')
                            &&(ch[i]!='E')&&(ch[i]!='I')&&(ch[i]!='O')&&(ch[i]!='U')){
                        ch[i]=Character.toUpperCase(ch[i]);
                        str3=String.valueOf(ch);
                    }
                }
                System.out.println("String having all consonant's in Upper case:");
                System.out.println(str3);
            }
        }
    }


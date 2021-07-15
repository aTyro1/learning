import java.util.Scanner;
public class StringPassword {
    String firstname,middlename,lastname;
    String str,str1,str3;
    String input;
    int age,temp=0;
    Scanner scan=new  Scanner(System.in);
    void TakeData(){
        System.out.println("Enter the first name:");
        firstname= scan.nextLine();
        System.out.println("Do you have middle name;(Y/N):");
        input=scan.nextLine();
        if(input.equals("Y")){
            System.out.println("Enter the middle name:");
            middlename=scan.nextLine();
        }
        System.out.println("Enter the last name:");
        lastname= scan.nextLine();
        System.out.println("Enter the age:");
        age= scan.nextInt();
    }
    void Operation(){
             int i=0,j=0,k=0;
             i=firstname.length();
             i/=2;
            temp=i;
            str=firstname.substring(temp,temp+2);
            temp=0;
            j=lastname.length();
            j/=2;
            temp=j;
            str1=lastname.substring(temp,temp+2);
            if (middlename!=null){
                temp=0;
                k=middlename.length();
                k/=2;
                temp=k;
                str3=middlename.substring(temp,temp+2);
                System.out.println("Generated password="+str+str3+str1+'_'+age*100);
           }else{
                System.out.println("Generated password="+str+str1+'_'+age*100);
            }
    }
    public static void main(String args[]){
        StringPassword obj=new StringPassword();
        obj.TakeData();
        obj.Operation();
    }
}

public class Reverpal {
   int number;
   int temp=0,num=0,reversed=0;
    Reverpal(int n){
        number=n;
    }
    void calc(){
        num=number;
        for(;number!=0;number/=10) {
            int rem = number % 10;
            reversed = reversed * 10 + rem;
        }
        System.out.println("Reverse of that number:"+reversed);
        temp=reversed;
    }
    void disp(){
        calc();
        if(temp==num){
            System.out.println("It is a palindrome number");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    public static void main(String args[]){
        Reverpal x=new Reverpal(8709078);
        x.disp();
    }
}

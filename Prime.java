import java.util.Scanner;
public class Prime {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num, flag = 0,x;
        System.out.println("Enter the number:");
        num = scan.nextInt();
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println("It is not a prime number.");
                flag = 1;
                break;
            }
        }
            if (flag == 0) {
                System.out.println("It is a prime number.");
            }
        for (x=num;x<=10000;x++){
                if (x%2!=0&&x%3!=0&&x%5!=0&&x%7!=0&&x%9!=0) {
                    System.out.println(x);
                }
            }
        }
    }

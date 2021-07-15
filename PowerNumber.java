import java.util.Scanner;
public class PowerNumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num, exp, i;
        int count = 0, temp = 0,j=0;
        System.out.println("Enter the base of the number:");
        num = scan.nextInt();
        temp = num;
        System.out.println("Enter the exponent of that number:");
        exp = scan.nextInt();
        while (num != 1) {
            num /= exp;
            count++;
        }
        System.out.println("power:" + count);
        System.out.println("Combinations of that number are:");
        for (i = 2; i <= temp; i++) {
            j=temp;
            count=0;
            if (j % i == 0) {
                while (j != 1 &&j!=0) {
                    j /= i;
                    count++;
                }
                if (j == 1)
                    System.out.println("Combinations:" + i + "^" + count);
            }
        }
    }
}


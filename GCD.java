public class GCD {
        public static void main(String[] args) {
            int n1 = 153, n2 = 81;
            while(n1 != n2)
            {
                if(n1 > n2)
                    n1 -= n2;
                else
                    n2 -= n1;
            }
            System.out.println("Greatest common divisor:= " + n1);
        }
    }


public class ExceptionOperation {
    public static void main(String args[]) {
        int a[]={5,10}; int b=5;
        try { int x=a[1]/0; }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }
        catch(ArithmeticException e) {
            System.out.println("Division by zero Error");
        }
        catch(ArrayStoreException e) {
            System.out.println("Wrong data type");
        }
        finally { System.out.println("I am always here");
        }
    }
}

public class QuadraticEq {
    double first,second,third;
    double disc;
    QuadraticEq(double x,double y,double z){
        first=x;
        second=y;
        third=z;
    }
      void calc(){
        disc=(second*second)-(4*first*third);
        double sq=0.0;
        sq=Math.sqrt(disc);
        double a=(-second+sq)/(2*first);
        double b=(-second-sq)/(2*first);
        System.out.println("Roots of the quadratic Eq. are:" +a+ "\t"  +b);
    }
    void disp(){
        calc();
        if(disc>0){
            System.out.println("Roots are Positive and real");
        }else if(disc<0){
            System.out.println("Roots are Negative and complex");
        }else if(disc==0)
        {
            System.out.println("Roots are real and unequal");
        }
    }
      public static void main(String args[]){
        QuadraticEq x=new QuadraticEq(15,68,3);
        x.disp();
      }
}

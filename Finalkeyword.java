public class Finalkeyword {
    final int val1=40;
    int val2=30;
    final void Add(){
        System.out.println("Addition="+(val1+val2));
    }
     int Subtract(){
        return val1-val2;
     }
}
final class check extends Finalkeyword{
    @Override
    int Subtract() {
        //val1=50;
        val2=60;
        return super.Subtract();
    }
    /*@Override
    void Add(){

    }*/
    public static void main(String args[]){
        check obj=new check();
        obj.Add();
        System.out.println("Subtract="+obj.Subtract());
        System.out.println("value2="+obj.val2+" "+"Value1="+obj.val1);
    }
}

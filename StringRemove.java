public class StringRemove {
    String str="I’m a JaVa PrOgRaMmEr",str1,str2;
    int count=0;
    void Operation(){
        System.out.println("Given String:"+str);
        for (int i=0;i<str.length();i++) {
                if ('m' == str.charAt(i)) {
                    count++;
                    str1 = str.replace("m", "");
                }
            }
        System.out.println("Small 'm' occurs:" +count+ "times");
        count=0;
        for (int j=0;j<str.length();j++){
            if ('M' == str.charAt(j)){
                count++;
                str2=str1.replace("M","");
            }
        }
        System.out.println("Capital 'M' occurs:" +count +"times");
        System.out.println("Updated String:"+str2);
    }
    public static void main(String args[]){
        StringRemove obj=new StringRemove();
        obj.Operation();
    }
}

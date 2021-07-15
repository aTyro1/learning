import java.util.Scanner;
interface Details{
    public void getPersonalInfo();
    public void getOfficialInfo();
}
class Information implements Details{
     String Name,Course,Address,Department,city,State;
     int RollNum,Age,PinCode;
     long phoneNumber;
     char Gender;
     Scanner scan=new Scanner(System.in);
    @Override
    public void getPersonalInfo() {
        System.out.println("Enter the personal Details:");
        System.out.println("Enter your Name:");
        Name= scan.nextLine();
        System.out.println("Enter your Age:");
        Age= scan.nextInt();
        System.out.println("Your Gender for Male(M)/Female(F)");
        Gender=scan.next().charAt(0);
        System.out.println("Enter your PhoneNumber:");
        phoneNumber= scan.nextLong();
        System.out.println("Enter the State you belongs to:");
        State= scan.nextLine();
        System.out.println("Enter the city you live in:");
        city= scan.nextLine();
    }
    @Override
    public void getOfficialInfo() {
        System.out.println("Enter your Official Details:");
        System.out.println("Enter your Department:");
        Department= scan.nextLine();
        System.out.println("Enter your Course Name:");
        Course= scan.nextLine();
        System.out.println("Enter your Roll Number:");
        RollNum= scan.nextInt();
        System.out.println("Enter your Address:");
        Address= scan.nextLine();
        System.out.println("Enter your PinCode:");
        PinCode= scan.nextInt();
    }
    void Display(){
        System.out.println("Personal Details of the user:-");
        System.out.println("Name:"+Name);
        System.out.println("Age:"+Age);
        System.out.println("Gender:"+Gender);
        System.out.println("PhoneNumber:"+phoneNumber);
        System.out.println("City:"+city);
        System.out.println("State:"+State);
        System.out.println("Official Details of the user:-");
        System.out.println("Department:"+Department);
        System.out.println("Course:"+Course);
        System.out.println("RollNumber:"+RollNum);
        System.out.println("Address:"+Address);
        System.out.println("PinCode:"+PinCode);
    }
}
class FinalizeDetails{
   public static void main(String args[]){
       Information obj=new Information();
       obj.getPersonalInfo();
       obj.getOfficialInfo();
       obj.Display();
   }
}

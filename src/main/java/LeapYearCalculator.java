
import java.util.*;

 
public class LeapYearCalculator {
    public static void main(String []args){
       System.out.println("Enter a year");
       Scanner sc=new Scanner(System.in);
       int year=sc.nextInt();
       LeapYearCalculator msg= new LeapYearCalculator();
       msg.displayMessage();
       
       LeapYearCalculator(year); 
                          
   }   public void displayMessage(){
       
       System.out.println("Here is your result");
   }
        public static void LeapYearCalculator(int year){
       if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("The year is a leap year");
      else
         System.out.println("The  is not a leap year");
   }
}
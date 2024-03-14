import java.util.*;
public class nodays
{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter total days:");
     int td=sc.nextInt();
     int year=(td/365);
     int months=((td%365)/30);
     int week=(td%365)/7;
     int day=(td%365)%7;
     if(year>0)
     {  
           System.out.println("no of year "+year);
     }
     if(months>0){
           System.out.println("no of months "+months);
     }
     if(week>0){
           System.out.println("no of week "+week);
     }
     if(day>0){
           System.out.println("no of day "+day);
     }
     
   }
}
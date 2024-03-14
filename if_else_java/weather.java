import java.util.*;
public class Tempture{
     public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter temp:");
       int temp=sc.nextInt();
       if(temp<=0){
             System.out.print("Freezing weather");
       }else if(temp<10){
             System.out.print("Very Cold weather");
       }else if(temp<20){
             System.out.print("Cold weather");
       }else if(temp<30){
             System.out.print("Normal weather");
       }else if(temp<40){
             System.out.print("Hot weather");
       }else{
             System.out.print("Very Hot weather");
       }
     }
}
import java.util.*;
public class atm
{
   public static void main(String[] args){        
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter Amount");
         int amount=sc.nextInt();
          int Notes=0;
         if(amount%100==0){
            if(amount>=2000){
              Notes=amount/2000;
              amount=amount%2000;
              System.out.println("no of notes of 2000 is:"+Notes);
            }
            if(amount>=500){
             Notes=amount/500;
              amount=amount%500;
              System.out.println("no of notes of 500 is:"+Notes);
            }
            if(amount>=200){
               Notes=amount/200;
              amount=amount%200;
              System.out.println("no of notes of 200 is:"+Notes);
            }
            if(amount>=100){
              Notes=amount/100;
              amount=amount%100;
              System.out.println("no of notes of 100 is:"+Notes);
            }
       }
     }

}
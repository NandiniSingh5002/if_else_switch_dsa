import java.util.*;
public class libra
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
            System.out.print("Enter a Number of Day:");
	    int NoDay=sc.nextInt();
	    if(NoDay<=3){
                System.out.print("you have to pay 10 rupees as a fine");
            }else{
                 if(NoDay<=10 ){
                       System.out.print("you have to pay 20 rupees as a fine");
                 }
                 else{
                    if(NoDay<=30 ){
                       System.out.print("you have to pay 50 rupees as a fine");
                    }else{
                       System.out.print("you have to pay 50 rupees as a fine and your membership is also cancelled");
                    }

               }
 
            } 
      }
}
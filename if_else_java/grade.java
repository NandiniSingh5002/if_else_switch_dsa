import java.util.*;
public class grade
{
	public static void main(String[] args) 
       {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter percentage:");
          int per=sc.nextInt();
          if(per<=50){
            System.out.println("F");
          }else{
              if(per<=60){
                System.out.println("E");
              }else{
                 if(per<=70){
                    System.out.println("D");
                 }else{
                       if(per<=80){
                           System.out.println("C");
                       }else{
                            if(per<=90){
                               System.out.println("B");
                            }else{
                                 System.out.println("A");
                            }
                       }
                 }
              }
          }
       }
}
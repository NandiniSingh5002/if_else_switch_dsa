import java.util.*;
public class electricitybill
{
	public static void main(String[] args) 
       {
	    Scanner sc=new Scanner(System.in);
            System.out.print("Enter total unit you used:");
	    int unit=sc.nextInt();
             float ans=0;
            if(unit<=100){
               ans=unit*4;
            }
            else
            { 
               if(unit<=200){
                   ans=(100*4);
                   ans=ans+(unit-100)*5;
                   
               }
               else{
                    if(unit<=300){
                      ans=(100*4)+(100*5);
                      ans=ans+(unit-200)*6;
                      
                   }
                   else{
                     if(unit<=400){
                        ans=(100*4)+(100*5)+(100*6);
                        ans=ans+(unit-300)*7;
                        
                     }else{
                        
                          ans=(100*4)+(100*5)+(100*6)+(100*7);
                          ans=ans+(unit-400)*8;
                          
                       
                     }
                   }
               }
            }
            
          ans+=ans*0.1;
          System.out.print("Total bill with gst:"+ans);
       }
}
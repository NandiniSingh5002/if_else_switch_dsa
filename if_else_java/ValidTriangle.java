import java.util.*;
public class ValidTr
{
	public static void main(String[] args) 
       {
	    Scanner sc=new Scanner(System.in);
            System.out.print("Enter a First side:");
	    int Fside=sc.nextInt();
	    System.out.print("Enter a Sesond side:");
	    int Sside=sc.nextInt();
            System.out.print("Enter a Thirs side:");
	    int Tside=sc.nextInt();
	    if(Fside+Sside>Tside){  
                   if(Sside+Tside>Fside){ 
                        
                        if(Fside+Tside>Sside){
                           System.out.print("Valid Triangle:");
                        }
                        else{
                           System.out.print("Not Valid:");
                        }
                   }
                   else{ 
                        System.out.print("Not Valid:");
                   }
            }
            else{
                   System.out.print("Not Valid:");
            }

        }
}


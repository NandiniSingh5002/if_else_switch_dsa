import java.util.*;
public class Triangle
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
            System.out.print("Enter a First side:");
	    int Fside=sc.nextInt();
	    System.out.print("Enter a Sesond side:");
	    int Sside=sc.nextInt();
            System.out.print("Enter a Thirs side:");
	    int Tside=sc.nextInt();
	    if(Fside==Sside){  
                    if(Sside==Tside){ 
                        System.out.print("Triangle is equilatral:");
                    }
                    else{ 
                        System.out.print("Triangle is Isoscales:");
                    }

            }
            else{
                   if(Sside==Tside){ 
                        System.out.print("Triangle is Isoscales:");
                   }
                   else{
                      if(Fside==Tside){
                         System.out.print("Triangle is Isoscales:");
                      }
                      else{
                        System.out.print("Triangle is Scaler:");
                      }
                   }  
            }
		
	}
}


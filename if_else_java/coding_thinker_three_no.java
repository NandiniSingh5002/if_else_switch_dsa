import java.util.*;
public class ThreeNo
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number:");
	    int no=sc.nextInt();
	   
	        if(no%2==0){
	            System.out.print("coding");
                    if(no%3==0){
                        System.out.print("thinker");
                    }
	        }
                else{
                 if(no%3==0){
                    System.out.print("Thinker");
                  }
                }
	   
		
	}
}


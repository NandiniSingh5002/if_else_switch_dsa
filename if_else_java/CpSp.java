import java.util.*;

public class cpsp {
    	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                System.out.println("enter cp:");
		int cp=sc.nextInt();
                System.out.println("enter sp:");
		int sp=sc.nextInt();
		if(cp>sp){
		 System.out.println("loss");
		 System.out.println(cp-sp);
		}else{
		    System.out.println("profit");
		    System.out.println(sp-cp);
		}

		
	}
}

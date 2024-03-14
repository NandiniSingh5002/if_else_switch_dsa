import java.util.*;

public class diff{
    	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                System.out.print("enter first number:");
		int fno=sc.nextInt();
                System.out.print("enter second number:");
		int sno=sc.nextInt();
		if(fno>sno){
                   int di=fno-sno;
		   System.out.print("difference of \t"+fno+"\t and \t"+sno+"\t is"+di);
                   
		 
		}else{
		   int di=sno-fno;
		   System.out.print("difference of \t"+fno+"\t and \t"+sno+"\t is"+di);

		}

		
	}
}

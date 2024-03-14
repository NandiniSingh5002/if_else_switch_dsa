import java.util.Scanner;

public class elseifprg {
    public static void main(String[] args) {
      
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: "); 
        a=sc.nextInt();
        System.out.print("Enter the second number: "); 
        b=sc.nextInt();
        if (a==b) {
            System.out.println("both number are equal");
        }else if (a>b) {
            System.out.println("first no are big");
        }else{
            System.out.println("second number are big");
        }
    }
}

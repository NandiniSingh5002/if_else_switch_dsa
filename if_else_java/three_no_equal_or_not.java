import java.util.Scanner;

public class three_no_equal_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number:");
        int num1=sc.nextInt();
        System.out.print("Enter a second number:");
        int num2=sc.nextInt();
        System.out.print("Enter a third number:");
        int num3=sc.nextInt();
        if(num1==num2 && num2==num3){
            System.out.println("All are equal:");
        }else if(num1==num2){
           System.out.println("number first and number second are equal:");
        }else if(num2==num3){
            System.out.println("number second and number third are equal:");
         }else{
            System.out.println("they are not equal");
         }
    }
}

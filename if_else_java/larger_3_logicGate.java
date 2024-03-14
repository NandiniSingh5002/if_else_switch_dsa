import java.util.Scanner;
public class larger_3_logicGate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number:");
        int num1=sc.nextInt();
        System.out.print("Enter a second number:");
        int num2=sc.nextInt();
        System.out.print("Enter a third number:");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){   
                System.out.println("number 1 is larger:"); 
        }else if(num2>num3){
                System.out.println("number 2 is larger:");     
        }else{
            System.out.println("number 3 is larger");
        }
    }


}

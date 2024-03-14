import java.util.Scanner;

public class employeSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter salary:");
        double sal=sc.nextInt();
        double hra=0;
        double da=0;
        if(sal<=10000){
             hra=sal*0.2;
             da=sal*0.8;
             double totalAmount=sal+hra+da;
             System.out.println("Total salary:"+totalAmount);
        }else if(sal<=20000){
            hra=sal*0.25;
            da=sal*0.9;
            double totalAmount=sal+hra+da;
            System.out.println("Total salary:"+totalAmount);
       }else{
            hra=sal*0.3;
            da=sal*0.95;
            double totalAmount=sal+hra+da;
            System.out.println("Total salary:"+totalAmount);
       }
    }
}

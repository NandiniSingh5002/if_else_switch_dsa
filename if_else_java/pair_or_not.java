import java.util.Scanner;

public class pair_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a total no of people come in party:");
        int num=sc.nextInt();
            if(num%2==0){
                System.out.println("All came in pair:");
            }else{
                System.out.println("There is a single guy in party:");
            }   
    }
    
}

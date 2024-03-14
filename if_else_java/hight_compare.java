import java.util.Scanner;

public class hight_compare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first men hight:");
        int men1=sc.nextInt();
        System.out.print("Enter second men hight:");
        int men2=sc.nextInt();
        if(men1>men2){
            System.out.println("men1 is taller:");
        }else{
            if(men1==men2){
                System.out.println("both have same hight:");
            }else{
                System.out.println("men2 is taller:");
            }
        }
    }
}

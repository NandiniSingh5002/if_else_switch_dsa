import java.util.*;
public class Year{
         public static void main(String[] args)
         {
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter a number");
           int n=sc.nextInt();
           switch(n){
             case 1: System.out.print("jan");
                    break;
             case 2: System.out.print("feb");
                    break;
             case 3: System.out.print("march");
                    break;
             case 4: System.out.print("april");
                    break;
             case 5: System.out.print("may");
                    break;
             case 6: System.out.print("june");
                    break;
             case 7: System.out.print("july");
                    break;
             case 8: System.out.print("aug");
                    break;
             case 9: System.out.print("sep");
                    break;
             case 10: System.out.print("oct");
                    break;
             case 11: System.out.print("nov");
                    break;
             case 12: System.out.print("dec");
                    break;
            default:System.out.print("Invalid Input");
                      break;
             
           }
         }
}
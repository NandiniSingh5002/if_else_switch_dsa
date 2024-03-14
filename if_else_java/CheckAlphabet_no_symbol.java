import java.util.*;
public class CheckNoChar{
         public static void main(String[] args)
         {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a character: ");
          char c=sc.next().charAt(0);
          if((c>='A' && c<='Z') || (c>='a' && c<='z')){
             System.out.println("Given character is Alphabet");
          }else if(c>='0' && c<='9'){
              System.out.println("given character is Number");
          }else{
              System.out.println("given character is Other Symbole");
          }
        }
}
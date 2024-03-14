import java.util.*;
public class CheckVowel{
         public static void main(String[] args)
         {
          Scanner sc=new Scanner(System.in);
            System.out.println("Enter a character: ");
           char c=sc.next().charAt(0);
          if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'){
             System.out.println("vowel");
          }else{
              System.out.println("Consunet");
          }
         }
}
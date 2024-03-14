import java.util.Scanner;

public class convert12hr_format {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hour:");
        int hr=sc.nextInt();
        System.out.println("Enter minute:");
        int mi=sc.nextInt();
        if(hr<12){
            if(hr==0){
                 hr=hr+12;
                 System.out.println(hr+":"+mi+" AM");
            }else{
                System.out.println(hr+":"+mi+" Am");
            }
        }else{
            if(hr==12){
                System.out.println(hr+":"+mi+" AM");
            }else{
                hr=hr-12;
                System.out.println(hr+":"+mi+" PM");
            }
        }    
        }
}


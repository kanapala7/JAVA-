import java.util.*;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt();
        boolean leap = false;
                if(year%400==0){
                    leap = true;
                }
                else if(year%4==0 && year%100!=0){
                    leap = true;

                }
                else{
                    leap= false;
                }
            
        if(leap==true){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
  

}

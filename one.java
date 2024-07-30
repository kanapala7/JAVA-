import java.util.*;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if (n>0){
            System.out.println("the no is +ve");
        }
        else if(n<0){
            System.out.println("the no is -ve");
        }
        else{
            System.out.println("not a no.");
        }
    }
}

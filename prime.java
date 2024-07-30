import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int n = sc.nextInt();
        int count =0;
        for(int i=2;i<=n;i++){
            if(i%1==0 && i%i==0){
             count+=1;
            }
            
        }
        System.out.println(count);
    }
}

import java.util.*;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no");
        int n = sc.nextInt();
        int even =0;
        int odd =0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}

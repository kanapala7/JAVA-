import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature");
        int temp = sc.nextInt();
        String result;
        switch (temp) {
            case 80:
                result="low BP";
                break;
            case 90:
                result="normal";
                break;
            case 100:
                result="fever";
                break;
        
            default:
                result ="person expired";
                break;
        }
        System.out.println(result);
    }
}

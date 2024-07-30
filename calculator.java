import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        System.out.println("choose an option");
        char opt = sc.next().charAt(0);
        double res;
        switch (opt) {
            case '+':
                res = m1+m2;
                break;
            case '-':
                res = m1-m2;
                break;
            case '*':
                res = m1*m2;
                break;
            case '/':
                if(m2!=0){
                    res=m1/m2;
                }
                else{
                    System.out.println("error: division by 0");
                    return;
                }
                break;
        
            default:
                res = Double.NaN;
                System.out.println("Invalid opt");
                return;
        }
        System.out.println(res);
    }
}

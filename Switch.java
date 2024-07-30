import java.util.*;
public class Switch {
    public static void main(String[] args) {
        String lightColor ="Green";
        String action;
        switch (lightColor) {
            case "Red":
                action ="stop";
                break;
            case "Yellow":
                action ="Caution";
                break;
            case "Green":
                action ="Go";
                break;
        
            default:
                action="invalid light color";
        }
        System.out.println("the action is : " +action);
    }
}


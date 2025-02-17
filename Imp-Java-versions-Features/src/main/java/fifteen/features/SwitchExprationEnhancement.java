package fifteen.features;

public class SwitchExprationEnhancement {
    public static void main(String[] args){
        // if mulptiple line in case then put brackits and yield keyword instead of break;
        int x = 2;
        int y = switch (x){
            case 1-> 10;
            case 2-> 20;
            case 3-> 30;
            default -> 0;
        };
        System.out.println(y);
    }}

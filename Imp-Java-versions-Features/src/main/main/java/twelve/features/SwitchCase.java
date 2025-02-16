package twelve.features;

public class SwitchCase {
    // Java 11
    static int getMealNumberJava11(String meal)
    {
        // stores mealNumber
        int mealNumber;

        // classic switch statement
        switch (meal) {

            case "SOUP":
                mealNumber = 1;
                break;

            case "BURGER":

            case "CHIPS":

            case "SANDWICH":
                mealNumber = 2;
                break;

            case "SPAGHETTI":

            case "MACARONI":
                mealNumber = 3;
                break;

            default:
                throw new IllegalStateException(
                        "Cannot prepare " + meal);
        }

        return mealNumber;
    }
    // Java 12
    static int getMealNumberJava12(String meal)
    {

        // stores mealNumber using
        // new switch expression
        int mealNumber = switch (meal) {

            case "SOUP" -> 1;

            case "BURGER", "CHIPS", "SANDWICH" -> 2;

            case "SPAGHETTI", "MACARONI" -> 3;

            default -> throw new IllegalStateException("Cannot prepare " + meal);
        };

        return mealNumber;
    }
    public static  void main(String[] args){

        // define meal
        String meal = "BURGER";
         //Java 11
        // print mealNumber
        System.out.println("The mealNumber is : "
                + getMealNumberJava11(meal));

        //Java 12
        System.out.println("The mealNumber is : "
                + getMealNumberJava12(meal));



    }
}

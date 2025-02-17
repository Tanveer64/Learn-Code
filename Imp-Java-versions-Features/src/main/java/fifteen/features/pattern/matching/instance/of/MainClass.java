package fifteen.features.pattern.matching.instance.of;

/*
This feature allows developers to perform pattern matching on the result of an instanceof operation.
This can make it easier to write and maintain code that performs type checking and type casting.
This feature allows developers to use the ‘instanceof’ operator in a more functional way. Below is an
example of the above feature:
*/
public class MainClass {
    public static void main(String[] args){
        Shap shap = new Circle();
        if (shap instanceof Circle c){
            c.draw();
        } else if (shap instanceof Square s) {
            s.draw(3);
        }else {
            shap.draw();
        }
    }
}

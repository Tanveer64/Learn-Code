package fifteen.features.hidden;

public class HiddenClasseMain {
    /*
    This feature allows classes to be defined as hidden, which means they are not visible to code outside of the
     package in which they are defined. This can be used to improve the security and maintainability of code.
     It is mainly used for runtime code generation and class redefinition. Below is an example of the above feature:
    */


        public static void main(String[] args) {
            // Compiler Error: hidden.HiddenClass is not visible
            HiddenClass obj = new HiddenClass(5);
            System.out.println("hidden class value" + obj.getValue());
    }
}

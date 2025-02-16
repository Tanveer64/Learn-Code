package eleven.features;

import java.util.Optional;

public class OptionalEmpty {
    public static void main(String[] args){
        Optional t = Optional.empty();
        System.out.println("empty Optional = " +t.isEmpty());
        t = Optional.of("Tanveer");
        System.out.println("return false because optional is not empty = " + t.isEmpty());
    }
}

package obiektTypuOptional;

import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        Optional<String> a = Optional.of(("value")); //Optional jest typem generycznym
        Optional<String> b = Optional.of(("something"));
        Optional<String> c = Optional.empty();

        //wYPISANIE WARTOSCI NIEPUSTYCH
        System.out.println("Isnieje a:" + a.isPresent());
        System.out.println("Isnieje b:" + b.isPresent());
        System.out.println("Isnieje c:" + c.isPresent());

        //Wypisanie wartosci niepustych
        System.out.println("Wartości niepuste");
        a.ifPresent(v -> System.out.println(v));
        b.ifPresent(v -> System.out.println(v));
        //wypisanie wartosci od v lub not found
        System.out.println("Wrtosci od v lub not found: ");
        System.out.println(a.filter(v -> v.startsWith("v")).orElseGet(()->"not found"));
        System.out.println(b.filter(v -> v.startsWith("v")).orElse("not found"));
        System.out.println(c.filter(v -> v.startsWith("v")).orElse("not found"));

        //wypisanie wartosci z wielkiej litery
        System.out.println("Z wilekiej litery");
        System.out.println(a.map(v -> toCapitalizedCase(v)).orElse("Emty"));
        System.out.println(b.map(v -> toCapitalizedCase(v)).orElse("Emty"));
        System.out.println(c.map(v -> toCapitalizedCase(v)).orElse("Emty"));


        //wypisanie wartosci lub empty
        System.out.println(a.orElseGet(() -> "Emty"));
        System.out.println(b.orElseGet(() -> "Emty"));
        System.out.println(c.orElseGet(() -> "Emty"));



    }

    static String toCapitalizedCase(String text){
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}

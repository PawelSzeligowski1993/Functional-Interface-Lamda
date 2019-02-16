package obiektTypuOptional;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Optional<String> a = Optional.of("value");
        Optional<String> b = Optional.of("something");
        Optional<String> c = Optional.empty();
        // wypisanie wartości niepustych
        System.out.println("Wartości niepuste");
        a.ifPresent(System.out::println);
        b.ifPresent(v -> System.out.println(v));
        c.ifPresent(v -> System.out.println(v));
        // wypisanie wartości od v lub not found
        System.out.println("Wartości od v lub not found:");
        System.out.println(a.filter(v -> v.startsWith("v")).orElseGet(String::new));
        System.out.println(b.filter(v -> v.startsWith("v")).orElseGet(() -> new String()));
        System.out.println(c.filter(v -> v.startsWith("v")).orElseGet(() -> new String()));
        // wypisanie wartości z wielkiej litery
        System.out.println("Wartości z wielkiej litery:");
        System.out.println(a.map(v -> toCapitalizedCase(v)).orElseGet(() -> new String()));
        System.out.println(b.map(v -> toCapitalizedCase(v)).orElseGet(String::new));
        System.out.println(c.map(v -> toCapitalizedCase(v)).orElse(""));
        // wypisanie wartości lub empty
        System.out.println("Wartości lub empty:");
        System.out.println(a.orElseGet(() -> "empty"));
        System.out.println(b.orElseGet(() -> "empty"));
        System.out.println(c.orElseGet(() -> "empty"));



    }

    static String toCapitalizedCase(String text){
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}

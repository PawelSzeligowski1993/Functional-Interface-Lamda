package obiektTypuOptional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> a = Optional.of(("value")); //Optional jest typem generycznym
        Optional<String> b = Optional.empty();

        System.out.println("Isnieje A:" + a.isPresent());
        System.out.println("a = " + a.get());
        System.out.println("Istnieje B:" + b.isPresent());
        System.out.println("b = "+ b.orElse("empty"));

//        if (a.isPresent()){
//            System.out.println(a.get());
//        }else {
//            System.out.println("A is Empty");
//        }
//
//        if(b.isPresent() == false){
//            System.out.println("Empty");
//        }
//        else System.out.println(b.isPresent());

    }
}

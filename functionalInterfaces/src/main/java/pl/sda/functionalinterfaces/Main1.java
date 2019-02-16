package pl.sda.functionalinterfaces;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Main1 {

    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        Consumer<Integer> consumer = integer -> System.out.println(integer);
        Function<Integer, Integer> function = integer -> integer * integer;

        for (Integer i : integers) {
            if (predicate.test(i))
                {
                    Integer result = function.apply(i);
                    consumer.accept(result);
                }
            }


            // supplier dla liczby pi

            Supplier<Double> supplier1 = new Supplier<Double>() {
                @Override
                public Double get() {
                    return Math.PI;
                }
            };
            Supplier<Double> supplier2 = () -> Math.PI;

            //Wpisywanie wartosci PI za pomocą consumera
            Consumer<Double> consumerD = d -> System.out.println(d);
            consumerD.accept(supplier1.get());
            consumerD.accept(supplier2.get());

            //advanced interface
            AdvancedFunction dodawanie = (a, b, c) -> a + b + c;
            AdvancedFunction mnożenie = (a, b, c) -> a * b * c;
            consumer.accept(dodawanie.calculate(4, 2, 3));
            consumer.accept(mnożenie.calculate(4, 2, 3));




    }
}
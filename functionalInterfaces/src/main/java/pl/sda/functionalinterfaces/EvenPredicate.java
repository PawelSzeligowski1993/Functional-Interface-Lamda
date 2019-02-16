package pl.sda.functionalinterfaces;

import java.util.function.Predicate;

public class EvenPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer%2 ==0;
    }


}

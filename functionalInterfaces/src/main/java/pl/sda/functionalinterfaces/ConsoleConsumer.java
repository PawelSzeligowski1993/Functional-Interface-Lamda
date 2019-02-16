package pl.sda.functionalinterfaces;

import java.util.function.Consumer;

public class ConsoleConsumer implements Consumer<Integer> {


    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}




package pl.sda.functionalinterfaces;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MainCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        scanner.nextLine(); // po next Int zaleca sie użyć Scanner next Line
        System.out.println("b = ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("operacja = (+/-) ");
        String o = scanner.nextLine();
        // operacje
        BiFunction<Integer, Integer, Integer> operationPlus = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };
        BiFunction<Integer, Integer, Integer> operationMinus = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a - b;
            }
        };
        //Wykonanie obliczeń
        // wykonanie obliczeń
        if (o.equals("+")) {
            System.out.println("wynik = " + operationPlus.apply(a, b));
        } else if (o.equals("-")) {
            System.out.println("wynik = " + operationMinus.apply(a, b));
        }
    }
}




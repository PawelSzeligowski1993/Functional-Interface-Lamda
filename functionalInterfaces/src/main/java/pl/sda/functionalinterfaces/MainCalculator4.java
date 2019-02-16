package pl.sda.functionalinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class MainCalculator4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        scanner.nextLine(); // po next Int zaleca sie użyć Scanner next Line
        System.out.println("b = ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("operacja = (+/-/*) ");
        String o = scanner.nextLine();
        // operacje
        Map<String, BiFunction<Integer,Integer,Integer>> operations = new HashMap<>();
        operations.put("+",(x, y) -> x +y);
        operations.put("-",(x, y) -> x-y);
        operations.put("*",(x, y) -> x*y);
//        BiFunction<Integer, Integer, Integer> operationPlus = ( x, y) -> x + y; // Wyrazenie lamda
//        BiFunction<Integer, Integer, Integer> operationMinus =( x, y) -> x - y;



        //Wykonanie obliczeń
        // wykonanie obliczeń
        BiFunction<Integer, Integer, Integer> operation = operations.get(o);
        System.out.println("wynik = " + operation.apply(a, b));
//        if (o.equals("+")) {
//            System.out.println("wynik = " + operationPlus.apply(a, b));
//        } else if (o.equals("-")) {
//            System.out.println("wynik = " + operationMinus.apply(a, b));
//        }
    }
}




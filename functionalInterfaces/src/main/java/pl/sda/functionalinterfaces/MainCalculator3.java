package pl.sda.functionalinterfaces;

import java.util.Scanner;
import java.util.function.BiFunction;

public class MainCalculator3 {
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
        BiFunction<Integer, Integer, Integer> operationPlus = ( x, y) -> x + y; // Wyrazenie lamda
        BiFunction<Integer, Integer, Integer> operationMinus =( x, y) -> x - y;



        //Wykonanie obliczeń
        // wykonanie obliczeń
        if (o.equals("+")) {
            System.out.println("wynik = " + operationPlus.apply(a, b));
        } else if (o.equals("-")) {
            System.out.println("wynik = " + operationMinus.apply(a, b));
        }
    }
}




package pl.sda.functionalinterfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainSort1 {
    public static void main(String[] args) {
        // wczytanie danych
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        scanner.nextLine();
        int c = scanner.nextInt();
        scanner.nextLine();
        int d = scanner.nextInt();
        scanner.nextLine();
        // użycie interfejsu funkcyjnego
        SorterForFourNumbers<Integer> sorter = new SorterForFourNumbers<Integer>() {
            @Override public List<Integer> sort(Integer x1, Integer x2, Integer x3, Integer x4) {
                ArrayList<Integer> result = new ArrayList<>(4);
                result.add(x1);
                result.add(x2);
                result.add(x3);
                result.add(x4);
                result.sort(null);
                return result;
            }
        };
        // obliczenia
        List<Integer> list = sorter.sort(a, b, c, d);
        list.forEach(x -> System.out.println(x));
    }
}

package pl.sda.functionalinterfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainSort3 {
    public static void main(String[] args) {
        // wczytanie danych
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>(4);
        for (int i = 0; i < 4; ++i) {
            int a = scanner.nextInt();
            scanner.nextLine();
            input.add(a);
        }
        // użycie interfejsu funkcyjnego
        input.sort((o1, o2) -> o2 - o1);
        // obliczenia
        input.forEach(x -> System.out.println(x));

    }
}

//unboxing
//boxing - opakowanie typu prymitynego do obiektowego int ->Integer

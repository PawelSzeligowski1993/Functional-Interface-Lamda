package pl.sda.functionalinterfaces;

import java.util.Scanner;
import java.util.function.Function;

public class MainSzyfr1 {
    public static void main(String[] args) {
        // wczytanie danych
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dane do zaszyfrowania:");
        String text = scanner.nextLine();
        // szyfrowanie
        Function<String, String> crypt = new Function<String, String>() {
            @Override public String apply(String text) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < text.length(); ++i) {
                    char charToCheck = text.substring(i, i + 1)//
                            .toLowerCase()//
                            .charAt(0);
                    char charToConvert = text.charAt(i);
                    if ((charToCheck >= 'a') && (charToCheck <= 'm')) {
                        charToConvert += 13;
                    } else if ((charToCheck > 'm') && (charToCheck <= 'z')) {
                        charToConvert -= 13;
                    }
                    builder.append(charToConvert);
                }
                return builder.toString();
            }
        };
        // wypisać wynik
        System.out.println("tekst do zaszyfrowania: " + text);
        System.out.println("tekst zaszyfrowany: " + crypt.apply(text));
        System.out.println("tekst odszyfrowany: " + crypt.apply(crypt.apply(text)));
    }
}

//++i preinkrementacja - jest szybsza wynika to z wykonowania dodatkowego rejestrtu(pozom asemblera)
//i++ posinkremenacja

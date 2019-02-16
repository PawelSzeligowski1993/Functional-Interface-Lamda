package pl.sda.functionalinterfaces;

import java.util.Scanner;
import java.util.function.Function;

public class MainSzyfr4 {
    public static void main(String[] args) {

        // wczytanie danych
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dane do zaszyfrowania:");
        String text = scanner.nextLine();
        // szyfrowanie za pomocą wyrażenia lamda
        Function<String, String> crypt = textToCrypt -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < textToCrypt.length(); ++i) {
                char charToConvert = textToCrypt.charAt(i);
                if ((charToConvert >= 'a') && (charToConvert <= 'm')) {
                    charToConvert += 13;
                } else if ((charToConvert > 'm') && (charToConvert <= 'z')) {
                    charToConvert -= 13;
                } else if ((charToConvert >= 'A') && (charToConvert <= 'M')) {
                    charToConvert += 13;
                } else if ((charToConvert > 'M') && (charToConvert <= 'Z')) {
                    charToConvert -= 13;
                }
                builder.append(charToConvert);
            }
            return builder.toString();
        };
        // wypisać wynik
        System.out.println("tekst do zaszyfrowania: " + text);
        System.out.println("tekst zaszyfrowany: " + crypt.apply(text));
        System.out.println("tekst odszyfrowany: " + crypt.apply(crypt.apply(text)));
    }
}

//++i preinkrementacja - jest szybsza wynika to z wykonowania dodatkowego rejestrtu(pozom asemblera)
//i++ posinkremenacja

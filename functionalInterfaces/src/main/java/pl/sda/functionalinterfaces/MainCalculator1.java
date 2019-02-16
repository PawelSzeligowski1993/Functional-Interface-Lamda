package pl.sda.functionalinterfaces;


import java.util.Scanner;
import java.util.function.Function;

public class MainCalculator1 {
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
        Function<Input, Integer> operationPlus = new Function<Input, Integer>() {
            @Override
            public Integer apply(Input input) {
                return input.getA() + input.getB();
            }
        };
        Function<Input, Integer> operationMinus = new Function<Input, Integer>() {
            @Override
            public Integer apply(Input input) {
                return input.getA() - input.getB();
            }
        };
        //Wykonanie obliczeń
        if (o.equals("+")){
            // Przekazanie parametrów do metody
            System.out.println("Wynik = " + operationPlus.apply(new Input(a , b)));
        }else if (o.equals("-")){
            System.out.println("wynik = " + operationMinus.apply(new Input(a, b)));
        }
    }

    //Klasa zagniezdzona
    static class Input{
        private int a;
        private int b;

        public Input(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }
}

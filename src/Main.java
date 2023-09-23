import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // arrays
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator translator = new Translator(alphabetic, numeric);

        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();
            if (Objects.equals(input, "x")) {
                play = false;
            } else if (Objects.equals(input, "v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                number = scanner.nextInt();
                System.out.println(number);
                scanner.nextLine();
            } if (number < 10) {
                String result = translator.translate(number);
                System.out.println("De vertaling van " + number + " is " + result);
            } else {
                System.out.println(ongeldig);
            }
        }

    }
}

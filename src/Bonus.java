import java.util.*;

public class Bonus {

    public static void main(String[] args) {

        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber = setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback(stringnumber);
    }

    public static HashSet<Integer> randomnumbergenerator() {
        Random rand = new Random();
        HashSet<Integer> result = new HashSet<>();

        while (result.size() < 4) {
            result.add(rand.nextInt(10));
        }
        return result;
    }

    public static String setToStringConverter(HashSet<Integer> hashset) {
        String result = "";

        for (Integer p : hashset) {
            result += p;
        }
        return result;
    }


    public static void/*moet dit "void" zijn of wat anders?*/ feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringnumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }

    // Door de Hashset worden er alleen maar unieke cijfers toegevoegd en worden deze automatisch van laag naar hoog
    // gesorteerd.
}

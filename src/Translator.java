import java.util.HashMap;

public class Translator {

    // Hashmap
    HashMap<Integer, String> numericAlpha = new HashMap<>();


    // constructor
    public Translator(String[] alphabetic, Integer[] numeric){
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public String translate(Integer number){ //methode
        return numericAlpha.get(number); //return statement
    }


}

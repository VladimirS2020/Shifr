import java.util.Arrays;

public class Shifr {

    public static void main(String[] args) {
        String secretWord = "hello there";
        System.out.println("Строка, которую надо перевернуть: " + secretWord);

        System.out.println("Строка после ее переворачивания: " + makeAShifr(secretWord));
    }

    public static String makeAShifr(String word) {
        char[] wordArray = word.toCharArray();
        char[] shifredWord = new char[wordArray.length];

        for (int i = 0; i < wordArray.length - 1; i++) {
            char temp = wordArray[0];

            shifredWord[i] = wordArray[wordArray.length - i - 1];
            shifredWord[wordArray.length - 1] = temp;
            System.out.println(Arrays.toString(shifredWord));
        }

        String str = new String(shifredWord);

        return str;
    }

}
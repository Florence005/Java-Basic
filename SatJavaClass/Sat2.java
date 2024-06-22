package SatJavaClass;

public class Sat2 {
    public static void main(String[] args) {
        String sentence2;
        String sentence = " Text processiong is hard! \r";
        int position = sentence.indexOf("hard");
        System.out.println(sentence);
        System.out.println("012345678901234567890123");
        System.out.println("The word \"hard\" starts at index" + position);
        sentence = sentence.substring(0, position) + "easy!";
        sentence = sentence.toUpperCase();
        System.out.println(" The change string is :");
        System.out.println(sentence);

        sentence2 = sentence.replace("hard", "easy");
        System.out.println(sentence2);
    }
}

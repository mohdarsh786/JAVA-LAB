import java.util.Scanner;

public class WordExample {
    private String strdata;

    public WordExample(String str) {
        strdata = str;
    }

    public void countWord() {
        String sentence = strdata.substring(0, strdata.length() - 1).trim();
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                count++;
            }
        }
        System.out.println("Count of words beginning and ending with a vowel = " + count);
    }

    public void placeWord() {
        String sentence = strdata.substring(0, strdata.length() - 1).trim();
        String[] words = sentence.split("\\s+");
        StringBuilder vowelWords = new StringBuilder();
        StringBuilder otherWords = new StringBuilder();
        for (String word : words) {
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                vowelWords.append(word).append(" ");
            } else {
                otherWords.append(word).append(" ");
            }
        }
        System.out.println("Rearranged Sentence:");
        System.out.println(vowelWords.toString().trim() + " " + otherWords.toString().trim());
    }

    private boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String input = sc.nextLine();
        WordExample obj = new WordExample(input);
        obj.countWord();
        obj.placeWord();
    }
}

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TextAnalyzer {

    public static void main(String[] args) throws IOException {

        String textInput = String.valueOf(Files.readAllLines(Paths.get("src\\input.txt"), StandardCharsets.UTF_8));

        System.out.println("We have got " + vowelCounter(textInput) + " vowels in that text.");
        System.out.println("The vowel are " + vowelAndOtherCharRateCounter(vowelCounter(textInput), textInput) + " % rate int the text.");
        System.out.println("The average length of the words is: " + wordsLengthAverage(textInput) + " characters.");
    }

    public static int vowelCounter(String text){
        int vowels;
        vowels = text.replaceAll("[^aeiouAEIOU]","").length();
        return vowels;
    }

    public static double vowelAndOtherCharRateCounter(int vowel, String text){
        double charRate;
        int characters;
        characters = text.length() - vowel;
        charRate = (vowel * 100) / characters;
        return charRate;
    }

    public static int wordsLengthAverage(String text){
        int average = 0;
        int longest = 0;
        int shortest = 0;
        int firstWordLength;
        List<String> words = Arrays.asList(text.split(" "));
        firstWordLength = words.get(0).length();
        for(int i=1; i< words.size(); i++) {
            if(words.get(i).length() > firstWordLength) {
                longest = i; firstWordLength = words.get(i).length();
            }
        }
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() < firstWordLength) {
                shortest = i; firstWordLength = words.get(i).length();
            }
            average = (longest + shortest) / 2;
        }
        return average;
    }
}

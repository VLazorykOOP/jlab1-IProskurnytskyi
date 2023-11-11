import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();

        String[] removedWords = removeWordsWithDoubledLetters(inputText);

        System.out.println("\nModified string:");
        for (String word : removedWords) {
            System.out.print(word + " ");
        }

        System.out.println("\n\nRemoved Words:");
        String removed = removeWords(inputText, removedWords);
        System.out.println(removed);

        scanner.close();
    }

    private static String[] removeWordsWithDoubledLetters(String text) {
        String[] words = text.split("[\\s .,;!?]+");
        StringBuilder removedWordsBuilder = new StringBuilder();

        for (String word : words) {
            if (!hasDoubledLetters(word)) {
                removedWordsBuilder.append(word).append(" ");
            }
        }

        return removedWordsBuilder.toString().split("\\s+");
    }

    private static boolean hasDoubledLetters(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    private static String removeWords(String text, String[] wordsToRemove) {
        for (String word : wordsToRemove) {
            text = text.replaceAll("\\b" + word + "\\b", "");
        }
        return text.trim();
    }
}

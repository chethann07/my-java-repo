package concepts;

import java.util.Scanner;

public class ParagraphCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String s = scan.nextLine();
        String[] paragraphArr = s.split(" ");
        countWords(paragraphArr);
        scan.close();
    }

    private static void countWords(String[] paragraphArr) {
        int maxCount = Integer.MIN_VALUE;

        // Find the maximum count
        for (int i = 0; i < paragraphArr.length; i++) {
            int count = 0;
            for (int j = 0; j < paragraphArr.length; j++) {
                if (paragraphArr[i].equals(paragraphArr[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Print all words with the maximum count
        System.out.println("Words with the highest repetition count (" + maxCount + "):");
        for (int i = 0; i < paragraphArr.length; i++) {
            int count = 0;
            for (int j = 0; j < paragraphArr.length; j++) {
                if (paragraphArr[i].equals(paragraphArr[j])) {
                    count++;
                }
            }
            if (count == maxCount) {
                // Print the word if it hasn't been printed yet
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (paragraphArr[i].equals(paragraphArr[k])) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.println(paragraphArr[i]);
                }
            }
        }
    }
}

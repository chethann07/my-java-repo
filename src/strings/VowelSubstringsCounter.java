package strings;

public class VowelSubstringsCounter {
    public static void main(String[] args) {
        String input = "abcde"; // Example input
        System.out.println(countVowelSubstrings(input));
    }

    public static int countVowelSubstrings(String s) {
        int count = 0;

        // Generate all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean isVowelSubstring = true;
                // String t = "";
                for (int k = i; k <= j; k++) {
                    // t = t + s.charAt(k);
                    if (!isVowel(s.charAt(k))) {
                        isVowelSubstring = false;
                        break;
                    }
                }
                // System.out.println(t);
                if (isVowelSubstring) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}

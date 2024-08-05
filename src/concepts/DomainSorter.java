package concepts;

import java.util.Scanner;

public class DomainSorter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        sortDomains(input);
        scan.close();
    }

    public static void sortDomains(String urls) {
        // Split the input string into individual URLs
        String[] urlArray = urls.split(",");

        // Extract domain names
        for (int i = 0; i < urlArray.length; i++) {
            urlArray[i] = urlArray[i].replace("www.", "").replace(".com", "");
        }

        // Manually sort the domain names
        for (int i = 0; i < urlArray.length - 1; i++) {
            for (int j = i + 1; j < urlArray.length; j++) {
                if (urlArray[i].length() > urlArray[j].length() ||
                        (urlArray[i].length() == urlArray[j].length() && urlArray[i].compareTo(urlArray[j]) > 0)) {
                    // Swap urlArray[i] and urlArray[j]
                    String temp = urlArray[i];
                    urlArray[i] = urlArray[j];
                    urlArray[j] = temp;
                }
            }
        }

        // Print each domain on a new line
        for (int i = 0; i < urlArray.length; i++) {
            System.out.println(urlArray[i]);
        }
    }
}

package concepts;

public class ToggleBitsAfterMSB {

    public static int toggleBitsAfterMSB(int n) {
        // Convert the integer to a binary string
        String binaryString = Integer.toBinaryString(n);
        System.out.println(binaryString.toCharArray());

        // Toggle the bits
        StringBuilder toggledBinaryString = new StringBuilder();
        for (char bit : binaryString.toCharArray()) {
            if (bit == '0') {
                toggledBinaryString.append('1');
            } else {
                toggledBinaryString.append('0');
            }
        }

        // Convert the toggled binary string back to an integer
        int toggledInteger = Integer.parseInt(toggledBinaryString.toString(), 2);

        return toggledInteger;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 15;
        // String[] s = new String[];
        int result = toggleBitsAfterMSB(n);
        System.out.println("The result after toggling bits of " + n + " is " + result);
    }
}

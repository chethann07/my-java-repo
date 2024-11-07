package DSA;

public class TimeComplexityDemo {
    public static void main(String[] args) {
        long now;
        now = System.nanoTime();
        System.out.println(findSum1(100000));
        System.out.println("Time taken for method 1 is: " +
                (System.nanoTime() - now) + "ns");
        now = System.nanoTime();
        System.out.println(findSum2(100000));
        System.out.println("Time taken for method 2 is: " +
                (System.nanoTime() - now) + "ns");
    }

    public static int findSum1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int findSum2(int n) {
        return n * (n + 1) / 2;
    }
}
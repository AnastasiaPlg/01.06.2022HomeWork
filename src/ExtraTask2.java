public class ExtraTask2 {
    public static void main(String[] args) {
        int n = 3698;
        findSumOfNumbers(0, n);
    }

    public static void findSumOfNumbers(int sum, int n) {
        int q = n % 10;
        sum = sum + q;
        n = (n - q) / 10;
        if (n > 0) {
            findSumOfNumbers(sum, n);
        } else {
            System.out.println(sum);
        }
    }
}

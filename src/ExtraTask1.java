public class ExtraTask1 {
    public static void main(String[] args) {
        showNumbers(1, 10);
    }

    public static void showNumbers(int q, int n) {
        System.out.println(q);
        q++;
        n--;
        if (n > 0) {
            showNumbers(q, n);
        }
    }

}

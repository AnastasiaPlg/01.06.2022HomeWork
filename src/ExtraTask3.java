public class ExtraTask3 {
    public static void main(String[] args) {
        showNumbers(10, 1);
    }

    public static void showNumbers(int a, int b) {
        System.out.println(a);
        if (a < b) {
            a++;
            if (a < b) {
                showNumbers(a, b);
            }
        }
        if (a > b) {
            a--;
            if (a > b) {
                showNumbers(a, b);
            }
        }
        if (a == b) {
            System.out.println(b);
        }
    }
}

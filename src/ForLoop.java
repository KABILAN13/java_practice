public class ForLoop {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("factorial of numbers: " + sum);
    }
}

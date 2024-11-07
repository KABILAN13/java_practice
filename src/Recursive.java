public class Recursive {
    public static void main(String[] args) {
        kabil(10);
    }
    public static void kabil(int n){
        if (n==1){
            System.out.println(1);
        }
        else {
            System.out.println(n);
            kabil(n-1);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Exercitiul 11
        // Cel mai mare divizor comun

        int a = 50;
        int b = 100;

        int gcf = gcd(a, b);
        System.out.println(gcf);  
    }

    // calculate the greatest common divisor of numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

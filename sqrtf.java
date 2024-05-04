import java.util.Scanner;

class sqrtf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double a, b, c;
            double r1, r2;
            System.out.println("Enter a, b, and c:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            double det = (b * b) - (4 * a * c);
            if (det > 0) {
                r1 = (-b + Math.sqrt(det)) / (2 * a);
                r2 = (-b - Math.sqrt(det)) / (2 * a);
                System.out.println("Root 1 = " + r1 + ", Root 2 = " + r2);
            } else if (det == 0) {
                r1 = r2 = -b / (2 * a);
                System.out.println("Roots are real and equal. Root = " + r1);
            } else {
                double real = -b / (2 * a);
                double img = Math.sqrt(-det) / (2 * a);
                System.out.println("Roots are complex.");
                System.out.println("Root 1 = " + real + " + " + img + "i");
                System.out.println("Root 2 = " + real + " - " + img + "i");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close(); // close the scanner
        }
    }
}


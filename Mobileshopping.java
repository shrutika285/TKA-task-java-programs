 
public class Mobileshopping {

    static double calculateMobileGST(double a, double b) {
        double amount = a + b;
        return amount + (amount * 18 / 100);
    }

    static double calculateAccessoriesGST(double c, double d) {
        double amount = c + d;
        return amount + (amount * 12 / 100);
    }

    static double calculateCoverGST(double e) {
        return e + (e * 5 / 100);
    }

    static double totalBill(double a, double b, double c,
                            double d, double e) {
        return calculateMobileGST(a, b)
             + calculateAccessoriesGST(c, d)
             + calculateCoverGST(e);
    }

    static double calculateDiscountedBill(double a, double b,
                                          double c, double d,
                                          double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 10 / 100;
        return total - discount;
    }

    public static void main(String[] args) {
        double a = 1000, b = 500, c = 200, d = 100, e = 100;

        double total = totalBill(a, b, c, d, e);
        double discount = total * 10 / 100;
        double payable = calculateDiscountedBill(a, b, c, d, e);

        System.out.printf("Total after GST = %.2f%n", total);
        System.out.printf("Discount = %.2f%n", discount);
        System.out.printf("Final payable amount = %.2f%n", payable);
    }
}
 

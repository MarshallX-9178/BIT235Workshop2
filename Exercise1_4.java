public class Exercise1_4 {
    public static void main(String[] args) {
        double P = 50000.00;   // 本金
        double r = 0.04;      // 年利率 4%
        int n = 10;           // 年数

        double A = P * Math.pow(1 + r, n);

        System.out.printf("Principal (P)      : $%.2f%n", P);
        System.out.printf("Interest rate (r)  : %.2f%%%n", r * 100);
        System.out.printf("Time periods (n)   : %d years%n", n);
        System.out.printf("Amount (A)         : $%.2f%n", A);
    }
}
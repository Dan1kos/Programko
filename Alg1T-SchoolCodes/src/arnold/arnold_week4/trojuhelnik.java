package arnold_week4;


public class trojuhelnik {
    public static void main(String[] args) {
        double A[] = {0, 0};
        double B[] = {3, 0};
        double C[] = {0, 4};

        double c = vzdalenost(A, B);
        double b = vzdalenost(B, C);
        double a = vzdalenost(C, A);

        double obvod = (a + b + c);
        double s = obvod / 2;
        double obsah = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Obvod trojúhelníku je: " + obvod);
        System.out.println("Obsah trojúhelníku je: " + obsah);



    }
    private static double vzdalenost( double A[],  double B[]) {
        double vz = Math.sqrt(Math.pow((A[0]-B[0]), 2) + Math.pow((A[1]-B[1]), 2));
        return vz;
    }
}

package arnold_week4;

import java.util.Scanner;

public class poradi {

  public static void main(String[] args) {
    System.out.println("Zadejte 3 čísla:");
    Scanner scan = new Scanner(System.in);

    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = scan.nextDouble();

    //data uzivatele
    double a1 = a;
    double b1 = b;
    double c1 = c;

    System.out.println("pro vzestupné napiš 1, pro sestupné napiš 2");
    int ver = scan.nextInt();
    serazni(a, b, c, ver);
  }

  private static void serazni(double a, double b, double c, int ver) {
    double help = 0;
    if (a < b) {
      help = a;
      a = b;
      b = help;
    }
    if (a < c) {
      help = a;
      a = c;
      c = help;
    }
    if (b < c) {
      help = b;
      b = c;
      c = help;
    }

    if (ver == 1) {
      System.out.println("Vzestupně: " + c + ", " + b + ", " + a);
    } else if (ver == 2) {
      System.out.println("Sestupně: " + a + ", " + b + ", " + c);
    } else {
      System.out.println("Špatný vstup");
    }
  }
}

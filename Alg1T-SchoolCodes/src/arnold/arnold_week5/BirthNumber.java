package arnold_week5;

import java.util.Scanner;

public class BirthNumber {

  public static void main(String[] args) {
    System.out.println("Zadejte rodné číslo ve formátu datum narození před /:");

    Scanner scan = new Scanner(System.in);
    int prvniCast = scan.nextInt();

    System.out.println("Zadejte rodné číslo ve formátu datum narození po /:");
    int druhaCast = scan.nextInt();

    long rodneCislo = (long) prvniCast * 10000 + druhaCast;

    long pomoc = (long) Math.floor(rodneCislo / 10);
    int posledni = druhaCast % 10;
    int zbytek = (int) (pomoc % 11);

    if (zbytek%10 == posledni) {
      System.out.println("Rodné číslo je platné.");
    } else {
      System.out.println("Rodné číslo není platné.");
    }
  }
}

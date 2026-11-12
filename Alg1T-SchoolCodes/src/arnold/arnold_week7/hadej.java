package arnold_week7;

import java.util.Scanner;

public class hadej {
    public static void main(String[] args) {
        System.out.println("hadas ty nebo ja? (zadaj 1 pro tebe, 2 pro mne)");
        Scanner scanner = new Scanner(System.in);
        int volba = scanner.nextInt();
        if (volba == 1) {
            uzivateHada();
        } else if (volba == 2) {
            pocitacHada();
        } else {
            System.out.println("Spatny vstup");
        }
        
    }
    public static void uzivateHada(){
        System.out.println("Hadej cislo od 1 do 100");
        Scanner scanner = new Scanner(System.in);
        int hadaneCislo = (int) (Math.random() * 100);

        while (true) {
            int uzivatelovoCislo = scanner.nextInt();
            if (uzivatelovoCislo < hadaneCislo) {
                System.out.println("Hadej vetsi cislo");
            } else if (uzivatelovoCislo > hadaneCislo) {
                System.out.println("Hadej mensi cislo");
            } else {
                System.out.println("Uhadl jsi cislo " + hadaneCislo);
                break;
            }
        }
    }
    public static void pocitacHada(){
        System.out.println("pis mensi,vetsi nebo rovno");
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int mid = 50;
        int max = 100;
        while (true) {
            System.out.println("myslim si cislo " + mid);
            String odpoved = scanner.next();
            if (odpoved.equals("rovno") || min == max || max == 2) {
                System.out.println("Uhadl jsem cislo " + mid);
                break;
            } else if (odpoved.equals("vetsi")) {
                min = mid + 1;
            } else if (odpoved.equals("mensi")) {
                max = mid - 1;
            }
            mid = (min + max) / 2;
        }
    }
}

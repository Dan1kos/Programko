public class Farm {

  public static void main(String[] args) {
    //IN
    int pocetHus = 10;
    int pocetKraliku = 5;

    //out
    int pocetZvirat = pocetHus + pocetKraliku;
    int pocetNohou = (pocetHus * 2) + (pocetKraliku * 4);

    //print
    System.out.println("Počet hus: " + pocetHus);
    System.out.println("Počet králíků: " + pocetKraliku);
    System.out.println("Počet zvířat: " + pocetZvirat);
    System.out.println("Počet nohou: " + pocetNohou);
  }
}

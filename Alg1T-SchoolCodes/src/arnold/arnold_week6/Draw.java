package arnold_week6;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte jak dlouhou chceš vlajku: ");
        int col = scanner.nextInt();
        scanner.close();
        
        int row = (int) Math.round(col * (2.0 / 4.0));
        int x =  2;
       
        if (row % 2 == 0) {
            row = row + 1;
        }

        for (int i=0; i<row ;i++){
            for (int j=0; j<col; j++){
                if (i == 0 || i == row-1)
                    System.out.print("* ");
                else if (j == 0 || j == col-1)
                    System.out.print("* ");
                else if (i == row/2 && j >= (col/2))
                    System.out.print("* ");
                else if (j==i*2 && i<row/2)
                    System.out.print("* ");
                else if (j == (i - x)*2 && i>row/2){
                    x = x +2;
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
  
    }
}
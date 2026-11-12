package arnold_vanoce;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte velikost snehulaka 0-6: ");
        int velikostSnehulaka = scanner.nextInt();
        System.out.println("Zadejte velikost darku 0-6: ");
        int velikostDarku = scanner.nextInt();

        int s = velikostSnehulaka;
        int g = velikostDarku;

        int rows = Math.max(10 * s + 9, 5 * g + 4);
        int cx = 2 * s + 3;
        int gx = (4 * s + 8) + 2 * g + 1;
        int cols = gx + 2 * g + 2;

        int bot3 = rows - 1;
        int top3 = bot3 - (3 * s + 4);
        int bot2 = top3;
        int top2 = bot2 - (3 * s + 2);
        int bot1 = top2;
        int top1 = bot1 - 3 * s;
        int hatBrim = top1 - 1;
        int hatTop = hatBrim - s - 1;

        int gBot = rows - 1;
        int gTop = gBot - (4 * g + 2);
        int gLeft = gx - (2 * g + 1);
        int gRight = gx + (2 * g + 1);
        int gMid = (gTop + gBot) / 2;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean snehulak = false;
                boolean darek = false;

                if (i >= hatTop && i < hatBrim && j >= cx - s && j <= cx + s) {
                    snehulak = true;
                } else if (i == hatBrim && j >= cx - (s + 2) && j <= cx + (s + 2)) {
                    snehulak = true;
                }

                if (i >= top1 && i <= bot1) {
                    int d = Math.min(i - top1, bot1 - i);
                    int w1 = 2 * s + 1;
                    if (d == 0 && j >= cx - (w1 - s) && j <= cx + (w1 - s)) snehulak = true;
                    else if (d > 0 && d < s && (j == cx - (w1 - s + d) || j == cx + (w1 - s + d))) snehulak = true;
                    else if (d >= s && (j == cx - w1 || j == cx + w1)) snehulak = true;
                }

                if (i >= top2 && i <= bot2) {
                    int d = Math.min(i - top2, bot2 - i);
                    int w2 = 2 * s + 2;
                    int b2 = s + 1;
                    if (d == 0 && j >= cx - (w2 - b2) && j <= cx + (w2 - b2)) snehulak = true;
                    else if (d > 0 && d < b2 && (j == cx - (w2 - b2 + d) || j == cx + (w2 - b2 + d))) snehulak = true;
                    else if (d >= b2 && (j == cx - w2 || j == cx + w2)) snehulak = true;
                }

                if (i >= top3 && i <= bot3) {
                    int d = Math.min(i - top3, bot3 - i);
                    int w3 = 2 * s + 3;
                    int b3 = s + 1;
                    if (d == 0 && j >= cx - (w3 - b3) && j <= cx + (w3 - b3)) snehulak = true;
                    else if (d > 0 && d < b3 && (j == cx - (w3 - b3 + d) || j == cx + (w3 - b3 + d))) snehulak = true;
                    else if (d >= b3 && (j == cx - w3 || j == cx + w3)) snehulak = true;
                }

                if (i == top1 + s && (j == cx - s || j == cx + s)) snehulak = true;
                if (i == top1 + 2 * s && j == cx) snehulak = true;
                if (i > top2 && i < bot2 && (i - top2) % 2 == (s % 2) && j == cx) snehulak = true;
                if (i > top3 && i < bot3 && (i - top3) % 2 == 0 && j == cx) snehulak = true;

                if (i >= gTop && i <= gBot && j >= gLeft && j <= gRight) {
                    if (i == gTop || i == gBot || j == gLeft || j == gRight || i == gMid || j == gx) {
                        darek = true;
                    }
                }

                if (i >= gTop - (g + 1) && i < gTop) {
                    int bi = gTop - 1 - i;
                    if (bi == 0 && j >= gx - g && j <= gx + g) darek = true;
                    else if (bi == g && ((j >= gx - 2 * g && j <= gx - g) || (j >= gx + g && j <= gx + 2 * g))) darek = true;
                    else if (bi > 0 && bi < g && (j == gx - g - bi || j == gx - bi || j == gx + bi || j == gx + g + bi)) darek = true;
                }

                if (snehulak || darek) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class Tugas2 {
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] penjualan = new int[5][7];
    static void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Penjualan %s hari ke-%d: ", menu[j], i + 1);
                penjualan[j][i] = sc.nextInt();
            }
        }
        sc.close();
    }
    static void tampil() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Penjualan %s hari ke-%d: %d\n", menu[j], i + 1, penjualan[j][i]);
            }
        }
    }
    static void tertinggi() {
        int tertinggi = 0, menuTertinggi = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (penjualan[j][i] > tertinggi) {
                    tertinggi = penjualan[j][i];
                    menuTertinggi = j;
                }
            }
        }
        System.out.printf("Menu penjualan tertinggi: %s\n", menu[menuTertinggi]);
    }
    static void rerata() {
        int[] totalPenjualan = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                totalPenjualan[i] += penjualan[i][j];
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Rata-rata penjualan %s: %d\n", menu[i], (totalPenjualan[i]/7));
        }
    }
    public static void main(String[] args) {
        input();
        tampil();
        tertinggi();
        rerata();
    }
}
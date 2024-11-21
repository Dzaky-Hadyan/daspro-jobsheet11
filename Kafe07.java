import java.util.Scanner;
public class Kafe07 {
    static Scanner sc = new Scanner(System.in);
    public static void Menu() {
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static double hitungTotalHarga07(int[] pilihanMenu, int[] banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        double diskon;
        int totalHarga = 0;
        switch (kodePromo) {
            case "DISKON50":
                diskon = 0.5;
                break;
            case "DISKON30":
                diskon = 0.7;
                break;
            default:
                diskon = 1;
                break;
        }
        for (int i = 0; i < banyakItem.length; i++) {
            totalHarga += hargaItems[pilihanMenu[i] - 1] * banyakItem[i];
        }
        double hargaTotal = totalHarga * diskon;
        return hargaTotal;
    }
    public static void hasilKodePromo(String kodePromo) {
        switch (kodePromo) {
            case "DISKON50":
                System.out.println("Diskon 50%");
                break;
            case "DISKON30":
                System.out.println("Diskon 30%");
                break;
            default:
                System.out.println("Kode invalid");
                break;
        }
    }
    public static void main(String[] args) {
        Menu();
        String[] namaMenu = {"Kopi Hitam", "Cappuccino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"};
        System.out.print("Masukkan jumlah menu yang ingin dipesan: ");
        int i = sc.nextInt();
        int[] pilihanMenu = new int[i];
        int[] banyakItem = new int[i];
        int j = 0;
        while (j < i) {
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        pilihanMenu[j] = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        banyakItem[j] = sc.nextInt();
        j++;
        }
        System.out.print("Masukkan kode promo: ");
        sc.nextLine();
        String kodePromo = sc.nextLine();
        System.out.print("Pesanan:");
        for (int k = 0; k < j; k++) {
            System.out.print(" " + String.join(", ", namaMenu[pilihanMenu[k] - 1]) + " " + banyakItem[k]);
        }
        System.out.println();
        hasilKodePromo(kodePromo);
        double totalHarga = hitungTotalHarga07(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
    }
}
import java.util.Scanner;
public class Kubus07 {
    static double hitungVolume (double s) {
        double volume = s * s * s;
        return volume;
    }
    static double hitungPermukaan (double s) {
        double permukaan = 6 * (s * s);
        return permukaan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang sisi kubus: ");
        double s = sc.nextDouble();
        System.out.println("Volume: " + hitungVolume(s));
        System.out.println("Luas permukaan: " + hitungPermukaan(s));
    }
}
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplam eleman sayısını giriniz :");
        int n = scanner.nextInt();
        System.out.print("Seçilecek eleman sayısını giriniz :");
        int r = scanner.nextInt();

        // n faktoriyel hesaplama
        long nFaktoriyel = 1;
        for (int i = 1; i <= n; i++){
            nFaktoriyel *= i;
        }
        // r faktoriyel hesaplama
        long rFaktoriyel = 1;
        for (int i = 1; i <= r; i++){
            rFaktoriyel *= i;
        }
        // (n-r) faktoriyel hesaplama
        long nMinusRFaktoriyel = 1;
        for (int i = 1; i <= (n - r); i++){
            nMinusRFaktoriyel *= i;

        }
        // kombinasyon hesaplama
        long kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);

        System.out.println("C(" + n + "," + r + ") =" + kombinasyon);
    }
}

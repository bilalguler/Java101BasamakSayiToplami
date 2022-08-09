
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi, top = 0, kalan;

        System.out.print("Basamak sayilarinin toplamini istediginiz sayi: ");
        sayi = scan.nextInt();

        while(sayi > 0) {
            kalan = (sayi % 10);
            top += kalan;
            sayi = (sayi - kalan) / 10;
        }
        System.out.println("Toplam: " + top);
    }
}
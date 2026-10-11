import java.util.Scanner;

public class CekAngka {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        double angka = scanner.nextDouble();
        
        // Percabangan untuk mengecek kondisi angka
        if (angka > 0) {
            System.out.println("Angka " + angka + " adalah **Positif**.");
        } else if (angka < 0) {
            System.out.println("Angka " + angka + " adalah **Negatif**.");
        } else {
            System.out.println("Angka tersebut adalah **Nol (0)**.");
        }
        
        // Menutup scanner untuk mencegah memory leak
        scanner.close();
    }
}

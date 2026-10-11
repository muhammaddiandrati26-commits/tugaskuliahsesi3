import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input_sebuah_angka");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.print("Genap");
        } else {
            
            input.close();
        }
    }
}
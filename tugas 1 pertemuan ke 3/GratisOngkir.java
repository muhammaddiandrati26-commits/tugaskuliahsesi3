import java.util.Scanner;

public class GratisOngkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input total belanja");
        double belanja = input.nextDouble();

        if (belanja >= 100000) {
            System.out.print("GratisOngkir");
        } else if (belanja < 100000) {
            System.out.print("BayarOngkir");
        }

        input.close();
    }
}
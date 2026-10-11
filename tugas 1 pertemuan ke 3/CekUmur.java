import java.util.Scanner;

public class CekUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("InputUmur");
        int umur = input.nextInt();

        if (umur >= 17) {
            System.out.print("BolehMemilikiKTP");
        } else if (umur < 17) {
            System.out.print("TidakBolehMemilikiKTP");
        }

        input.close();
    }
}
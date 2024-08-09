import java.util.Scanner;

public class hello{


     public static void main(String[] args) {
//     }
// }
// double alas,tinggi,hasil;
// Scanner input = new Scanner(System.in);
// System.out.println("masukan alas segitiga: ");
// alas = input.nextDouble();

        double rusukAtas;
        double rusukBawah;
        double tinggi;
        double hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan rusukAtas trapesium: ");
        rusukAtas = input.nextDouble();
        System.out.println("Masukkan rusukBawah trapesium: ");
        rusukBawah = input.nextDouble();
        System.out.println("Masukkan tinggi trapesium: ");
        tinggi  = input.nextDouble();
        hasil = 1/2*rusukAtas+rusukBawah*tinggi;
        System.out.println("Hasil luas trapesium adalah: "+hasil);
     }
}
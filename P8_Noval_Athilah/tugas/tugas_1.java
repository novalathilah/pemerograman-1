package tugas;
import java.util.Scanner;
public class tugas_1 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char pilihan;
    System.out.println("PROGRAM NILAI MAHASISWA");
    do {

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nilai mahasiswa: ");
        double nilai = input.nextDouble();
        input.nextLine();
        System.out.println("\nData yang diinput");
        System.out.println("Nama : " + nama);
        System.out.print("Nilai : " + nilai);
        System.out.print("\nInput lagi? (y/t) : ");
        pilihan = Character.toLowerCase(input.nextLine().charAt(0));
        System.out.println();
    } while (pilihan!='t');
    System.out.println("TERIMA KASIH - PROGRAM SELESAI");
    input.close();
    }
}
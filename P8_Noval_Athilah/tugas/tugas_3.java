package tugas;
import java.util.Scanner;
public class tugas_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalNilai = 0;
        int jumlahMahasiswa = 0;
        char lagi;
        System.out.println("PROGRAM HITUNG NILAI RATA-RATA");

        do {
            System.out.print("Masukkan nilai mahasiswa ke-" +(jumlahMahasiswa + 1) + " :");
            double nilai = input.nextDouble();
            totalNilai += nilai;
            jumlahMahasiswa ++;
            System.out.print("Input nilai lagi?(y/t): ");
            lagi = input.next().charAt(0);

        } while (lagi == 'y' || lagi =='Y');
        double rataRata = totalNilai / jumlahMahasiswa;
        System.out.println("Jumlah Mahasiwa : " + jumlahMahasiswa);
        System.out.println("Total nilai : " + totalNilai);
        System.out.println("Nilai Rata-Rata" + rataRata);

        System.out.println("TERIMA KASIH - PROGRAM SELESAI");

        input.close();
    }
}
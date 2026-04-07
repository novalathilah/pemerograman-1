package P4_Noval_Athilah.latihan;

import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println( "=" .repeat(10));

        System.out.print("Input Kehadiran: ");


        double kehadiran = input.nextInt();

        System.out.print("Input Tugas:");

        double tugas = input.nextInt();

        System.out.print("Input UTS:");

        double uts = input.nextInt();
        System.out.print("Input UAS:");
        int uas = input.nextInt();
        int realisasi = 21;
        System.out.println( "=" .repeat(10));
 

        double bKehadiran = ((double) kehadiran / realisasi) * 10/  100;
        double bTugas = (double ) tugas * 20 / 100;
        double bUts = (double)uts * 30 / 100;
        double bUas = (double) uas *40 / 100;

        double Total = bKehadiran + bTugas + bUas + bUts;

        System.out.println("Bobot Kehadiran : " + bKehadiran);
        System.out.println("Bobot Tugas : " + bTugas);
        System.out.println("Bobot UTS :"  + bUts);
        System.out.println("Bobot UAS : " + bUas);

        System.out.println("Total: " + Total);


        
    }
}
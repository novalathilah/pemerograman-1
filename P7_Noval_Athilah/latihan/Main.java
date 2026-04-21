import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan pilihan 1 atau 2: ");
        int pilihan = input.nextInt();
        input.nextLine(); 

        if (pilihan == 1) {
            System.out.print("Pilih reg A, B, CK, CS: ");
            String pilih = input.nextLine();

            switch (pilih) {
                case "A":
                    System.out.print("Reg A");
                    break;
                case "B":
                    System.out.print("Reg B");
                    break;
                case "CK":
                    System.out.print("Reg CK");
                    break;
                case "CS":
                    System.out.print("Reg CS");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

            System.out.print("Masukan Nama:");
            String nama = input.nextLine();
            System.out.print("Masukan Prodi:");
            String prodi = input.nextLine();
                        

            System.out.println("========================================================");
            System.out.println("Nama: " + nama + "\nProdi: " + prodi + "\nReg: " + pilih);
            System.out.println("========================================================");
                        
        } else if (pilihan == 2) {
            System.out.println("Anda keluar dari program");
        }
    }
}
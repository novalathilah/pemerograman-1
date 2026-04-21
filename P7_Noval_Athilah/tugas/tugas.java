package tugas;

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Pilihan Masuk / Keluar: ");
        String pilihan = input.nextLine();
        
        if (pilihan.equalsIgnoreCase("Masuk")) {
            System.out.println("Pilih Menu: ");
            System.out.println("1. Cuci Setrika");
            System.out.println("2. Cuci Kering");
            System.out.println("3. Cuci Basah");
            System.out.println("4. Cuci Satuan");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihan: ");
            int pilih = input.nextInt();
            input.nextLine();

            String service = "";
            switch (pilih) {
                case 1:
                    service = "Cuci Setrika";
                    break;
                case 2:
                    service = "Cuci Kering";
                    break;
                case 3:
                    service = "Cuci Basah";
                    break;
                case 4:
                    service = "Cuci Satuan";
                    break;
                case 5:
                    System.out.println("Keluar");
                    input.close();
                    return;
                default:
                    service = "Tidak Diketahui";
                    break;
            }

            System.out.println("");
            System.out.print("Masukan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukan Jenis: ");
            String jenis = input.nextLine();
            System.out.print("Masukan Berat: ");
            int berat = input.nextInt();
            System.out.print("Masukan Harga: ");
            int harga = input.nextInt();
            System.out.print("Masukan Total: ");
            int total = input.nextInt();
            int Total_Keseluruhan = (harga + total) * berat;
            
            System.out.println("========================================================");
            System.out.println("Nama    : " + nama);
            System.out.println("Layanan : " + service);
            System.out.println("Jenis   : " + jenis);
            System.out.println("Berat   : " + berat + " kg");
            System.out.println("Harga   : " + harga);
            System.out.println("Total   : " + total);
            System.out.println("========================================================");
            System.out.println("Total_Keseluruhan Rp :" + Total_Keseluruhan );
            System.out.println("========================================================");
        } else {
            System.out.println("Program dihentikan.");
        }
        input.close();
    }
}
package P2_Noval_Athilah ;
import java.util.Scanner;


public class tugas {
    public static void main(String[] args){
        
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Masukan Nama: ");
                String nama = input.nextLine();
                System.out.print("Masukan Usia: ");
                int usia = input.nextInt();
                System.out.print( "Nama saya adalah " + nama + " Dan Usia saya " + usia + "Th");
            }



    }
    
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String keterangan;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan mata kuliah (algoritma/pemrograman) : ");
        String matkul = input.nextLine().toLowerCase();

        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();

        switch (matkul) {
            case "algoritma":
                if (nilai >= 0 && nilai <= 69) {
                    keterangan = "Logika Kurang Baik";
                } else if(nilai >= 70 && nilai <= 100) {
                    keterangan = "Logika Baik";
                } else {
                    keterangan = "Error : Nilai tidak valid!";
                }
                break;
        
            case "pemrograman":
                if (nilai >= 0 && nilai <= 50) {
                    keterangan = "Penguasaan Program Sangat Kurang";
                } else if(nilai >= 51 && nilai <= 74) {
                    keterangan = "Penguasaan Program Kurang";
                } else if(nilai >= 75 && nilai <= 100) {
                    keterangan = "Penguasaan Program Baik";
                } else {
                    keterangan = "Error : Nilai tidak valid!";
                }
                break;
        
            default:
                keterangan = "Error : Mata kuliah tidak valid!";
                break;
        }

        System.out.println("Keterangan : " + keterangan);

        input.close();
    }
}

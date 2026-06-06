import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        
        System.out.println("=== Program Input Data Mahasiswa ===");
        System.out.print("Jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            Mahasiswa mhs = new Mahasiswa();
            
            System.out.println("\n--- Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            mhs.setNIM(nim);
            
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            mhs.setNama(nama);
            
            System.out.print("Nilai: ");
            int nilai = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            mhs.setNilai(nilai);
            
            daftarMahasiswa.add(mhs);
        }
        
        // Tampilkan data semua mahasiswa
        System.out.println("\n" + "=".repeat(50));
        System.out.println("DATA MAHASISWA");
        System.out.println("=".repeat(50));
        
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mhs = daftarMahasiswa.get(i);
            System.out.println("NIM\t: " + mhs.getNIM());
            System.out.println("Nama\t: " + mhs.getNama());
            System.out.println("Nilai\t: " + mhs.getNilai());
            System.out.println("Grade\t: " + mhs.getGrade());
            System.out.println("-".repeat(50));
            
            if (mhs.isLulus()) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        
        // Tampilkan statistik
        System.out.println("\n=== STATISTIK ===");
        System.out.println("Jumlah Mahasiswa\t\t: " + daftarMahasiswa.size());
        System.out.println("Jumlah Mahasiswa Lulus\t\t: " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus\t: " + jumlahTidakLulus);
        
        scanner.close();
    }
}

public class Mahasiswa {
    private String nim;
    private String nama;
    private int nilai;
    private String grade;

    // Constructor
    public Mahasiswa() {
    }

    // Setter untuk NIM
    public void setNIM(String nim) {
        this.nim = nim;
    }

    // Setter untuk NAMA
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk NILAI dan menghitung GRADE
    public void setNilai(int nilai) {
        this.nilai = nilai;
        hitungGrade();
    }

    // Method untuk menghitung grade berdasarkan nilai
    private void hitungGrade() {
        if (nilai >= 80) {
            this.grade = "A";
        } else if (nilai >= 70) {
            this.grade = "B";
        } else if (nilai >= 60) {
            this.grade = "C";
        } else if (nilai >= 50) {
            this.grade = "D";
        } else {
            this.grade = "E";
        }
    }

    // Getter untuk NIM
    public String getNIM() {
        return nim;
    }

    // Getter untuk NAMA
    public String getNama() {
        return nama;
    }

    // Getter untuk NILAI
    public int getNilai() {
        return nilai;
    }

    // Getter untuk GRADE
    public String getGrade() {
        return grade;
    }

    // Method untuk cek apakah lulus
    public boolean isLulus() {
        return grade.equals("A") || grade.equals("B") || grade.equals("C");
    }

    // Method untuk menampilkan info mahasiswa
    public void tampilInfo() {
        System.out.println("NIM\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Nilai\t: " + nilai);
        System.out.println("Grade\t: " + grade);
    }
}

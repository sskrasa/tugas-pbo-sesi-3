# Tugas PBO Sesi III - Program Penilaian Mahasiswa

## Deskripsi Tugas
Tugas ini membahas pembuatan program berbasis objek untuk mengelola data mahasiswa dan menghitung grade mereka:
1. Input berupa NIM, NAMA, dan NILAI menggunakan class `Scanner`.
2. Sistem penilaian grade berdasarkan range nilai.
3. Menampilkan data mahasiswa dengan format yang rapi.
4. Menampilkan statistik jumlah mahasiswa lulus dan tidak lulus.
5. Menggunakan ArrayList untuk menyimpan data multiple mahasiswa.

## File dalam folder
- `Mahasiswa.java` - class untuk merepresentasikan data mahasiswa dengan method setter, getter, dan perhitungan grade.
- `Main.java` - program utama untuk input, proses, dan output data mahasiswa.
- `build.sh` - script untuk mengkompilasi semua file Java.
- `.gitignore` - agar file kelas hasil kompilasi tidak masuk Git.

## Struktur Grade
- Nilai 100-80: Grade A (Lulus)
- Nilai 79-70: Grade B (Lulus)
- Nilai 69-60: Grade C (Lulus)
- Nilai 59-50: Grade D (Tidak Lulus)
- Nilai < 50: Grade E (Tidak Lulus)

## Class Mahasiswa
Class ini memiliki atribut:
- `nim`: String (nomor induk mahasiswa)
- `nama`: String (nama mahasiswa)
- `nilai`: int (nilai ujian)
- `grade`: String (grade berdasarkan nilai)

Method yang tersedia:
- Setter: `setNIM()`, `setNama()`, `setNilai()`
- Getter: `getNIM()`, `getNama()`, `getNilai()`, `getGrade()`
- `hitungGrade()`: Menghitung grade berdasarkan nilai
- `isLulus()`: Mengecek apakah mahasiswa lulus
- `tampilInfo()`: Menampilkan informasi mahasiswa

## Program Utama (Main.java)
Program ini:
1. Menerima input jumlah mahasiswa dari user.
2. Mengumpulkan data setiap mahasiswa (NIM, Nama, Nilai).
3. Menyimpan semua data ke dalam ArrayList.
4. Menampilkan daftar lengkap mahasiswa dengan gradnya.
5. Menampilkan statistik: total mahasiswa, yang lulus, yang tidak lulus.

## Cara Mengkompilasi dan Menjalankan
```bash
cd /home/swift/PBO/tugas3
bash build.sh
java Main
```

Setelah menjalankan program, ikuti prompt untuk input jumlah mahasiswa dan data masing-masing.

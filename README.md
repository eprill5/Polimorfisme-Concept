# Polimorfisme-Concept

Buat program untuk penggajian sebuah perusahaan, terdapat dua jenis pegawai yaitu Pegawai Tetap dan Pegawai Harian. Setiap jenis pegawai memiliki cara penghitungan gaji yang berbeda.
a. Pegawai Tetap memiliki gaji bulanan tetap.
b. Pegawai Harian mendapatkan gaji berdasarkan jumlah jam kerja dikalikan dengan upah per jam.

Untuk mengelola data pegawai dan menghitung gaji masing-masing secara fleksibel, perusahaan ingin menggunakan konsep polimorfisme dalam OOP Java. Setiap jenis pegawai akan memiliki metode hitungGaji() sendiri yang diimplementasikan sesuai kebutuhannya. Melalui pendekatan ini, manajer perusahaan dapat memanggil method hitungGaji() tanpa harus peduli jenis pegawainya, karena masing-masing kelas akan mengatur logikanya sendiri.

Contoh output program :
Gaji Dina: Rp50.000.000
Gaji Andi: Rp40.000.000

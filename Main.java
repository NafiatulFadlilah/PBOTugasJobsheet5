package n.fadlilah.relasiclass.tugas;
import java.util.Scanner;
/*
 * @author Nafiaaeluv
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String answer;
        do{
            System.out.println("==========||PROGRAM TRANSAKSI PERPUSTAKAAN||==========");
            
            System.out.println("-------Input Data Petugas-------");
            System.out.println("ID Petugas: ");
            String namaPetugas = input.next();
            System.out.println("Nama: ");
            String idPetugas = input.next();
            Petugas pt = new Petugas(idPetugas, namaPetugas);
            
            System.out.println("-------Input Data Pengunjung-------");
            System.out.println("ID Pengunjung: ");
            String namaPengunjung = input.next();
            System.out.println("Nama: ");
            String idPengunjung = input.next();
            Pengunjung pj = new Pengunjung(idPengunjung, namaPengunjung);
            
            System.out.println("-------Input Data Penulis-------");
            System.out.println("Nama: ");
            String namaPenulis = input.next();
            System.out.println("Email: ");
            String email = input.next();
            Penulis pn = new Penulis(namaPenulis, email);
            
            System.out.println("-------Input Data Buku-------");
            System.out.println("ID Buku: ");
            String idBuku = input.next();
            System.out.println("Judul: ");
            String judul = input.next();
            System.out.println("ISBN: ");
            String isbn = input.next();
            System.out.println("Kategori: ");
            String kategori = input.next();
            System.out.println("Stok: ");
            int stok = input.nextInt();
            Buku bk = new Buku(idBuku, judul, isbn, kategori, stok, pn);
            
            System.out.println("-------Input Data Transaksi-------");
            System.out.println("ID Transaksi: ");
            String idTrans = input.next();
            System.out.println("Pilih jenis transaksi: 1. Pinjam 2. Kembali? (1 / 2)");
            int jawab = input.nextInt();
            switch(jawab){
                case 1:
                    System.out.println("Masukkan Jumlah Pinjam: ");
                    int nPinjam = input.nextInt();
                    Transaksi tr1 = new Transaksi(idTrans, pt, pj, bk, nPinjam);
                    tr1.pinjamBuku(nPinjam);
                    System.out.println(tr1.info());
                    break;
                case 2:
                    System.out.println("Masukkan Jumlah Kembali: ");
                    int nKembali = input.nextInt();
                    Transaksi tr2 = new Transaksi(idTrans, pt, pj, bk, nKembali);
                    tr2.kembaliBuku(nKembali);
                    System.out.println(tr2.info());
                    break;
            }
            
            System.out.println("Apakah anda ingin melakukan input transaksi lagi (y / Y)?");
            answer = input.next();            
        }while(answer.equalsIgnoreCase("Y"));
    }
}
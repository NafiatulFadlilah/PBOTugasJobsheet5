package n.fadlilah.relasiclass.tugas;

/*
 * @author Nafiaaeluv
 */
public class Transaksi {
    private String idTransaksi;
    private Petugas petugas;
    private Pengunjung pengunjung;
    private Buku buku;
    private int jumlah;
    
    Transaksi(String id, Petugas petugas, Pengunjung pengunjung, Buku buku, int jumlah){
        this.idTransaksi = id;
        this.petugas = petugas;
        this.pengunjung = pengunjung;
        this.buku = buku;
        this.jumlah = jumlah;
    }
    
    void setId(String id){
        this.idTransaksi = id;
    }
    
    String getId(){
        return idTransaksi;
    }
    
    void setPetugas(Petugas petugas){
        this.petugas = petugas;
    }
    
    Petugas getPetugas(){
        return petugas;
    }
    
    void setPengunjung(Pengunjung pengunjung){
        this.pengunjung = pengunjung;
    }
    
    Pengunjung getPengunjung(){
        return pengunjung;
    }
    
    void setBuku(Buku buku){
        this.buku = buku;
    }
    
    Buku getBuku(){
        return buku;
    }
    
    void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    int getJumlah(){
        return jumlah;
    }
    
    void pinjamBuku(int jumlah){
        buku.kurangStok(jumlah);
    }
    
    void kembaliBuku(int jumlah){
        buku.tambahStok(jumlah);
    }
    
    String info(){
        String info = "";
        info += "\nID Transaksi: " + idTransaksi + "\n";
        info += "\n-----|Data Petugas|-----\n" + petugas.info() + "\n";
        info += "-----|Data Pengunjung|-----\n" + pengunjung.info() + "\n";
        info += "-----|Data Buku|-----\n" + buku.info() + "\n";
        return info;
    }
}
package n.fadlilah.relasiclass.tugas;

/*
 * @author Nafiaaeluv
 */
public class Buku {
    private String idBuku;
    private String judul;
    private String isbn;
    private String kategori;
    private int stok;
    private Penulis penulis;
    
    Buku(String id, String judul, String isbn, String kategori, int stok, Penulis penulis){
        this.idBuku = id;
        this.judul = judul;
        this.isbn = isbn;
        this.kategori = kategori;
        this.stok = stok;
        this.penulis = penulis;
    }
    
    void setId(String id){
        this.idBuku = id;
    }
    
    String getId(){
        return idBuku;
    }
    
    void setJudul(String judul){
        this.judul = judul;
    }
    
    String getJudul(){
        return judul;
    }
    
    void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    String getIsbn(){
        return isbn;
    }
    
    void setKategori(String kategori){
        this.kategori = kategori;
    }
    
    String getKategori(){
        return kategori;
    }
    
    void setStok(int stok){
        this.stok = stok;
    }
    
    int getStok(){
        return stok;
    }
    
    void setPenulis(Penulis penulis){
        this.penulis = penulis;
    }
    
    Penulis getPenulis(){
        return penulis;
    }
    
    int kurangStok(int jumlah){
        return stok -= jumlah;
    }
    
    int tambahStok(int jumlah){
        return stok += jumlah;
    }
    
    String info(){
        String info = "";
        info += "ID Buku: " + idBuku + "\n";
        info += "Judul: " + judul + "\n";
        info += "ISBN: " + isbn + "\n";
        info += "Kategori: " + kategori + "\n";
        info += "Stok: " + stok + "\n";
        info += "Nama Penulis: " + penulis.info() + "\n";
        return info;
    }
}
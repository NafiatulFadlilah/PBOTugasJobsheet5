package n.fadlilah.relasiclass.tugas;

/*
 * @author Nafiaaeluv
 */
public class Pengunjung {
    private String idPengunjung;
    private String nama;
    
    Pengunjung(String id, String nama){
        this.idPengunjung = id;
        this.nama = nama;                
    }
    
    void setId(String id){
        this.idPengunjung = id;
    }
    
    String getId(){
        return idPengunjung;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    String getNama(){
        return nama;
    }
    
    String info(){
        String info = "";
        info += "ID Pengunjung: " + idPengunjung + "\n";
        info += "Nama Pengunjung: " + nama + "\n";
        return info;
    }
}
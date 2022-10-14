package n.fadlilah.relasiclass.tugas;

/*
 * @author Nafiaaeluv
 */
public class Petugas {
    private String idPetugas;
    private String nama;
    
    Petugas(String id, String nama){
        this.idPetugas = id;
        this.nama = nama;
    }
    
    void setId(String id){
        this.idPetugas = id;
    }
    
    String getId(){
        return idPetugas;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    String getNama(){
        return nama;
    }
    
    String info(){
        String info = "";
        info += "ID Petugas: " + idPetugas + "\n";
        info += "Nama Petugas: " + nama + "\n";
        return info;
    }
}
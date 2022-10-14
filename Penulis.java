package n.fadlilah.relasiclass.tugas;

/*
 * @author Nafiaaeluv
 */
public class Penulis {
    private String nama;
    private String email;
    
    Penulis(String nama, String email){
        this.nama = nama;
        this.email = email;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    String getNama(){
        return nama;
    }
    
    void setEmail(String email){
        this.email = email;
    }
    
    String getEmail(){
        return email;
    }
    
    String info(){
        String info = "";
        info +=  nama + "\n";
        info += "Email Penulis: " + email + "\n";
        return info;
    }
}
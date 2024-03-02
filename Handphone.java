public class Handphone {
    String jenis_hp;
    int tahun_pembuatan;

    // Method untuk mengatur data handphone
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp; // Menggunakan "this" untuk merujuk ke variabel instance
        this.tahun_pembuatan = tahun_pembuatan; // Menggunakan "this" untuk merujuk ke variabel instance
    }
    
    // Method untuk mendapatkan jenis handphone
    String getJenisHP(){
        return jenis_hp;
    }

    // Method untuk mendapatkan tahun pembuatan handphone
    int getTahunPembuatan(){
        return tahun_pembuatan;
    }

    public static void main(String args []){
        Handphone hp = new Handphone(); // Menggunakan "new Handphone()" untuk membuat instance Handphone
        hp.setDataHP("Smartphone", 2022); // Mengatur data handphone
        System.out.println("Jenis HP: " + hp.getJenisHP()); // Mencetak jenis handphone
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan()); // Mencetak tahun pembuatan handphone
    }

    
}

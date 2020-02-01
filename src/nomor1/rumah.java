package nomor1;

public class rumah {
    String idRumah;
    String idPemilikRumah;
    int jumlahOrang;

    public rumah(String idRumah, String idPemilikRumah, int jumlahOrang) {
        this.idRumah = idRumah;
        this.idPemilikRumah = idPemilikRumah;
        this.jumlahOrang = jumlahOrang;
    }
    public String getIdRumah() {
        return this.idRumah;
    }
    public String getIdPemilikRumah() {
        return this.idPemilikRumah;
    }
    public int getJumlahOrang() {
        return this.jumlahOrang;
    }
    public void tampilIDRumah(){
        System.out.println("ID RUmah : "+ getIdRumah());
    }
}
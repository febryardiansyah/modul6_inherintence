package nomor3;

public class Anak {
    int idAnak;
    String namaAnak;
    int umurAnak;
    String statusAnak;

    public Anak(int idAnak, String namaAnak, int umurAnak, String statusAnak) {
        this.idAnak = idAnak;
        this.namaAnak = namaAnak;
        this.umurAnak = umurAnak;
        this.statusAnak = statusAnak;
    }
    public int getIdAnak() {
        return idAnak;
    }
    public String getNamaAnak() {
        return namaAnak;
    }
    public int getUmurAnak() {
        return umurAnak;
    }
    public String getStatusAnak() {
        return statusAnak;
    }
}

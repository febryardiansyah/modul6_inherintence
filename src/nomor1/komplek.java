package nomor1;

import java.util.ArrayList;
import java.util.List;
public class komplek {
    String idKomplek;
    String namaKomplek;
    int jmlRumah;
    List<String> idRumah;

    public komplek( String idKomplek, List<String> idRumah) {
        this.idKomplek = idKomplek;
        this.idRumah = idRumah;
    }
    public komplek() {
    }
    public String getIdKomplek() {
        return idKomplek;
    }
    public void setIdKomplek(String idKomplek) {
        this.idKomplek = idKomplek;
    }
    public String getNamaKomplek() {
        return namaKomplek;
    }
    public void setNamaKomplek(String namaKomplek) {
        this.namaKomplek = namaKomplek;
    }

    public int getJmlRumah() {
        return jmlRumah;
    }
    public void setJmlRumah(int jmlRumah) {
        this.jmlRumah = jmlRumah;
    }
    public void getDataKomplek(){
        System.out.println("Nama Komplek : "+getNamaKomplek()+"\nID Komplek : "+getIdKomplek()+"\nJumlah Rumah : "+getJmlRumah());
    }
    public static void main(String[] args) {
        rumah rumah1 = new rumah("Rumah Mantan","Kamu",10);
        rumah rumah2 = new rumah("Rumah Hantu","Aku",100);
        List<rumah> rumahList = new ArrayList<>();
        rumahList.add(rumah1);
        rumahList.add(rumah2);

        komplek komplek1 = new komplek();
        komplek1.setIdKomplek("123");
        komplek1.setNamaKomplek("Komplek Mawar");
        komplek1.setJmlRumah(2);

        System.out.println("Data Komplek : ");
        komplek1.getDataKomplek();
        System.out.println();
        for (int i=0;i<2;i++){
            System.out.println("Rumah Ke : "+(i+1));
            rumahList.get(i).tampilIDRumah();
            System.out.println();
        }
    }

}

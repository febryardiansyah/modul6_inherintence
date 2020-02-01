package nomor3;

import java.util.ArrayList;
import java.util.List;
public class keluarga {
    List<Anak> anakList = new ArrayList<>();
    String namaKeluarga;
    String kotaAsal;
    private Ayah ayah;
    private Ibu ibu;

    public keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }
    public String getNamaKeluarga() {
        return namaKeluarga;
    }
    public String getKotaAsal() {
        return kotaAsal;
    }
    public void addAnggotaKeluarga (Ayah ayah, Ibu ibu, List<Anak>anakList){
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = anakList;
    }
    public List<Anak> getAnakList() {
        return anakList;
    }
    public Ayah getAyah() {
        return ayah;
    }
    public Ibu getIbu() {
        return ibu;
    }
    public void getDataKeluarga(){
        System.out.println("Nama Keluarga : "+ getNamaKeluarga()+"\t\tAsal Keluarga : "+getKotaAsal());
        System.out.println("Nama Ayah : "+ getAyah().getNamaAyah()+"\tID : "+getAyah().getIdAyah()+"\t"+"Umur : "+getAyah().getUmurAyah());
        System.out.println("Nama Ibu : "+ getIbu().getNamaIbu()+"\tID : "+getIbu().getIdIbu()+"\tUmur : "+getIbu().getUmurIbu());
        System.out.println("==========================");
        System.out.println("ID "+"Nama "+"\tUmur"+"\tStatus");
        for (Anak ara:getAnakList()) {
            System.out.println(ara.getIdAnak()+" "+ara.getNamaAnak()+"\t"+ara.getUmurAnak()+"\t\t"+ara.getStatusAnak());
        }
        System.out.println("==========================");
    }
    public static void main(String[] args) {
        keluarga family = new keluarga("Uzumaki","Konoha");
        Ayah namaAyah = new Ayah(1,"Naruto",28);
        Ibu namaIbu = new Ibu(2,"Hinata",28);
        Anak anak1 = new Anak(3,"Boruto",15,"Jomblo");
        Anak anak2 = new Anak(4,"Himawari",10,"Jomblo");

        List<Anak> anakList = new ArrayList<>();
        anakList.add(anak1);
        anakList.add(anak2);
        family.addAnggotaKeluarga(namaAyah,namaIbu,anakList);
        family.getDataKeluarga();
    }
}

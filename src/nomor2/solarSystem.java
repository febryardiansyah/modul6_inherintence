package nomor2;

import java.util.ArrayList;
import java.util.List;
public class solarSystem {
    String id,nama;
    List<Planet>planets = new ArrayList<>();

    public solarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    public int getTotalMember(){
        return planets.size();
    }
    public List<Planet>getPlanets() {
        return planets;
    }
    public void setPlanets(List<Planet> planets){
        this.planets = planets;
    }
    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public void getData(){
        System.out.println("Id Planet : "+getId());
        System.out.println("Nama Planet : "+getNama());
        System.out.println("ID"+"\turutan"+"\tNama");
        for (Planet Arara:getPlanets()) {
            System.out.println(Arara.getIdPlanet()+" \t"+Arara.getUrutanPlanet()+" \t\t"+Arara.getNamaPlanet());
        }
    }
    public static void main(String[] args) {
        solarSystem s1 = new solarSystem("M","Matahari");

        List<Planet>planets = new ArrayList<>();
        Planet planet1 = new Planet(32,1,"Merkurius");
        Planet planet2 = new Planet(52,2,"Venus");
        Planet planet3 = new Planet(12,3,"Bumi");
        Planet planet4 = new Planet(31,4,"Mars");
        Planet planet5 = new Planet(91,5,"Jupiter");
        Planet planet6 = new Planet(69,6,"Saturnus");
        Planet planet7 = new Planet(76,7,"Uranus");
        Planet planet8 = new Planet(75,8,"Neptunus");

        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);
        s1.setPlanets(planets);

        s1.getData();
        System.out.println("Total Member : "+s1.getTotalMember());
    }
}

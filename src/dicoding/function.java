package dicoding;

public class function {
    public static int hitungLuas(int panjang, int lebar){
        int luas= panjang*lebar;
        return luas;
    }
    public static void main(String[] args) {
        int p = 10;
        int l= 10;

        int hasil=hitungLuas(p,l);

        System.out.println(hasil);
    }
}

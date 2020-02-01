package dicoding;

import java.util.Scanner;

public class cobalha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maksimal,jml,nilai[];

        System.out.print("masukan jumlah angka : ");
        jml = scan.nextInt();
        nilai=new int[jml];

        for (int i = 0;i<jml;i++) {
            System.out.print("Masukan Nilai ke-"+(i+1)+": ");
            nilai[i]=scan.nextInt();
        }
        maksimal=nilai[0];
        for (int i=0;i<jml;i++){
            if (nilai[i]>maksimal){
                maksimal=nilai[i];
            }
        }
        System.out.print("semua nilai yang di inputkan : ");
        for (int x:nilai){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Nilai Terbesar adalah : "+maksimal);
    }
}

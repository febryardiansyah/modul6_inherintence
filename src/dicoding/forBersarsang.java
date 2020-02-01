package dicoding;

public class forBersarsang {
    public static void main(String[] args) {
        int a = 5;
        for (int b = 1; b <= a; b++){
            for (int c = 4; c >= b; c--) {
                System.out.print(' ');
            }
            for (int d = 1; d <= b; d++){
                System.out.print('X');
            }
            System.out.println();
        }
        for (int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("X");
            }
            System.out.println("");
        }
        for(int x=1;x<=5;x++){
            for (int z=4;z>=x;z--){
                System.out.print(" ");
            }
            for (int g=1;g<=x;g++){
                System.out.print("*");
            }
            for (int h=1;h<x;h++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

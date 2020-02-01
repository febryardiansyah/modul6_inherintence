package dicoding;

public class ascending {
    public static void main(String[] args) {
        int data[] = {3,6,5,7,9,2,4,1,8};
        int a;

        System.out.println("Data Sebelum urut Ascending : ");
        for (int i=0;i<data.length;i++){
            System.out.println("Data ke- "+i+" = "+data[i]);
        }
        for (int i=0;i<data.length-1;i++){
            for (int j=i+1;j<data.length;j++)
                if (data[i]>data[j]){
                 a=data[i];
                 data[i]=data[j];
                 data[j]=a;
                }
        }
        System.out.println("Setelah diurutkan : ");
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
    }
}

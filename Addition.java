public class Addition{
    public static void addition(int a[][],int b[][],int c1,int c2){
        int sum[][]=new int[c1][c2];
        for(int i=0;i<c1;i++){
            for(int j=0;j<c2;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<c1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(sum[i][j]);
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int a[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int b[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int c1=3,c2=3;
        addition(a,b,c1,c2);
    }
}
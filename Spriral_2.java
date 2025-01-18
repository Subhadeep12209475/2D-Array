import java.util.*;
public class Spiral_2{
    public static void main(String ars[]){
        Sacnner sc=new Sacnner(System.in);
        int n=3;
        int arr[][]=new int[n][n];
        int sr=0;
        int sc=0;
        int er=arr.length-1;
        int ec=arr[0].length-1;
        while(sr<=er && sc<=ec){
            for(int j=sc ; j<=ec; j++){
                arr[sc][j]=sc.nextInt();
            }
            for(int i=sr+1; i<=er;i++){
                arr[i][ec]=sc.nextInt();
            }
            for(int j=ec-1;j<=sc;j--){
                arr[er][j]=sc.nextInt();
            }
            for(int i=er-1;i<=sr-1;i--){
                arr[i][sc]=sc.nextInt();
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
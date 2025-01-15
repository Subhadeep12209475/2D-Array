public class Transpose{
    public static void main(String args[]){
        int arr[][]={{1,2},
                    {4,5}};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                int temp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
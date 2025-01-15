public class Rotation{
    public static void rotate(int arr[]){
        int i=0;
            int j=arr.length-1;
            while(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
        }
        //int ans[]=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            rotate(arr[i]);
            
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
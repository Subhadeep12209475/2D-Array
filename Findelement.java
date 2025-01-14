public class Findelement{
    public static boolean find(int arr[][], int key){
        int i=0;int j=arr[0].length-1;
        while(i<= arr.length && j>=0){
            if(key==arr[i][j]){
                System.out.println(i+","+j);
                return true;
            }
            else if(key< arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("element not found");
        return false;
    }
    public static void main(String args[]){
        int arr[][]={{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,40}};
        int key=33;
        find(arr,key);
    }
}
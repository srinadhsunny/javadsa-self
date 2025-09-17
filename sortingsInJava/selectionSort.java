public class sorting{
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]={7,1,3,8,2};
        //insertion sort
        //outer loop(n-1 iterations)
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            //check if selected lement [1] is smalleer than jth element(before) fro shifting
            while(j>=0&&current<arr[j]){
                //shift the present values to next+1
                arr[j+1]=arr[j];
                //1st->[7,7,3,8,2]
                j--;
            }
            //insertion after shifting or without shifting
            arr[j+1]=current;

        }
        
        printarr(arr);
        

    }
}

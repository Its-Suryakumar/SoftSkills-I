public class maxprod {
    public static void main(String[] args) {
        int arr[]={-5,-4,-1,-2};
        int max= arr[0],min = arr[0],m=arr[0];
        int temp = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>0){
                max = Math.max(arr[i],max*arr[i]);
                min = Math.min(arr[i],min*arr[i]);
            }
            else if(arr[i]==0){
                max=min=0;
            }
            else{
                temp = arr[i];
                max = Math.max(arr[i],min*arr[i]);
                min = Math.min(arr[i],temp*arr[i]);
            }
            m = Math.max(m, max);
        } 
        System.out.println(m);
    }
}

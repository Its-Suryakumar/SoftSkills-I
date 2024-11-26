public class leader {
    public static void findLeader(int[] arr){
        int length = arr.length;
        int max = arr[length-1];
        for(int i=length-2;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        findLeader(arr);
    }
}

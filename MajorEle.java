public class MajorEle {
    public static void main(String[] args) {
        int[] arr = { 1, 2,2,2,2, 3, 4, 5, 2, 2, 2, 2, 4, 9, 5 };
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (count > n/2) {
                System.out.println("Majority Element: " + arr[i]);
                return;
            }
        }
        
        System.out.println("No Majority Element");
    }
}
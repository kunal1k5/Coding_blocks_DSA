package Binary_Search_Adv;

public class first_ceiling {

    public static void main(String[] args) {
        int arr[] = {1,2,5,8,10,10,12,19};
        int k = 5;
        int n = FirstCeiling(arr, k);
        System.out.println(n); // should print 2 (index of 5)
    }

    public static int FirstCeiling(int[] arr, int k) {
        int st = 0;
        int last = arr.length - 1;
        int ans = -1;  // store potential ceiling index

        while (st <= last) {
            int mid = st + (last - st) / 2;

            if (arr[mid] >= k) {
                ans = mid;       // possible ceiling
                last = mid - 1;  // try to find smaller index
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
}
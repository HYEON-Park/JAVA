public class hub_2 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        int ans = 0;

        for (int i = 1; i < arr.length; i++) {
            ans += arr[0] * arr[i];
        }

        for (int i = 2; i < arr.length; i++) {
            ans += arr[1] * arr[i];
        }

        System.out.println(ans);

    }
}

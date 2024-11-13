public class CountingBit {

    public CountingBit() {}

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int b = ans[i >> 1];
            int c = (i & 1);
            ans[i] = b + c;
        }

        return ans;
    }
}

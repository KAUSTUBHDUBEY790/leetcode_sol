public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    long[] f = new long[n + 1];
    f[0] = 0;
    f[1] = (1L * p * p) % mod;
    for (int i = 2; i <= n; i++) {
        f[i] = (f[i - 1] + (1L * f[i - 2] * (p - 1 + mod)) % mod) % mod * p % mod;
    }
    for (int i = 1; i <= n; i++) {
        System.out.print(f[i] + " ");
    }
}

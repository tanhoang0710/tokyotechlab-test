import java.util.Scanner;

public class Problem1 {
    private Scanner sc;

    public Problem1(Scanner sc) {
        this.sc = sc;
    }

    public int result(int x, int y) {
        int[][] dp = new int[x+1][y+1];
        dp[0][0] = 1;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if (i > 0) {
                    dp[i][j] += dp[i-1][j];
                }
                if (j > 0) {
                    dp[i][j] += dp[i][j-1];
                }
            }
        }
        return dp[x][y];
    }

    public void solve(){
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            int a, b;
            String s = sc.nextLine();
            String tmp[] = s.split(" ");
            a = Integer.parseInt(tmp[0]);
            b = Integer.parseInt(tmp[1]);
            System.out.println(result(a, b));
        }
    }
}

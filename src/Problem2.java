import java.util.Scanner;

public class Problem2 {
    private Scanner sc;

    public Problem2(Scanner sc) {
        this.sc = sc;
    }

    public int result(int m, int d, int k, int c){
        int count = 0;
        if(m * k <= d) return 0;
        else if(d == k) return -1;
        else{
            int a;
            while(m > 0){
                if(m * k > d) count += 1;
                double tmp = (double) d / (double) k;
                if(d % k == 0) a = (int) tmp - 1;
                else a = (int) tmp;
                m -= a;
            }
            return count * c;
        }
    }

    public void solve(){
        int m, d, k, c;
        String s = sc.nextLine();
        String tmp[] = s.split(" ");
        m = Integer.parseInt(tmp[0]);
        d = Integer.parseInt(tmp[1]);
        k = Integer.parseInt(tmp[2]);
        c = Integer.parseInt(tmp[3]);
        System.out.println(result(m, d, k, c));
    }
}

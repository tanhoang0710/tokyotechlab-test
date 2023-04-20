import java.util.Scanner;
import java.util.Stack;

public class Problem3 {
    private Scanner sc;
    public Problem3(Scanner sc) {
        this.sc = sc;
    }

    private boolean check(String s){
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) == '[') || (s.charAt(i) == '{') || (s.charAt(i) == '(')){
                st.push(String.valueOf(s.charAt(i)));
            }else {
                if(st.empty()) return false;
                else {
                    String tmp = st.peek();
                    if (s.charAt(i) == ']' && tmp.equals("[")) {
                        st.pop();
                    } else if (s.charAt(i) == '}' && tmp.equals("{")) {
                        st.pop();
                    } else if (s.charAt(i) == ')' && tmp.equals("(")) {
                        st.pop();
                    } else return false;
                }
            }
        }
        return st.size() == 0;
    }

    public void solve(){
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            if(check(s)) System.out.println("true");
            else System.out.println("false");
        }
    }
}

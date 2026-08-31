import java.io.*;
import java.util.StringTokenizer;

public class DivisoresDelFactorial_126 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            if (p < 0 && n < 0) {
                break;
            }

            if (p == 1 || p <= n) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }

        System.out.print(output);
    }
}
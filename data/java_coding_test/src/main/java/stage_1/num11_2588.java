package stage_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num11_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(A * (B%10));
        sb.append('\n');

        sb.append(A * ((B%100)/10));
        sb.append('\n');

        sb.append(A * (B/100));
        sb.append('\n');

        sb.append(A * B);

        System.out.print(sb);

        /*
        import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int A = in.nextInt();
                String B = in.next();

                in.close();

                System.out.println(A * (B.charAt(2) - '0'));   //chartAt은 아스키코드를 반환 따라서 -'0'으로 조정
                System.out.println(A * (B.charAt(1) - '0'));
                System.out.println(A * (B.charAt(0) - '0'));
                System.out.println(A * Integer.parseInt(B));

            }
        }
        */
    }
}

import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i = 0;i<T;i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int critical = 0;
            int chill = 0;
            int N = Integer.parseInt(st1.nextToken());
            int D = Integer.parseInt(st1.nextToken());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++) {
                int age = Integer.parseInt(st2.nextToken());
                if((age>=80)||(age<=9)) critical ++;
                else chill++;
            }
            System.out.println((critical / D + ((critical % D) == 0 ? 0 : 1)) +
            (chill / D + ((chill % D) == 0 ? 0 : 1)));
        }
    }    
}
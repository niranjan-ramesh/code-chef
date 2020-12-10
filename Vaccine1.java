import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D1 = Integer.parseInt(st.nextToken());
        int V1 = Integer.parseInt(st.nextToken());
        int D2 = Integer.parseInt(st.nextToken());
        int V2 = Integer.parseInt(st.nextToken());

        int P = Integer.parseInt(st.nextToken());

        int d = 0;
        int total = 0;
        while(total < P) {
            d=d+1;
            if(d >= D1) total = total + V1;
            if(d>=D2) total = total + V2; 
        }
        System.out.println(d); 
    }
}
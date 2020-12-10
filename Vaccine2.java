import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i = 0;i<T;i++) {
            StringTokenizer st1 = new StringTokenizer(br1.readLine());
            long first = Integer.parseInt(st1.nextToken());
            long second = Integer.parseInt(st1.nextToken());
            System.out.println((first/2) * (second/2) + (first / 2 + ((first % 2 == 0) ? 0 : 1)) * (second / 2 + ((second % 2 == 0) ? 0 : 1)));
        }
    }    
}
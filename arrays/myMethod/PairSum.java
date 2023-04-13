package arrays.myMethod;

import java.io.*;
import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;


        String[] s = new String[1];

        s = in.readLine().split(" ");

        int[] a = new int[s.length];

        for(i=0; i<s.length; i++)
            a[i] = Integer.parseInt(s[i]);

        Arrays.sort(a);

        int sum = Integer.parseInt(in.readLine());

        int low = 0;
        int high = a.length - 1;

        while(low<high){

            if(a[low] + a[high] > sum)
                high--;
            else if (a[low] + a[high] < sum)
                low++;
            else {
                System.out.println("PAIR : (" + a[low] + ", " + a[high] + ")");
                low++; high--;
            }
        }

    }
}

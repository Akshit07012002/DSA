package arrays.myMethod;

import java.io.*;

public class MergeSortedArray {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] s1 = new String[1];
        s1 = in.readLine().split(",");

        String[] s2 = new String[1];
        s2 = in.readLine().split(",");

        int m = s1.length;
        int n = s2.length;

        int[] a = new int[m];
        int[] b = new int[n];

        for(int i=0; i<m; i++)
            a[i] = Integer.parseInt(s1[i]);
        for(int i=0; i<n; i++)
            b[i] = Integer.parseInt(s2[i]);

        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            a[finished--] = (a[tail1] > b[tail2]) ? a[tail1--] : b[tail2--];
        }

        while (tail2 >= 0) {
            a[finished--] = b[tail2--];
        }

       for (int x : a) {
            System.out.println(x);
        }


    }
}

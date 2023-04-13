package arrays.myMethod;

import java.io.*;

public class MaximumSubarray {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(in.readLine());
        int[] a = new int[size];

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(in.readLine());

            sum += a[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }

        System.out.println(max);

    }
}

package arrays.myMethod;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumRepeat {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(in.readLine());
        int size = Integer.parseInt(in.readLine());
        int[] a = new int[size];
        String[] s =  in.readLine().split(" ");

        for(int i=0; i<size; i++)
            a[i] = Integer.parseInt(s[i]);

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<size; i++){
            if(map.containsKey(target - a[i])){
                result[1] = i;
                result[0] = map.get(target - a[i]);
                System.out.println(Arrays.toString(result));
            }
            map.put(a[i], i);
        }

        System.out.println(Arrays.toString(result));

    }
}

package arrays.striver;

import java.io.*;
import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[1] = i;
                ans[0] = map.get(target - nums[i]);
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] s = new String[1];
        s = in.readLine().split("");

        int target = Integer.parseInt(in.readLine());
        int[] n = new int[s.length];
        for (int i=0; i<s.length; i++)
            n[i] = Integer.parseInt(s[i]);

        int[] a = twoSum(n,target);

        System.out.println("[" + a[0] + ", " + a[1] + "]");
    }
}
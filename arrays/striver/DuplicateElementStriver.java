package arrays.striver;

//check duplicates

import java.io.*;
import java.util.*;

public class DuplicateElementStriver{

    public static void main(String[] args) throws IOException{

//		STRIVER'S METHOD - TURTLE METHOF ( FLOYD'S CYCLE )

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int[] a = new int[n];

        for(int x=0; x<n; x++)
            a[x] = Integer.parseInt(in.readLine());

        int slow = a[0];
        int fast = a[0];


        // check for the first collision for both the slow and fast pointers
        do {
            slow = a[slow];
            fast = a[a[fast]];
        } while(slow!=fast);

        // reset fast to zeroeth index
        fast = a[0];

        // check for second collision
        while(slow!=fast) {
            slow = a[slow];
            fast = a[fast];
        }

        System.out.println(slow);
    }

}

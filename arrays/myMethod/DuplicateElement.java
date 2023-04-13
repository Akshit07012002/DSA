package arrays.myMethod;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(in.readLine());
        int i = 0;
        int[] a = new int[size];

        String[] s = new String[1];

        s = in.readLine().split(" ");

        for(i=0; i<s.length; i++)
            a[i] = Integer.parseInt(s[i]);

        HashSet<Integer> uniqueNum = new HashSet<>(); // unordered collection of objects which disregards duplicate values
        boolean duplicateFound = false; // flag

        // push each element of array into the set whilst checking for duplicates
        for(i=0; i<s.length; i++){

            if(uniqueNum.contains(a[i])){
                duplicateFound = true;
                System.out.println("Duplicate Element Found : " + a[i]);
            }
            else
                uniqueNum.add(a[i]);
        }

        // no duplicates found
        if(!duplicateFound)
            System.out.println("-1");

    }

}

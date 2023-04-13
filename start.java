import java.util.*;

public class start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = new int[n - k + 1];
        int j = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (q.size() > 0 && q.peek() < i - k + 1) {
                q.removeFirst();
            }
            while (q.size() > 0 && arr[q.peekLast()] < arr[i]) {
                q.removeLast();
            }
            q.addLast(i);
            if (i >= k - 1) {
                ans[j] = arr[q.peek()];
                j++;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

        sc.close();
    }
}
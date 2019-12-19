package com.codegym.task.task34.task3403;

public class Solution {
    public void recurse(int n) {
        int count = 0;
        if(n<=1)

        for (int i = 2; i <= (n); i++) {
            while (n % i == 0) {
                n /= i;
                count++;
                if (count != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.recurse(132);
    }
}

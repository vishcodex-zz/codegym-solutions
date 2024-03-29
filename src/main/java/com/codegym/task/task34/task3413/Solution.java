package com.codegym.task.task34.task3413;

/*
Cache based on SoftReference

*/

import sun.misc.SoftCache;

public class Solution {
    public static void main(String[] args) {
        SoftCache cache = new SoftCache();

        for (long i = 0; i < 2_500_000; i++) {
            cache.put(i, new AnyObject(i, null, null));
        }
    }
}
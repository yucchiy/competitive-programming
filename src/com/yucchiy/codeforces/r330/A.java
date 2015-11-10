package com.yucchiy.codeforces.r330;

import java.util.Scanner;

public class A {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String... args) {
        final int n = sc.nextInt(), m = sc.nextInt();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                final int a = sc.nextInt(), b = sc.nextInt();
                if (a == 1 || b == 1) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}

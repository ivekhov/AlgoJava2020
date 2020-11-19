package com.otus.algo.tickets_lucky_1_1;


import com.otus.algo.tester.Task;

import java.math.BigInteger;

public class LuckyTickets implements Task {

    int n;
    int qty;

    @Override
    public int go(String row) {
        n = Integer.parseInt(row);
        // ToDo : BigInt on 5 file
        // ToDo 2 : rewrite algoryth

        qty = 0;
        NextDigit(0, 0, 0);
        System.out.println(qty);
        return qty;
    }

    public void NextDigit(int nr, int sum1, int sum2) {
        if (nr == 2 * n) {
            if (sum1 == sum2)
                qty++;
            return;
        }
        for (int a = 0; a <= 9; a++) {
            if (nr < n)
                NextDigit(nr + 1, sum1 + a, sum2);
            else
                NextDigit(nr + 1, sum1, sum2 + a);
        }
    }
}

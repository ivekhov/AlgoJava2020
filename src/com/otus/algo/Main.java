package com.otus.algo;


import com.otus.algo.string_length_0.StringLength;
import com.otus.algo.tester.Tester;
import com.otus.algo.tickets_lucky_1_1.LuckyTickets;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // task #0 String Length
//        testStringLength();
        testLuckyTickets();

    }
    public static void testStringLength() throws IOException {
        StringLength task = new StringLength();
        String path = "./data/strings_0";
        Tester tester = new Tester(task, path);
        tester.runTest();
    }

    public static void testLuckyTickets() throws IOException {
        LuckyTickets task = new LuckyTickets();
        String path = "./data/tickets_1";
        Tester tester = new Tester(task, path);
        tester.runTest();
    }

}

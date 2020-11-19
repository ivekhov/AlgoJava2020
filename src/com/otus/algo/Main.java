package com.otus.algo;


import com.otus.algo.algebraic_algorythms_lesson_02.Power;
import com.otus.algo.harry_potter.HarryPotter;
import com.otus.algo.string_length_0.StringLength;
import com.otus.algo.tester.Tester;
import com.otus.algo.tickets_lucky_1_1.LuckyTickets;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

// Lesson #1. Task #1 String Length
//        testStringLength();

// Lesson #1. Task #2 String Length
//        testLuckyTickets();

// Lesson #1. Task #3 Harry Potter Spell
//        guessSpell();

//        Lesson #2. Task #1. Power
        testPower();

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

    public static void guessSpell() {
        HarryPotter harryPotter = new HarryPotter();
        harryPotter.spell();
    }

    public static void testPower() {
        Power power = new Power();
        int degree = 24;
        for (int i = 0; i < degree; i++) {
            System.out.println(power.iteration(2, i));
            System.out.println(power.multiplication(2, i));
            System.out.println(power.bitDecomposition(2, i));
        }
    }
}

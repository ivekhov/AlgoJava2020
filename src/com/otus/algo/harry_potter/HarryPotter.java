package com.otus.algo.harry_potter;

public class HarryPotter {

    public HarryPotter(){ }

    public void spell() {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                System.out.print(
                        i < j              // #1
//                        i == j             // #2
//                        j == (24 - i)  // #3
//                        i < (25 - j + 5)   // #4
//                        i == j - i | i + 1 == j - i  // #5
//                        (i > 25 / 2 + 3) & (j > 25 / 2 + 3)         // #7
//                        i == 0 | j == 0    // #8
//                        (i + 10 < j) | !(i - 10 < j) // #9
//                        i == 0 + 1 | j == 0 + 1 | i == 24 - 1 | j == 24 - 1 // #11
//                        (j > (24 - i - 5)) & (j < (24 - i + 5))     // #13
//                        (i == 0 | j == 0) | (i == 24 | j == 24)   // #19
//                        i == j | j == (24 - i)   // #24
                        ? "# " : ". "

                );
            }
            System.out.println();

        }
    }

}

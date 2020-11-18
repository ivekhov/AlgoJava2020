package com.otus.algo.tester;

import java.io.*;
import java.util.Objects;

public class Tester{

    private static Task taskTester;
    private static String path;

    public Tester(Task taskTester, String path) {
        this.taskTester = taskTester;
        this.path = path;
    }

    public void runTest() throws IOException {

        // open each pair of file
        Integer ix = 0;
        File myFolder = new File(path);
        File[] files = myFolder.listFiles();
        String[] fileNames = new String[100];

        for (int i = 0; i < files.length; i++) {
            String temp = String.valueOf(files[i]);
            String[] parts = temp.split("/");
            String fileName = parts[parts.length - 1];
            fileNames[i] = fileName;
        }

        FileWriter writer = new FileWriter(path + "/TestResults.txt");

        while (true){
            String first = path + "/test." + ix + ".in";
            File firstFile = new File(first);
            String second = path + "/test." + ix + ".out";
            File secondFile = new File(second);


            if (!firstFile.exists() | !secondFile.exists()) {break;}

            long timeStart = System.nanoTime();
            Boolean flag = compareFiles(firstFile, secondFile);
            long timeDelta = System.nanoTime() - timeStart;

            System.out.printf("Test #%d is %s, time: %.3f ms\n", ix, flag, timeDelta/1_000_000.0);

            writer.write("Test #" + ix + " is " + flag + ", time: " +
                    timeDelta / 1_000_000.0 + " ms\n");
            ix++;
        }
        writer.close();
    }


    public static boolean compareFiles(File firstFile, File secondFile) throws IOException {
        // prepare files
        FileReader inFileReader = new FileReader(firstFile);
        BufferedReader inReader = new BufferedReader(inFileReader);
        String inTempRow = inReader.readLine();
        inReader.close();

        FileReader outFileReader = new FileReader(secondFile);
        BufferedReader outReader = new BufferedReader(outFileReader);
        String outTempRow = outReader.readLine();
        int expValue = Integer.parseInt(outTempRow);
        outReader.close();


        // Main algo function for checking
        //************************************
        int result = taskTester.go(inTempRow.trim());
        return Objects.equals(result, expValue);

    }
}
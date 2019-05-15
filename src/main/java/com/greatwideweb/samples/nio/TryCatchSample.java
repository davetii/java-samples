package com.greatwideweb.samples.nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TryCatchSample {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("c:/temp/test.txt"))) {
            lines.forEachOrdered(System.out::println);
        } catch (IOException e) { e.printStackTrace(); }
    }

}

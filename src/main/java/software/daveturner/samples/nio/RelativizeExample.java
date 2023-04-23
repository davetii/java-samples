package software.daveturner.samples.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeExample {
    public static void main(String[] args) {
        Path file1 = Paths.get("/temp/foo/test.txt");
        Path file2 = Paths.get("/Users/dave/Documents/test-doc.txt");
        Path file1To2 = file1.relativize(file2);
        System.out.format("toAbsolutePath: %s%n", file1To2.toAbsolutePath());


    }
}

package com.greatwideweb.samples.nio.fixdavidgray;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static com.greatwideweb.samples.nio.fixdavidgray.FixDavidGrayAssignment.LOCATION;
import static java.nio.file.FileVisitResult.CONTINUE;

public class PathReader extends SimpleFileVisitor<Path> {

    public static void main(String[] args) throws IOException {
        Path startingDir = Paths.get(LOCATION);
        PathReader reader = new PathReader();
        Files.walkFileTree(startingDir, reader);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
        if (attr.isSymbolicLink()) {
            System.out.format("Symbolic link: %s ", file);
        } else if (attr.isRegularFile()) {
            System.out.format("Regular file: %s ", file);
        } else {
            System.out.format("Other: %s ", file);
        }
        System.out.println("(" + attr.size() + "bytes)");
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        return CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        System.out.format("Directory: %s%n", dir);
        return CONTINUE;
    }
}

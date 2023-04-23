package software.daveturner.samples.nio.fixdavidgray;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;

public class Mp3Matcher extends SimpleFileVisitor<Path> {

    private final PathMatcher matcher;
    private final String destinationFolderName;


    Mp3Matcher(String newDestinationFolderName) {
        destinationFolderName = newDestinationFolderName;
        matcher = FileSystems.getDefault().getPathMatcher("glob:" + "*.mp3");
    }

    private void find(Path file) throws IOException {
        Path name = file.getFileName();
        if (name != null && matcher.matches(name)) {
            Files.copy(file, newFile(file), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    private Path newFile(Path file) {
        return Paths.get(destinationFolderName + "/" +  file.getParent().getFileName() + "-" + file.getFileName());
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) throws IOException {
        find(file);
        return CONTINUE;
    }
}

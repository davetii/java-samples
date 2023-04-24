package software.daveturner.samples.file;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileHelper {

    public File getFileFromClassPath(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);

        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }
    }

    public List<String[]> getFileContentAsListOfStrings(Path path, String delim) throws IOException {
        List<String[]> result = new ArrayList<>();
        Stream<String> lines = Files.lines(path);
        lines.forEach(s -> {
            result.add(s.split(delim));
        });
        lines.close();
        return result;
    }
}

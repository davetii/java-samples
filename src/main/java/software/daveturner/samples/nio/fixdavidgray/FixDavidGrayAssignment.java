package software.daveturner.samples.nio.fixdavidgray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.apache.commons.io.FileUtils.copyDirectory;

public class FixDavidGrayAssignment {

    protected static final String LOCATION ="\\\\WDMYCLOUD\\Public\\Shared Music\\david gray\\David Gray - 7 Albums";
    protected static final String WORKSPACE_PATH = "/temp/workspace";
    protected static final String NEW_FILES = "/temp/final";

    private static final Path BASE = Paths.get(LOCATION );
    private static final Path WORKSPACE = Paths.get(WORKSPACE_PATH);
    private static final Path NEW_FILES_PATH = Paths.get(NEW_FILES);
    public static void main(String[] args) throws IOException {
        log("Clean Workspace");
        cleanFolder(WORKSPACE);
        log("Clean New Files");
        cleanFolder(NEW_FILES_PATH);
        log("Copy to Temp");
        copyDirectory(BASE.toFile(),WORKSPACE.toFile());
        log("Mp3Matcher");
        handleMusicFiles();
        log("Complete");

    }

    private static void cleanFolder(Path p) throws IOException {
        Cleaner cleaner = new Cleaner();
        Files.walkFileTree(p, cleaner);
        Files.createDirectory(p);
    }

    private static void handleMusicFiles() throws IOException {
        Mp3Matcher mp3Matcher = new Mp3Matcher(NEW_FILES);
        Files.walkFileTree(WORKSPACE, mp3Matcher);
    }

    private static void log(String m) {
        System.out.println("*********** " + m + " *********** ");
    }
}

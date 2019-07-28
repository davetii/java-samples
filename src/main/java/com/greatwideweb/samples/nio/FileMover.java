package com.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMover {

    public static String DIR_IN = "C:/tmp/sb/in";
    public static String DIR_OUT ="C:/tmp/sb/out";


    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_hhmmss");
        String now =  formatter.format(new Date());

        Path sourceDir = Paths.get(DIR_IN);
        Path destinationDir = Paths.get(DIR_OUT);

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDir)) {
            for (Path path : directoryStream) {
                System.out.println("copying " + path.toString());
                Path d2 = destinationDir.resolve(path.getFileName() + "." + now);
                System.out.println("destination File=" + d2);
                Files.move(path, d2, StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}


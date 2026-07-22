package org.example.c_file_io.n_commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class A_CommonsIoDemo {
    public static void main(String[] args) throws Exception {
        // 目标：IO框架
        FileUtils.copyFile(
                new File("CJavaSEPorjectMax/src/main/resources/csb_sorted.txt"),
                new File("CJavaSEPorjectMax/src/main/resources/csb_sorted2.txt")
        );

        // JDK 7 提供的
        // Files.copy(
        //         Path.of("CJavaSEPorjectMax/src/main/resources/csb_sorted.txt"),
        //         Path.of("CJavaSEPorjectMax/src/main/resources/csb_sorted3.txt")
        // );

        FileUtils.deleteDirectory(new File("CJavaSEPorjectMax/src/main/resources/testFile"));
    }
}

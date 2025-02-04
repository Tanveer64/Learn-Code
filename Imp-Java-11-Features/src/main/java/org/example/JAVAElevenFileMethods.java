package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JAVAElevenFileMethods {
    public static void main(String[] args) throws IOException {
        try {
            Files.writeString(Path.of("D:\\Java-Dev-Env\\Imp-Java-11-Features\\Imp-Java-11-Features\\src\\main\\resources\\textFile.txt"), "My name is tanveer");
            System.out.println("File written successfully");
            String fileContant = Files.readString(Path.of("D:\\Java-Dev-Env\\Imp-Java-11-Features\\Imp-Java-11-Features\\src\\main\\resources\\textFile.txt"));
            System.out.println(fileContant);

            Path file1 = Path.of("D:\\Java-Dev-Env\\Imp-Java-11-Features\\Imp-Java-11-Features\\src\\main\\resources\\textFile.txt");
            Path file2  = Path.of("D:\\Java-Dev-Env\\Imp-Java-11-Features\\Imp-Java-11-Features\\src\\main\\resources\\textFile.txt");

            Boolean resultFileSame = Files.isSameFile(file1,file2);
            System.out.println(resultFileSame);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

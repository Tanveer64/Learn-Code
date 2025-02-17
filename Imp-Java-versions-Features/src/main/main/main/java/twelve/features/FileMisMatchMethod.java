package twelve.features;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMisMatchMethod {
    public static void main(String[] args) throws IOException {
        // The Files.mismatch() method compares the contents of two files and returns the position of the first byte that differs. If the files are identical, it returns -1.
        // This method provides a convenient way to compare files and identify differences.
       /* Explanation
        Comparison: The mismatch() method compares the contents of two files byte by byte and returns the position of the first mismatch.
                Efficiency: This method is efficient for comparing large files and quickly identifying differences.*/
        try {
            Path file1 = Files.createTempFile("file1" , ".txt"); // create file in memory not required directory
            Path file2 = Files.createTempFile("file2",".txt");
            Files.writeString(file1,"Java Features");
            Files.writeString(file2,"Java Features");
           long mismatchFile =  Files.mismatch(file1,file2); // if files content are same return 1 else return change text position
            System.out.println("Mis Match files = " + mismatchFile);
            Files.writeString(file2, "Java 12 Features");
            long misMacthContent = Files.mismatch(file1,file2);
            System.out.println("Mismatch Position after content change = " + misMacthContent);
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }}

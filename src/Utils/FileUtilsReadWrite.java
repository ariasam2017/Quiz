package Utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtilsReadWrite {

    public void writeFile(String fileName, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
        writer.write(content);
        writer.write("\n");
        writer.close();
    }


    public String readFromFile(String fileName) throws IOException {
        String read;
        try {
            FileInputStream stream = new FileInputStream(fileName);
            Path path = Paths.get(fileName);
            read = Files.readAllLines(path).get(0);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return read;
    }
}

package javaHomework2;

/*С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.*/

import java.nio.file.Files;
import java.nio.file.Path;
public class Test100 {
    public static void main (String[] args) {
        String path = "file.txt";
        createFile(path);
        writeFile100(path, "TEST");
    }

    public static void createFile(String path) {
        Path file = Path.of( path );
        try {
            if (Files.exists( file )) Files.delete( file );
            Files.createFile( file );
        } catch (Exception e) {
            System.out.println( "Ошибка при создании файла!" );
        }
    }

    public static void writeFile100(String path, String str) {
        String fileStr = new String();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fileStr += str + " ";
            }
            fileStr += "\n";
        }
        Path file = Path.of(path);
        try {
            Files.writeString(file, fileStr);
        } catch (Exception e) {
            System.out.println("Ошибка при записи в файл!");
        }
    }
}

package Lesson31;
import java.io.*;

public class FileTest {

    public static void main(String[] args) throws Exception {
        File f = new File("text.txt");
        if (f.createNewFile()) {
            System.out.println(f.getName() + " Файл создан");
        }
        FileInputStream fis = new FileInputStream(f);
        System.out.println(f.getAbsolutePath());
        fis.read();

        FileOutputStream fos = new FileOutputStream(f);
        fos.write(123);
        System.out.println("file naiden");
    }
}

package Lesson31;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinally {
    public static void main(String[] args) {
        File f = new File("text.txt");

        try {
            FileInputStream fileInputStream = new FileInputStream(f);
            fileInputStream.read();
            System.out.println("Такой файл есть поэтому сработал try");
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден, полэтому словили FileNotFoundException");
        }
        catch (IOException e){
            System.out.println("Сработал IOExection ");
        }
        finally {
            System.out.println("Finally сработает в любом случае");
        }

        System.out.println("Это продолжение кода в теле");
    }
}

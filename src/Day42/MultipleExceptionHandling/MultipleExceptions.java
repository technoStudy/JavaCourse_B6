package Day42.MultipleExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleExceptions {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("ExampleFile.txt");
            fileReader.read();
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist!");
        } catch (IOException ex) {
            System.out.println("Not able to read this file!");
        }

    }

}

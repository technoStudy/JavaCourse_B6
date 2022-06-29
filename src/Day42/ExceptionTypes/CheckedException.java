package Day42.ExceptionTypes;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("ExampleFile.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("This file does not exist!");
        }

    }

}

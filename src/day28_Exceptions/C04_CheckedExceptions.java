package day28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis= new FileInputStream("src/day28_Exceptions/metin.txt");
    }
}

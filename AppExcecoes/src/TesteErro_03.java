import java.io.*;

public class TesteErro_03 {
    public static void main(String[] args) throws FileNotFoundException {
        new java.io.FileInputStream("Arquivo.txt");
    }

    /*
    public static void main(String[] args) {
        try {
            new java.io.FileInputStream("Arquivo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    */
}

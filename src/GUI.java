import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GUI {
    public static void main(String[] args) {
        String filename = "fillnamn.txt";
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader inFile = new BufferedReader(fr);

        String rad;

        try {
           while ((rad = inFile.readLine() )!= null ) {
               System.out.println(rad);
           }

            inFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

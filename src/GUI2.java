import javax.swing.*;
import java.io.*;

public class GUI2 {
    public static void main(String[] args) {

        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        String filename;
        if (result == JFileChooser.APPROVE_OPTION) {
            filename = fc.getSelectedFile().getAbsolutePath();
        } else {
            filename = "fillnamn.txt";
        }

        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader inFile = new BufferedReader(fr);

        String filename2 = filename + " copy";
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outFile = new PrintWriter(bw);

        String rad;

        try {
            while ((rad = inFile.readLine() )!= null ) {
                outFile.println(rad);
            }
            inFile.close();
            outFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


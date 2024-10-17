import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        String[] files = {"C:\\Users\\prite\\OneDrive\\Desktop\\TP\\practicals\\java\\pc.txt","C:\\Users\\prite\\OneDrive\\Desktop\\TP\\practicals\\java\\pc2.txt","C:\\Users\\prite\\OneDrive\\Desktop\\TP\\practicals\\java\\pc3.txt"};
        for (String file : files) {
            try {
                File f = new File(file);
                Scanner scanner = new Scanner(f);
                int Count = 0;
                while (scanner.hasNextLine()) {
                    scanner.nextLine();
                    Count++;
                }
                System.out.println("File: " + file + "No. of lines: " + Count);
                scanner.close();
            } catch (FileNotFoundException e) {
                System.err.println("Error file not found: " + file);
            }
        }
    }
}
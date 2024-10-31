import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

    public static void readFile() throws FileNotFoundException {
        try {
            File myFile = new File("./tests.txt");
            Scanner myReader = new Scanner(myFile);
            while( myReader.hasNextLine()) {
                String nextLine = myReader.nextLine();
                System.out.println(nextLine);
            }
            myReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getLocalizedMessage());
        }
    }
}
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Reader {

    static void writefile() throws IOException {
        FileWriter fileWriter = new FileWriter("numbers.txt");
        fileWriter.write(String.valueOf(new int[] {13,4,36,70,3}));
        fileWriter.close();
    }

    static void readfrom(int number) throws FileNotFoundException {
        FileReader fileReader = new FileReader("numbers.txt");
        Scanner scanner = new Scanner(System.in);
        String filetext = scanner.nextLine();
        for(int i = 0; i < filetext.length();i++){
            if(filetext.substring(i,i+1)!=" "){
                Integer.getInteger(filetext);
            }
        }
    }
}

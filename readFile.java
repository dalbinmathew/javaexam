import java.io.*;

public class readFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the content to write to the file: ");
        String content = reader.readLine();
        String outFile = "out.txt";

        BufferedWriter outWriter = new BufferedWriter(new FileWriter(outFile));
        outWriter.write(content);
        outWriter.close(); 

        BufferedReader fileReader = new BufferedReader(new FileReader(outFile));
        System.out.println(fileReader.readLine());
    

        reader.close();
        fileReader.close();
        
    }
}

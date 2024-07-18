import java.io.*;
public class copyfile {
public static void main(String[] args) throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the input file path: ");
String inputFile = reader.readLine();
String outFile = "out.txt";
BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
BufferedWriter outWriter = new BufferedWriter(new FileWriter(outFile));

String line;
while ((line = fileReader.readLine()) != null) {
outWriter.write(line);
outWriter.newLine();
}
System.out.println("copied successfully.");
reader.close();
fileReader.close();
outWriter.close();
}
}
package LogicalPrograming;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteDataInFile {
    public static void main(String[] args) throws Exception {
        FileWriter fr =new FileWriter("C:\\Users\\rutik\\Desktop\\text.txt");
        BufferedWriter bw = new BufferedWriter(fr);

        bw.write("Hello Public kay Bolti");

        System.out.println("Done..!");
        bw.close();

    }
}

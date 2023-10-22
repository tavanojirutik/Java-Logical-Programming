package LogicalPrograming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
    public static void main(String[] args) throws IOException  {
        FileReader fr=new FileReader("C:\\Users\\rutik\\Desktop\\Test.txt");
        BufferedReader bf=new BufferedReader(fr);

        String str;
        while ((str = bf.readLine())!=null) {
            System.out.println(str);
        }
        bf.close();
    }
}

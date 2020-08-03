package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingAndWritingToFile {
    public static void main(String[] args) {
        List<String> evenlist=new ArrayList<>();
        List<Object> oddlist=new ArrayList<>();
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("/Users/shirishapolati/desktop/a.txt"))){
            String line=bufferedReader.readLine();
            int linecount=0;
            while (line!=null){
                linecount++;
                if(linecount%2==0){
                    evenlist.add(line);
                }else {
                    oddlist.add(line);
                }
                line=bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        EvenFile evenFile=new EvenFile(evenlist);
        OddFile oddFile=new OddFile(oddlist);
        evenFile.start();
        oddFile.start();
    }
}

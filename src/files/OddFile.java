package files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class OddFile extends Thread{
    private List oddlist;

    public OddFile(List oddlist) {
        this.oddlist = oddlist;
    }

    @Override
    public void run() {
       try(PrintWriter printWriter=new PrintWriter("oddlist.txt")){
           for (Object s:oddlist
                ) {
               printWriter.println(s);
               printWriter.flush();
           }

           }catch (FileNotFoundException e){

       }
    }
}

package files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class EvenFile extends Thread{

   private List evenlist;

    public EvenFile(List evenlist) {
        this.evenlist = evenlist;
    }

    public List getEvenlist() {
        return evenlist;
    }

    public void setEvenlist(List evenlist) {
        this.evenlist = evenlist;
    }

    @Override
    public void run() {
       try(PrintWriter pw=new PrintWriter("evenlist.txt")){
           for (Object s:evenlist
                ) {

               pw.println(s);

           }
           pw.flush();
       }catch (FileNotFoundException e){

       }

    }
}

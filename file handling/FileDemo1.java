import java.io.*;
import java.util.*;
class FileDemo1 {
   public static void main(String[] args) {
      File f = null;
      try {
            f = new File("file.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
 	     while(sc.hasNext()){
               bout.write(sc.nextLine());
               bout.newLine();
        }
            bout.close();
}         
    catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }    } }
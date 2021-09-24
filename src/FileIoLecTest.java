import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//public class FileIoLecTest {
//    public static void main(String[] args) {

//        Path pathToOurDataDir = Paths.get("src/data");
//
//
//        Path pathToOurFile = Paths.get("src/data", "list.txt");
//
//
//        List<String> imperials = Arrays.asList("Augustus", "Livia", "Agrippina", "Claudius");
//        try {
//            Files.write(pathToOurFile, imperials);
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        FileIoLec fiol = new FileIoLec();
//        fiol.readFileAndOutput(pathToOurFile);
//
//
////        FileIoLec fiol = new FileIoLec();
////        fiol.readFileAndOutput(pathToOurFile);
//
//        try{
//            Files.writeString(pathToOurFile,"Messalina\n", StandardOpenOption.APPEND);
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        fiol.readFileAndOutput();
//
//        List<String> lateImperials = new ArrayList<>();
//        lateImperials.add("Gall Placidia");
//        lateImperials.add("Theodora");
//        lateImperials.add("Lincinia Eudxia");
//
//        try{
//            Files.write(pathToOurFile,lateImperials,StandardOpenOption.APPEND);
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        fiol.readFileAndOutput(pathToOurFile);
//
//
//
//        List<String> currentList = new ArrayList<>();
//        try{
//            currentList = Files.readAllLines(pathToOurFile);
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        Iterator<String> listIterator = currentList.iterator();
//        while(listIterator.hasNext()){
//            String item = listIterator.next();
//            if(item.equalsIgnoreCase("Claudius")){
//                listIterator.remove();
//            }
//        }
//
//        try {
//            Files.write(pathToOurFile, currentList);
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//
//        fiol.readFileAndOutput();
//
//    }
//}

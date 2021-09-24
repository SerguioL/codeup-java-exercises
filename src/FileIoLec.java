import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoLec {

    public void readFileAndOutput(Path pathToFile){
        List<String> lineInTheFile = new ArrayList<>();
        try{
            lineInTheFile = Files.readAllLines(pathToFile);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        for(String item : lineInTheFile){
            System.out.println(item);
        }

    }

//    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

//        Path pathToThisLectureFile = Paths.get("src", "FileIoLec.java");
//        System.out.println(pathToThisLectureFile);

//        Path pathToOurDataDir = Paths.get("src/data");
////        System.out.println(pathToOurDataDir);
//        try {
//            Files.createDirectories(pathToOurDataDir);
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }

//        Path pathToTest = Paths.get("src/test");
//        try {
//            Files.createDirectories(pathToTest);
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }

        Path pathToOurFile = Paths.get("src/data", "list.txt");
//        try{
//            if (Files.notExists(pathToOurFile)){
//                Files.createFile(pathToOurFile);
//            }else {
//                System.out.println("The "+ pathToOurFile + " file already exists");
//            }
//        }catch (IOException ioe){
//            System.out.println("There was a problem");
//            ioe.printStackTrace();
//        }
//        List<String> imperials = Arrays.asList("Augustus", "Livia", "Agrippina", "Claudius");
//        try {
//            Files.write(pathToOurFile, imperials);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//
//        List<String> currentList = new ArrayList<>();
//        try {
//            currentList = Files.readAllLines(pathToOurFile);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//
//        for (String item : currentList){
//            System.out.println(item);
//
//    }

//    }



}

import document.DocumentGetting;
import document.Parsing;
import teacher.Teacher;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

//        DocumentGetting documentGetting = new DocumentGetting();
//        documentGetting.downloadDataFromUrls();

        Teacher teacher=new Teacher();
        teacher.downloadListOfTeachers();
        teacher.putTeachersWithSubjectsIntoMap();
        System.out.println("Dad");
    }
}

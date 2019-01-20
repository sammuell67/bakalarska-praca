import document.Writing;

public class Main {

    public static void main(String[] args) {

       Parsing parsing=new Parsing();
       parsing.parseHtmlFromUrl();
       new Writing(parsing.listOfSubjects,parsing.listOfTimes);

//        SetTimeWithSubjects setTimeWithSubjects=new SetTimeWithSubjects();
//        setTimeWithSubjects.divideListOfSubjects(parsing.listOfSubjects);
        }
    }



public class Main {

    public static void main(String[] args) {

        Parsing parsing=new Parsing();
        parsing.parseHtmlFromUrl();

        SetTimeWithSubjects setTimeWithSubjects=new SetTimeWithSubjects();
        setTimeWithSubjects.divideListOfSubjects(parsing.listOfSubjects);
        }
    }

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class SetTimeWithSubjects {

    Parsing parsing=new Parsing();
    private int runCount = 0;
    private int numberOfFields;
    private List<String> listOfMondaySubjects=new ArrayList<>();
    private List<String> listOfTuesdaySubjects=new ArrayList<>();
    private List<String> listOfWednesdaySubjects=new ArrayList<>();
    private List<String> listOfThursdaySubjects=new ArrayList<>();
    private List<String> listOfFridaySubjects=new ArrayList<>();

    public List<String> divideListOfSubjects(List<String> stringList){
        Predicate<String> s1=s -> s.equals("doubleLine");
        boolean b= parsing.listOfSubjects.stream().anyMatch(s1);


        List<String> result;
            if (b) {
                result=stringList.subList(0,30);
            }
            else {
                result= stringList.subList(0,15);
            }
            return result;
    }

    public Map<String,String> computeTime(List<String> listOfTimes, List<String> listOfSubjects) {



        return null;
    }

}

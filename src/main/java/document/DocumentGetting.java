package document;


import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentGetting extends DocumentUtils {

    Parsing parsing = new Parsing();
    private Elements group;
    private Elements tablecol;
    private List<String> listOfSubjects = new ArrayList<>();
    private List<String> listOfGroupNames = new ArrayList<>();


    public void downloadDataFromUrls() {

        DocumentUtils documentUtils = new DocumentUtils();
        AtomicReference<String> time = new AtomicReference<>("");
        AtomicInteger iterator = new AtomicInteger();
        parsing.newListOfClasses.forEach(e -> {
            doc=documentUtils.openFile(e);

            group = doc.select("span");
            group.forEach(element -> {
                listOfGroupNames.add(element.ownText());
            });

            tablecol = doc.select("td");
            for (Element element : tablecol) {
                if (e.contains("colspan")) {
                    System.out.println(element);
                    listOfSubjects.add("doubleLine");
                    listOfSubjects.add(element.ownText());
                } else
                    listOfSubjects.add(element.ownText());
            }

        });
        fillListOfDays();
        Writing writing = new Writing();
        AtomicInteger indexOfDay = new AtomicInteger();

        listOfSubjects.forEach(element -> {
            String substringOfSubject = " ";
            String substringOfPlace = " ";

            Pattern p = Pattern.compile("[A-Z][a-z]");
            Matcher m = p.matcher(element);
            if (m.find()) {
                indexOfDay.set(listOfSubjects.indexOf(element));
            }
            if (element.contains(" ")) {
                int position = element.indexOf(' ');
                substringOfSubject = element.substring(0, position);
                substringOfPlace = element.substring(position);
            }
            if (stringContainsItemFromList2(element, listOfDays)) {
                iterator.updateAndGet(i -> i > 14 ? 0 : i);
            }

            if (!stringContainsItemFromList2(element, listOfDays) && !element.contains("\u00a0")) {
                time.set(getTimeForSubject(iterator.get()));
                iterator.getAndIncrement();
            }

            iterator.getAndIncrement();

            if (!substringOfSubject.equals(" ")) {
                writing.write(substringOfSubject, listOfSubjects.get(indexOfDay.get()), time.get(), substringOfPlace);
            }

        });
    }
}

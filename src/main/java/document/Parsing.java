package document;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;


public class Parsing {

    private Document doc = null;
    private Elements title;
    private Elements group;
    private Elements links;
    private Elements tablerow;
    private Elements tablecol;
    private Elements tableLine;
    public List<String> listOfSubjects = new ArrayList<>();
    public List<String> listOfTimes = new ArrayList<>();
    public List<String> listOfClasses = new ArrayList<>();
    public List<String> newListOfClasses = new ArrayList<>();

    public Parsing() {
        getListOfClasses();
    }


    public Elements getTitle() {
        return title;
    }

    public Elements getGroup() {
        return group;
    }

    public int getTablecol() {
        return tablecol.size();
    }

    private void openFile() {
        try {
            doc = Jsoup.connect("http://aladin.elf.stuba.sk/rozvrh").get();
        } catch (Exception e) {
            System.out.println("Page cant be loaded");
        }
    }

    public void getListOfClasses() {
        openFile();
        links = doc.select("a[href]");
        links.forEach(element -> {
            if (!element.ownText().isEmpty() && !element.ownText().contains("1. bc") && !element.ownText().contains("2. bc") && !element.ownText().contains("3. bc") && !element.ownText().contains("1. i") && !element.ownText().contains("2. i") && !element.ownText().contains("Rozvrhy krúžkov") && !element.ownText().contains("Rozvrhy učiteľov") && !element.ownText().contains("Rozvrhy učební") && !element.ownText().contains("Cvičenia z voliteľných predmetov") && !element.ownText().contains("↑"))
                listOfClasses.add(element.ownText());
        });
        replaceSlashWithUnderscore();
    }

    private void replaceSlashWithUnderscore() {
        listOfClasses.forEach(e -> {
            if (e.contains("/")) {
                newListOfClasses.add(e.replace('/', '_'));
            }
        });
    }


    public void parseHtmlFromUrl() {

        openFile();

        tablecol = doc.select("td");
        for (Element e : tablecol) {
            if (e.toString().contains("rowspan")) {
                listOfSubjects.add("doubleLine");
                listOfSubjects.add(e.ownText());
            } else
                listOfSubjects.add(e.ownText());

        }

        tablerow = doc.select("th");

        for (Element element : tablerow) {
            listOfTimes.add(element.ownText());
        }
        tableLine = doc.select("tr");

    }


}

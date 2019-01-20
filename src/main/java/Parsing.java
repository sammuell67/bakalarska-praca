
import models.Subject;
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
    private Elements tablerow;
    private Elements tablecol;
    private Elements tableLine;
    public List<String> listOfSubjects =new ArrayList<>();
    public List<String> listOfTimes =new ArrayList<>();

    public Parsing() {
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
            doc = Jsoup.connect("http://aladin.elf.stuba.sk/rozvrh/2bc_API_4.html").get();
        } catch (Exception e) {
            System.out.println("Page cant be loaded");
        }
    }

    public void parseHtmlFromUrl() {

        openFile();
        String marker="";
        Subject subject =new Subject();

        title = doc.select("title");
        title.forEach(element -> {
            System.out.println(element.ownText());
        });

        group = doc.select("span");
        group.forEach(element -> {
           subject.setGroupName(element.ownText());
        });

        tablecol = doc.select("td");

        for (Element e:tablecol){
            if (e.toString().contains("rowspan")) {
                listOfSubjects.add("doubleLine");
                listOfSubjects.add(e.ownText());
            }
            else
            listOfSubjects.add(e.ownText());

        }
//        for (Element element : tablecol) {
//            if ((!element.ownText().equals("\u00a0"))&&((!element.ownText().equals("Pon")))&&((!element.ownText().equals("Uto")))&&((!element.ownText().equals("Str")))&&((!element.ownText().equals("Stv")))&&((!element.ownText().equals("Pia")))) {
//                System.out.println(element.ownText());
//            }
//        }
        tablerow = doc.select("th");

        for (Element element : tablerow) {
                listOfTimes.add(element.ownText());
                System.out.println(element.ownText());
        }
        tableLine=doc.select("tr");

        System.out.printf("skap");
    }

}

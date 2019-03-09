package document;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.List;

public class DocumentUtils {

    protected Document doc = null;
    protected List<String> listOfDays = new ArrayList<>();


    public Document openFile(String addition) {
        try {
            doc = Jsoup.connect("http://aladin.elf.stuba.sk/rozvrh/" + addition + ".html").get();
            return doc;
        } catch (Exception e) {
            System.out.println("Page cant be loaded");
            return null;
        }
    }

    protected String getTimeForSubject(int number) {

        switch (number) {
            case 1:
                return "7:00";
            case 2:
                return "8:00";
            case 3:
                return "9:00";
            case 4:
                return "10:00";
            case 5:
                return "11:00";
            case 6:
                return "12:00";
            case 7:
                return "13:00";
            case 8:
                return "14:00";
            case 9:
                return "15:00";
            case 10:
                return "16:00";
            case 11:
                return "17:00";
            case 12:
                return "18:00";
            case 13:
                return "19:00";
            case 14:
                return "20:00";
            default:
                return "Invalid time";
        }
    }

    protected boolean stringContainsItemFromList2(String inputStr, List<String> items) {
        for (String list : items) {
            if (inputStr.contains(list)) {
                return true;
            }
        }
        return false;
    }

    protected void fillListOfDays() {
        listOfDays.add("Pon");
        listOfDays.add("Ut");
        listOfDays.add("Str");
        listOfDays.add("St");
        listOfDays.add("Pi");
    }
}

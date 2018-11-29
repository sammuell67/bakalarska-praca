import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;

public class Parsing {

    public void parseHtmlFromUrl() {


        Document doc = null;
        try {
            doc = Jsoup.connect("http://aladin.elf.stuba.sk/rozvrh/3bc_RK_4.html").get();
        } catch (Exception e) {
            System.out.println("Page cant be loaded");
        }


        Elements title = doc.select("title");
        title.forEach(element -> System.out.println(element.ownText()));
        Elements group = doc.select("span");
        group.forEach(element -> System.out.println(element.ownText()));
        Elements tablerow = doc.select("th");
        tablerow.forEach(element -> System.out.println(element.ownText()));
        Elements tablecol = doc.select("td");
        tablecol.forEach(element -> {
            if (!(element.ownText().equals("\u00a0"))) {
                System.out.println(element.ownText());
            }
        });


    }
}

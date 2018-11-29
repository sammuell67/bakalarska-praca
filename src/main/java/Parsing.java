import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;

public class Parsing {

    public void parseHtmlFromUrl(){


        Document doc = null;
        try {
            doc = Jsoup.connect("http://aladin.elf.stuba.sk/rozvrh/3bc_MSUS_1.html").get();
        } catch (Exception e) {
            System.out.println("Page cant be loaded");


            Elements title = doc.select("title");
                    title.forEach(element ->  System.out.println(element.ownText()));
            Elements group = doc.select("span");
                    group.forEach(element -> System.out.println(element.ownText()));
            Elements logo = doc.select(".spring-logo--container");
            Elements pagination = doc.select("#pagination_control");
            Elements divsDescendant = doc.select("header div");
            Elements divsDirect = doc.select("header > div");


        }


    }
}

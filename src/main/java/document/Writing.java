package document;

import org.apache.jena.query.DatasetAccessor;
import org.apache.jena.query.DatasetAccessorFactory;
import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.VCARD;

public class Writing {


    public void write(String label, String date, String time, String place) {
        String serviceURI = "http://localhost:3030/Rozvrh";
        DatasetAccessorFactory factory = null;
        DatasetAccessor accessor;
        accessor = factory.createHTTP(serviceURI);

        String personURI = "http://aladin.elf.stuba.sk/rozvrh/Kossaczky_Igor.html";

        Model model = ModelFactory.createDefaultModel();
        model.createResource(personURI)
                .addProperty(VCARD.FN, "RNDr. Igor Kossaczký, CSc.")
                .addProperty(VCARD.N, model.createResource()
                        .addProperty(VCARD.LABEL, label)
                        .addProperty(VCARD.N, model.createResource()
                                .addProperty(VCARD.N, date)
                                .addProperty(VCARD.N, time))
                        .addProperty(VCARD.N, model.createResource()
                                .addProperty(VCARD.Locality, place)));
        model.write(System.out, "RDF/XML-ABBREV");

        accessor.putModel(model);
    }
}


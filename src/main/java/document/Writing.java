package document;

import org.apache.jena.query.DatasetAccessor;
import org.apache.jena.query.DatasetAccessorFactory;
import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.VCARD;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Writing {


    // some definitions
    static String tutorialURI = "http://hostname/rdf/tutorial/";
    static String briansName = "Brian McBride";
    static String briansEmail1 = "brian_mcbride@hp.com";
    static String briansEmail2 = "brian_mcbride@hpl.hp.com";
    static String title = "An Introduction to RDF and the Jena API";
    static String date = "23/01/2001";
    public List<String> listOfSubjects = new ArrayList<>();
    public List<String> listOfTimes = new ArrayList<>();

    public Writing(List<String> listOfSubjects, List<String> listOfTimes) {
        this.listOfSubjects = listOfSubjects;
        this.listOfTimes = listOfTimes;
        write();
    }

    public void write() {
        String serviceURI = "http://localhost:3030/Date";
        DatasetAccessorFactory factory = null;
        DatasetAccessor accessor;
        accessor = factory.createHTTP(serviceURI);
        // some definitions
        String personURI = "http://somewhere/JohnSmith";
        String givenName = "John";
        String familyName = "Smith";
        String fullName = givenName + " " + familyName;

        // create an empty model
        Model model = ModelFactory.createDefaultModel();
        InputStream in = null;
        // create the resource
        //   and add the properties cascading style
        Resource timeList
                = model.createResource(personURI)
                .addProperty(VCARD.FN, fullName)
                .addProperty(VCARD.N,listOfTimes.get(1))
                .addProperty(VCARD.N,listOfTimes.get(2))
                .addProperty(VCARD.N,listOfTimes.get(3))
                .addProperty(VCARD.N,listOfTimes.get(4))
                .addProperty(VCARD.N,listOfTimes.get(5))
                .addProperty(VCARD.N,listOfTimes.get(6))
                .addProperty(VCARD.N,listOfTimes.get(7))
                .addProperty(VCARD.N,listOfTimes.get(8))
                .addProperty(VCARD.N,listOfTimes.get(9))
                .addProperty(VCARD.N,listOfTimes.get(10))
                .addProperty(VCARD.N,listOfTimes.get(11))
                .addProperty(VCARD.N,listOfTimes.get(12))
                .addProperty(VCARD.N,listOfTimes.get(13))
                .addProperty(VCARD.N,listOfTimes.get(14));
        
//        model.write(System.out, "RDF/XML-ABBREV");
        String base = "http://test-projects.com/";
        model.read(in, base, "RDF/XML");
        accessor.putModel(model);
        model.write(System.out);

    }
}


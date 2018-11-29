import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.VCARD;

public class Writing {


    // some definitions
    static String tutorialURI = "http://hostname/rdf/tutorial/";
    static String briansName = "Brian McBride";
    static String briansEmail1 = "brian_mcbride@hp.com";
    static String briansEmail2 = "brian_mcbride@hpl.hp.com";
    static String title = "An Introduction to RDF and the Jena API";
    static String date = "23/01/2001";

    public void write() {

        // some definitions
        String personURI = "http://somewhere/JohnSmith";
        String givenName = "John";
        String familyName = "Smith";
        String fullName = givenName + " " + familyName;
        // create an empty model
        Model model = ModelFactory.createDefaultModel();

        // create the resource
        //   and add the properties cascading style
        Resource johnSmith
                = model.createResource(personURI)
                .addProperty(VCARD.FN, fullName)
                .addProperty(VCARD.N,
                        model.createResource()
                                .addProperty(VCARD.Given, givenName)
                                .addProperty(VCARD.Family, familyName));

        // now write the model in XML form to a file
        model.write(System.out, "RDF/XML-ABBREV");

    }
}


import org.apache.jena.fuseki.main.FusekiServer;

import org.apache.jena.query.DatasetFactory;
import org.apache.jena.sparql.core.DatasetGraph;

public class Server {

    public Server() {
    }

    public void sentDataOnServer() {
        DatasetGraph ds = (DatasetGraph) DatasetFactory.createTxnMem();
        FusekiServer server = FusekiServer.create()
                .add("/rdf", ds)
                .build();
        server.start();
    }
}

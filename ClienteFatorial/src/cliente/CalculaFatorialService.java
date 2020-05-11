
package cliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalculaFatorialService", targetNamespace = "http://control/", wsdlLocation = "http://localhost:10000/calculafatorial?wsdl")
public class CalculaFatorialService
    extends Service
{

    private final static URL CALCULAFATORIALSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULAFATORIALSERVICE_EXCEPTION;
    private final static QName CALCULAFATORIALSERVICE_QNAME = new QName("http://control/", "CalculaFatorialService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:10000/calculafatorial?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULAFATORIALSERVICE_WSDL_LOCATION = url;
        CALCULAFATORIALSERVICE_EXCEPTION = e;
    }

    public CalculaFatorialService() {
        super(__getWsdlLocation(), CALCULAFATORIALSERVICE_QNAME);
    }

    public CalculaFatorialService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULAFATORIALSERVICE_QNAME, features);
    }

    public CalculaFatorialService(URL wsdlLocation) {
        super(wsdlLocation, CALCULAFATORIALSERVICE_QNAME);
    }

    public CalculaFatorialService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULAFATORIALSERVICE_QNAME, features);
    }

    public CalculaFatorialService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculaFatorialService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculaFatorial
     */
    @WebEndpoint(name = "CalculaFatorialPort")
    public CalculaFatorial getCalculaFatorialPort() {
        return super.getPort(new QName("http://control/", "CalculaFatorialPort"), CalculaFatorial.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculaFatorial
     */
    @WebEndpoint(name = "CalculaFatorialPort")
    public CalculaFatorial getCalculaFatorialPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://control/", "CalculaFatorialPort"), CalculaFatorial.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULAFATORIALSERVICE_EXCEPTION!= null) {
            throw CALCULAFATORIALSERVICE_EXCEPTION;
        }
        return CALCULAFATORIALSERVICE_WSDL_LOCATION;
    }

}

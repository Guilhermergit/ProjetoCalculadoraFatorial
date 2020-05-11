
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FatorialResponse_QNAME = new QName("http://control/", "fatorialResponse");
    private final static QName _Fatorial_QNAME = new QName("http://control/", "fatorial");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Fatorial }
     * 
     */
    public Fatorial createFatorial() {
        return new Fatorial();
    }

    /**
     * Create an instance of {@link FatorialResponse }
     * 
     */
    public FatorialResponse createFatorialResponse() {
        return new FatorialResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FatorialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "fatorialResponse")
    public JAXBElement<FatorialResponse> createFatorialResponse(FatorialResponse value) {
        return new JAXBElement<FatorialResponse>(_FatorialResponse_QNAME, FatorialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fatorial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "fatorial")
    public JAXBElement<Fatorial> createFatorial(Fatorial value) {
        return new JAXBElement<Fatorial>(_Fatorial_QNAME, Fatorial.class, null, value);
    }

}

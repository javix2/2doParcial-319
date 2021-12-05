
package paqueteservicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the paqueteservicio package. 
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

    private final static QName _SerieFibonacci_QNAME = new QName("http://paqueteServicio/", "serieFibonacci");
    private final static QName _SerieFibonacciResponse_QNAME = new QName("http://paqueteServicio/", "serieFibonacciResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: paqueteservicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SerieFibonacci }
     * 
     */
    public SerieFibonacci createSerieFibonacci() {
        return new SerieFibonacci();
    }

    /**
     * Create an instance of {@link SerieFibonacciResponse }
     * 
     */
    public SerieFibonacciResponse createSerieFibonacciResponse() {
        return new SerieFibonacciResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerieFibonacci }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicio/", name = "serieFibonacci")
    public JAXBElement<SerieFibonacci> createSerieFibonacci(SerieFibonacci value) {
        return new JAXBElement<SerieFibonacci>(_SerieFibonacci_QNAME, SerieFibonacci.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerieFibonacciResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicio/", name = "serieFibonacciResponse")
    public JAXBElement<SerieFibonacciResponse> createSerieFibonacciResponse(SerieFibonacciResponse value) {
        return new JAXBElement<SerieFibonacciResponse>(_SerieFibonacciResponse_QNAME, SerieFibonacciResponse.class, null, value);
    }

}

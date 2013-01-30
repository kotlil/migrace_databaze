
package cz.ctu.fee.murinrad.printingserver;

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
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PrintingServiceService", targetNamespace = "http://printingserver.murinrad.fee.ctu.cz/", wsdlLocation = "http://murko2-pc:8080/PrintingServer/PrintingServiceService?wsdl")
public class PrintingServiceService
    extends Service
{

    private final static URL PRINTINGSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException PRINTINGSERVICESERVICE_EXCEPTION;
    private final static QName PRINTINGSERVICESERVICE_QNAME = new QName("http://printingserver.murinrad.fee.ctu.cz/", "PrintingServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://murko2-pc:8080/PrintingServer/PrintingServiceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRINTINGSERVICESERVICE_WSDL_LOCATION = url;
        PRINTINGSERVICESERVICE_EXCEPTION = e;
    }

    public PrintingServiceService() {
        super(__getWsdlLocation(), PRINTINGSERVICESERVICE_QNAME);
    }

    public PrintingServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRINTINGSERVICESERVICE_QNAME, features);
    }

    public PrintingServiceService(URL wsdlLocation) {
        super(wsdlLocation, PRINTINGSERVICESERVICE_QNAME);
    }

    public PrintingServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRINTINGSERVICESERVICE_QNAME, features);
    }

    public PrintingServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PrintingServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PrintingServiceIface
     */
    @WebEndpoint(name = "PrintingServicePort")
    public PrintingServiceIface getPrintingServicePort() {
        return super.getPort(new QName("http://printingserver.murinrad.fee.ctu.cz/", "PrintingServicePort"), PrintingServiceIface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PrintingServiceIface
     */
    @WebEndpoint(name = "PrintingServicePort")
    public PrintingServiceIface getPrintingServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://printingserver.murinrad.fee.ctu.cz/", "PrintingServicePort"), PrintingServiceIface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRINTINGSERVICESERVICE_EXCEPTION!= null) {
            throw PRINTINGSERVICESERVICE_EXCEPTION;
        }
        return PRINTINGSERVICESERVICE_WSDL_LOCATION;
    }

}

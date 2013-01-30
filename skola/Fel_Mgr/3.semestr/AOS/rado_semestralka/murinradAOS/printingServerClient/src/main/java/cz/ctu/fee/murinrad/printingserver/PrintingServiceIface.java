
package cz.ctu.fee.murinrad.printingserver;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PrintingServiceIface", targetNamespace = "http://printingserver.murinrad.fee.ctu.cz/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PrintingServiceIface {


    /**
     * 
     * @param passenger
     * @param ticket
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "printTicket", targetNamespace = "http://printingserver.murinrad.fee.ctu.cz/", className = "cz.ctu.fee.murinrad.printingserver.PrintTicket")
    @ResponseWrapper(localName = "printTicketResponse", targetNamespace = "http://printingserver.murinrad.fee.ctu.cz/", className = "cz.ctu.fee.murinrad.printingserver.PrintTicketResponse")
    @Action(input = "http://printingserver.murinrad.fee.ctu.cz/PrintingServiceIface/printTicketRequest", output = "http://printingserver.murinrad.fee.ctu.cz/PrintingServiceIface/printTicketResponse")
    public byte[] printTicket(
        @WebParam(name = "Ticket", targetNamespace = "")
        Ticket ticket,
        @WebParam(name = "Passenger", targetNamespace = "")
        Passenger passenger);

}

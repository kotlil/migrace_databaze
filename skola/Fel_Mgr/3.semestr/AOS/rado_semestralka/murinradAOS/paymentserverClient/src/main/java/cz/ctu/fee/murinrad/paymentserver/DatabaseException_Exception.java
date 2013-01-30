
package cz.ctu.fee.murinrad.paymentserver;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DatabaseException", targetNamespace = "http://paymentserver.murinrad.fee.ctu.cz/")
public class DatabaseException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DatabaseException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DatabaseException_Exception(String message, DatabaseException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DatabaseException_Exception(String message, DatabaseException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: cz.ctu.fee.murinrad.paymentserver.DatabaseException
     */
    public DatabaseException getFaultInfo() {
        return faultInfo;
    }

}

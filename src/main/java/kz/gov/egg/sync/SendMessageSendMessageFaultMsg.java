
package kz.gov.egg.sync;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.2
 * 2023-10-27T10:22:32.793+06:00
 * Generated source version: 4.0.2
 */

@WebFault(name = "SendMessageFault1_SendMessageFault", targetNamespace = "http://bip.bee.kz/SyncChannel/v10/Types")
public class SendMessageSendMessageFaultMsg extends Exception {

    private kz.gov.egg.sync.ErrorInfo faultInfo;

    public SendMessageSendMessageFaultMsg() {
        super();
    }

    public SendMessageSendMessageFaultMsg(String message) {
        super(message);
    }

    public SendMessageSendMessageFaultMsg(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public SendMessageSendMessageFaultMsg(String message, kz.gov.egg.sync.ErrorInfo sendMessageFault1SendMessageFault) {
        super(message);
        this.faultInfo = sendMessageFault1SendMessageFault;
    }

    public SendMessageSendMessageFaultMsg(String message, kz.gov.egg.sync.ErrorInfo sendMessageFault1SendMessageFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = sendMessageFault1SendMessageFault;
    }

    public kz.gov.egg.sync.ErrorInfo getFaultInfo() {
        return this.faultInfo;
    }
}

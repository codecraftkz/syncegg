package kz.gov.egg.sync;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * Интерфейс для работы с синхронным каналом
 *
 * This class was generated by Apache CXF 4.0.2
 * 2023-10-27T10:22:32.821+06:00
 * Generated source version: 4.0.2
 *
 */
@WebService(targetNamespace = "http://bip.bee.kz/SyncChannel/v10/Interfaces", name = "ISyncChannel")
@XmlSeeAlso({ObjectFactory.class})
public interface ISyncChannel {

    /**
     * Метод отправки сообщения по синхронному каналу
     */
    @WebMethod(operationName = "SendMessage")
    @RequestWrapper(localName = "SendMessage", targetNamespace = "http://bip.bee.kz/SyncChannel/v10/Types", className = "kz.gov.egg.sync.SendMessage")
    @ResponseWrapper(localName = "SendMessageResponse", targetNamespace = "http://bip.bee.kz/SyncChannel/v10/Types", className = "kz.gov.egg.sync.SendMessageResponse")
    @WebResult(name = "response", targetNamespace = "")
    public kz.gov.egg.sync.SyncSendMessageResponse sendMessage(

        @WebParam(name = "request", targetNamespace = "")
        kz.gov.egg.sync.SyncSendMessageRequest request
    ) throws SendMessageSendMessageFaultMsg;
}

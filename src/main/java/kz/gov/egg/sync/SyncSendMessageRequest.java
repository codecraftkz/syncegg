
package kz.gov.egg.sync;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Формат объекта запроса метода отправки сообщения по синхронному каналу
 * 
 * <p>Java class for SyncSendMessageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncSendMessageRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestInfo" type="{http://bip.bee.kz/SyncChannel/v10/Types}SyncMessageInfo"/&gt;
 *         &lt;element name="requestData" type="{http://bip.bee.kz/SyncChannel/v10/Types/Request}RequestData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncSendMessageRequest", namespace = "http://bip.bee.kz/SyncChannel/v10/Types/Request", propOrder = {
    "requestInfo",
    "requestData"
})
public class SyncSendMessageRequest {

    @XmlElement(required = true)
    protected SyncMessageInfo requestInfo;
    @XmlElement(required = true)
    protected RequestData requestData;

    /**
     * Gets the value of the requestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SyncMessageInfo }
     *     
     */
    public SyncMessageInfo getRequestInfo() {
        return requestInfo;
    }

    /**
     * Sets the value of the requestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncMessageInfo }
     *     
     */
    public void setRequestInfo(SyncMessageInfo value) {
        this.requestInfo = value;
    }

    /**
     * Gets the value of the requestData property.
     * 
     * @return
     *     possible object is
     *     {@link RequestData }
     *     
     */
    public RequestData getRequestData() {
        return requestData;
    }

    /**
     * Sets the value of the requestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestData }
     *     
     */
    public void setRequestData(RequestData value) {
        this.requestData = value;
    }

}

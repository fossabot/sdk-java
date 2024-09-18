//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.29 at 03:15:31 AM IST 
//


package net.authorize.api.contract.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiRequest">
 *       &lt;sequence>
 *         &lt;element name="transactionRequest" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}transactionRequestType"/>
 *         &lt;element name="hostedPaymentSettings" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionRequest",
    "hostedPaymentSettings"
})
@XmlRootElement(name = "getHostedPaymentPageRequest")
public class GetHostedPaymentPageRequest
    extends ANetApiRequest
{

    @XmlElement(required = true)
    protected TransactionRequestType transactionRequest;
    protected ArrayOfSetting hostedPaymentSettings;

    /**
     * Gets the value of the transactionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionRequestType }
     *     
     */
    public TransactionRequestType getTransactionRequest() {
        return transactionRequest;
    }

    /**
     * Sets the value of the transactionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionRequestType }
     *     
     */
    public void setTransactionRequest(TransactionRequestType value) {
        this.transactionRequest = value;
    }

    /**
     * Gets the value of the hostedPaymentSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSetting }
     *     
     */
    public ArrayOfSetting getHostedPaymentSettings() {
        return hostedPaymentSettings;
    }

    /**
     * Sets the value of the hostedPaymentSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSetting }
     *     
     */
    public void setHostedPaymentSettings(ArrayOfSetting value) {
        this.hostedPaymentSettings = value;
    }

}

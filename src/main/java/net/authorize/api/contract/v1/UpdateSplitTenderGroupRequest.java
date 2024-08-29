//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.29 at 03:44:59 AM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="splitTenderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="splitTenderStatus" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}splitTenderStatusEnum"/>
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
    "splitTenderId",
    "splitTenderStatus"
})
@XmlRootElement(name = "updateSplitTenderGroupRequest")
public class UpdateSplitTenderGroupRequest
    extends ANetApiRequest
{

    @XmlElement(required = true)
    protected String splitTenderId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SplitTenderStatusEnum splitTenderStatus;

    /**
     * Gets the value of the splitTenderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitTenderId() {
        return splitTenderId;
    }

    /**
     * Sets the value of the splitTenderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitTenderId(String value) {
        this.splitTenderId = value;
    }

    /**
     * Gets the value of the splitTenderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SplitTenderStatusEnum }
     *     
     */
    public SplitTenderStatusEnum getSplitTenderStatus() {
        return splitTenderStatus;
    }

    /**
     * Sets the value of the splitTenderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitTenderStatusEnum }
     *     
     */
    public void setSplitTenderStatus(SplitTenderStatusEnum value) {
        this.splitTenderStatus = value;
    }

}

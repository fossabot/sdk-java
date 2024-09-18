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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ANetApiRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ANetApiRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantAuthentication" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}merchantAuthenticationType"/>
 *         &lt;element name="clientId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="refId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANetApiRequest", propOrder = {
    "merchantAuthentication",
    "clientId",
    "refId"
})
@XmlSeeAlso({
    GetTransactionListRequest.class,
    GetMerchantDetailsRequest.class,
    GetHostedPaymentPageRequest.class,
    MobileDeviceRegistrationRequest.class,
    UpdateCustomerPaymentProfileRequest.class,
    GetBatchStatisticsRequest.class,
    ARBCreateSubscriptionRequest.class,
    CreateCustomerPaymentProfileRequest.class,
    AuthenticateTestRequest.class,
    ARBGetSubscriptionListRequest.class,
    GetHostedProfilePageRequest.class,
    CreateCustomerProfileTransactionRequest.class,
    UpdateMerchantDetailsRequest.class,
    CreateTransactionRequest.class,
    DeleteCustomerProfileRequest.class,
    GetAUJobDetailsRequest.class,
    DeleteCustomerPaymentProfileRequest.class,
    ARBGetSubscriptionStatusRequest.class,
    CreateCustomerProfileRequest.class,
    GetCustomerProfileRequest.class,
    GetCustomerProfileIdsRequest.class,
    ARBUpdateSubscriptionRequest.class,
    MobileDeviceLoginRequest.class,
    GetCustomerPaymentProfileRequest.class,
    GetTransactionListForCustomerRequest.class,
    GetSettledBatchListRequest.class,
    GetTransactionDetailsRequest.class,
    GetAUJobSummaryRequest.class,
    CreateCustomerShippingAddressRequest.class,
    UpdateSplitTenderGroupRequest.class,
    SendCustomerTransactionReceiptRequest.class,
    LogoutRequest.class,
    GetUnsettledTransactionListRequest.class,
    SecurePaymentContainerRequest.class,
    ARBGetSubscriptionRequest.class,
    DecryptPaymentDataRequest.class,
    GetCustomerShippingAddressRequest.class,
    UpdateCustomerShippingAddressRequest.class,
    ValidateCustomerPaymentProfileRequest.class,
    ARBCancelSubscriptionRequest.class,
    GetCustomerPaymentProfileListRequest.class,
    DeleteCustomerShippingAddressRequest.class,
    UpdateHeldTransactionRequest.class,
    UpdateCustomerProfileRequest.class,
    GetCustomerPaymentProfileNonceRequest.class,
    CreateCustomerProfileFromTransactionRequest.class
})
public class ANetApiRequest implements java.io.Serializable {

    @XmlElement(required = true)
    protected MerchantAuthenticationType merchantAuthentication;
    protected String clientId;
    protected String refId;

    /**
     * Gets the value of the merchantAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantAuthenticationType }
     *     
     */
    public MerchantAuthenticationType getMerchantAuthentication() {
        return merchantAuthentication;
    }

    /**
     * Sets the value of the merchantAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantAuthenticationType }
     *     
     */
    public void setMerchantAuthentication(MerchantAuthenticationType value) {
        this.merchantAuthentication = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerProfileSummaryType" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerProfileSummaryType"/>
 *         &lt;element name="paymentSimpleType" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}paymentSimpleType"/>
 *         &lt;element name="accountTypeEnum" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}accountTypeEnum"/>
 *         &lt;element name="cardTypeEnum" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}cardTypeEnum"/>
 *         &lt;element name="FDSFilterActionEnum" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}FDSFilterActionEnum"/>
 *         &lt;element name="permissionsEnum" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}permissionsEnum"/>
 *         &lt;element name="settingNameEnum" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}settingNameEnum"/>
 *         &lt;element name="settlementStateEnum" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}settlementStateEnum"/>
 *         &lt;element name="transactionStatusEnum" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}transactionStatusEnum"/>
 *         &lt;element name="transactionTypeEnum" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}transactionTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerProfileSummaryType",
    "paymentSimpleType",
    "accountTypeEnum",
    "cardTypeEnum",
    "fdsFilterActionEnum",
    "permissionsEnum",
    "settingNameEnum",
    "settlementStateEnum",
    "transactionStatusEnum",
    "transactionTypeEnum"
})
@XmlRootElement(name = "EnumCollection")
public class EnumCollection {

    @XmlElement(required = true)
    protected CustomerProfileSummaryType customerProfileSummaryType;
    @XmlElement(required = true)
    protected PaymentSimpleType paymentSimpleType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AccountTypeEnum accountTypeEnum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CardTypeEnum cardTypeEnum;
    @XmlElement(name = "FDSFilterActionEnum", required = true)
    @XmlSchemaType(name = "string")
    protected FDSFilterActionEnum fdsFilterActionEnum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PermissionsEnum permissionsEnum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SettingNameEnum settingNameEnum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SettlementStateEnum settlementStateEnum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TransactionStatusEnum transactionStatusEnum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TransactionTypeEnum transactionTypeEnum;

    /**
     * Gets the value of the customerProfileSummaryType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileSummaryType }
     *     
     */
    public CustomerProfileSummaryType getCustomerProfileSummaryType() {
        return customerProfileSummaryType;
    }

    /**
     * Sets the value of the customerProfileSummaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileSummaryType }
     *     
     */
    public void setCustomerProfileSummaryType(CustomerProfileSummaryType value) {
        this.customerProfileSummaryType = value;
    }

    /**
     * Gets the value of the paymentSimpleType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSimpleType }
     *     
     */
    public PaymentSimpleType getPaymentSimpleType() {
        return paymentSimpleType;
    }

    /**
     * Sets the value of the paymentSimpleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSimpleType }
     *     
     */
    public void setPaymentSimpleType(PaymentSimpleType value) {
        this.paymentSimpleType = value;
    }

    /**
     * Gets the value of the accountTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeEnum }
     *     
     */
    public AccountTypeEnum getAccountTypeEnum() {
        return accountTypeEnum;
    }

    /**
     * Sets the value of the accountTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeEnum }
     *     
     */
    public void setAccountTypeEnum(AccountTypeEnum value) {
        this.accountTypeEnum = value;
    }

    /**
     * Gets the value of the cardTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link CardTypeEnum }
     *     
     */
    public CardTypeEnum getCardTypeEnum() {
        return cardTypeEnum;
    }

    /**
     * Sets the value of the cardTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTypeEnum }
     *     
     */
    public void setCardTypeEnum(CardTypeEnum value) {
        this.cardTypeEnum = value;
    }

    /**
     * Gets the value of the fdsFilterActionEnum property.
     * 
     * @return
     *     possible object is
     *     {@link FDSFilterActionEnum }
     *     
     */
    public FDSFilterActionEnum getFDSFilterActionEnum() {
        return fdsFilterActionEnum;
    }

    /**
     * Sets the value of the fdsFilterActionEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link FDSFilterActionEnum }
     *     
     */
    public void setFDSFilterActionEnum(FDSFilterActionEnum value) {
        this.fdsFilterActionEnum = value;
    }

    /**
     * Gets the value of the permissionsEnum property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionsEnum }
     *     
     */
    public PermissionsEnum getPermissionsEnum() {
        return permissionsEnum;
    }

    /**
     * Sets the value of the permissionsEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionsEnum }
     *     
     */
    public void setPermissionsEnum(PermissionsEnum value) {
        this.permissionsEnum = value;
    }

    /**
     * Gets the value of the settingNameEnum property.
     * 
     * @return
     *     possible object is
     *     {@link SettingNameEnum }
     *     
     */
    public SettingNameEnum getSettingNameEnum() {
        return settingNameEnum;
    }

    /**
     * Sets the value of the settingNameEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettingNameEnum }
     *     
     */
    public void setSettingNameEnum(SettingNameEnum value) {
        this.settingNameEnum = value;
    }

    /**
     * Gets the value of the settlementStateEnum property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStateEnum }
     *     
     */
    public SettlementStateEnum getSettlementStateEnum() {
        return settlementStateEnum;
    }

    /**
     * Sets the value of the settlementStateEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStateEnum }
     *     
     */
    public void setSettlementStateEnum(SettlementStateEnum value) {
        this.settlementStateEnum = value;
    }

    /**
     * Gets the value of the transactionStatusEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusEnum }
     *     
     */
    public TransactionStatusEnum getTransactionStatusEnum() {
        return transactionStatusEnum;
    }

    /**
     * Sets the value of the transactionStatusEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusEnum }
     *     
     */
    public void setTransactionStatusEnum(TransactionStatusEnum value) {
        this.transactionStatusEnum = value;
    }

    /**
     * Gets the value of the transactionTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeEnum }
     *     
     */
    public TransactionTypeEnum getTransactionTypeEnum() {
        return transactionTypeEnum;
    }

    /**
     * Sets the value of the transactionTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeEnum }
     *     
     */
    public void setTransactionTypeEnum(TransactionTypeEnum value) {
        this.transactionTypeEnum = value;
    }

}

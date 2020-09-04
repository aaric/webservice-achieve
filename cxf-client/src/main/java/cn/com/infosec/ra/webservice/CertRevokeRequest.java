
package cn.com.infosec.ra.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;anonymous complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}transactionCode"/&amp;gt;
 *         &amp;lt;element name="parameters"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}certSN"/&amp;gt;
 *                   &amp;lt;element name="revokeReason"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;enumeration value="0"/&amp;gt;
 *                         &amp;lt;enumeration value="1"/&amp;gt;
 *                         &amp;lt;enumeration value="3"/&amp;gt;
 *                         &amp;lt;enumeration value="4"/&amp;gt;
 *                         &amp;lt;enumeration value="9"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}timeStamp"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}signature"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionCode",
    "parameters",
    "signature"
})
@XmlRootElement(name = "certRevokeRequest")
public class CertRevokeRequest {

    @XmlElement(required = true)
    protected String transactionCode;
    @XmlElement(required = true)
    protected CertRevokeRequest.Parameters parameters;
    @XmlElement(required = true)
    protected Signature signature;

    /**
     * 获取transactionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * 设置transactionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * 获取parameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CertRevokeRequest.Parameters }
     *     
     */
    public CertRevokeRequest.Parameters getParameters() {
        return parameters;
    }

    /**
     * 设置parameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CertRevokeRequest.Parameters }
     *     
     */
    public void setParameters(CertRevokeRequest.Parameters value) {
        this.parameters = value;
    }

    /**
     * 获取signature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getSignature() {
        return signature;
    }

    /**
     * 设置signature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setSignature(Signature value) {
        this.signature = value;
    }


    /**
     * &lt;p&gt;anonymous complex type的 Java 类。
     * 
     * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}certSN"/&amp;gt;
     *         &amp;lt;element name="revokeReason"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;enumeration value="0"/&amp;gt;
     *               &amp;lt;enumeration value="1"/&amp;gt;
     *               &amp;lt;enumeration value="3"/&amp;gt;
     *               &amp;lt;enumeration value="4"/&amp;gt;
     *               &amp;lt;enumeration value="9"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}timeStamp"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "certSN",
        "revokeReason",
        "timeStamp"
    })
    public static class Parameters {

        @XmlElement(required = true)
        protected String certSN;
        @XmlElement(required = true)
        protected String revokeReason;
        @XmlElement(required = true)
        protected String timeStamp;

        /**
         * 获取certSN属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertSN() {
            return certSN;
        }

        /**
         * 设置certSN属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertSN(String value) {
            this.certSN = value;
        }

        /**
         * 获取revokeReason属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRevokeReason() {
            return revokeReason;
        }

        /**
         * 设置revokeReason属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRevokeReason(String value) {
            this.revokeReason = value;
        }

        /**
         * 获取timeStamp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeStamp() {
            return timeStamp;
        }

        /**
         * 设置timeStamp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeStamp(String value) {
            this.timeStamp = value;
        }

    }

}

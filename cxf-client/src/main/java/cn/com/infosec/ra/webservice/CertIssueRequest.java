
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
 *                   &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}caId"/&amp;gt;
 *                   &amp;lt;element name="userName"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;minLength value="1"/&amp;gt;
 *                         &amp;lt;maxLength value="32"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="templateID"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;pattern value="\d{1,2}"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="validityLength"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;pattern value="\d{1,4}"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}P10"/&amp;gt;
 *                   &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}timeStamp"/&amp;gt;
 *                   &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}certExtensions" minOccurs="0"/&amp;gt;
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
@XmlRootElement(name = "certIssueRequest")
public class CertIssueRequest {

    @XmlElement(required = true)
    protected String transactionCode;
    @XmlElement(required = true)
    protected CertIssueRequest.Parameters parameters;
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
     *     {@link CertIssueRequest.Parameters }
     *     
     */
    public CertIssueRequest.Parameters getParameters() {
        return parameters;
    }

    /**
     * 设置parameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CertIssueRequest.Parameters }
     *     
     */
    public void setParameters(CertIssueRequest.Parameters value) {
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
     *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}caId"/&amp;gt;
     *         &amp;lt;element name="userName"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;minLength value="1"/&amp;gt;
     *               &amp;lt;maxLength value="32"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="templateID"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;pattern value="\d{1,2}"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="validityLength"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;pattern value="\d{1,4}"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}P10"/&amp;gt;
     *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}timeStamp"/&amp;gt;
     *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}certExtensions" minOccurs="0"/&amp;gt;
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
        "caId",
        "userName",
        "templateID",
        "validityLength",
        "p10",
        "timeStamp",
        "certExtensions"
    })
    public static class Parameters {

        @XmlElement(required = true)
        protected String caId;
        @XmlElement(required = true)
        protected String userName;
        @XmlElement(required = true)
        protected String templateID;
        @XmlElement(required = true)
        protected String validityLength;
        @XmlElement(name = "P10", required = true)
        protected String p10;
        @XmlElement(required = true)
        protected String timeStamp;
        protected CertExtensions certExtensions;

        /**
         * 获取caId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaId() {
            return caId;
        }

        /**
         * 设置caId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaId(String value) {
            this.caId = value;
        }

        /**
         * 获取userName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserName() {
            return userName;
        }

        /**
         * 设置userName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserName(String value) {
            this.userName = value;
        }

        /**
         * 获取templateID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemplateID() {
            return templateID;
        }

        /**
         * 设置templateID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTemplateID(String value) {
            this.templateID = value;
        }

        /**
         * 获取validityLength属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidityLength() {
            return validityLength;
        }

        /**
         * 设置validityLength属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidityLength(String value) {
            this.validityLength = value;
        }

        /**
         * 获取p10属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getP10() {
            return p10;
        }

        /**
         * 设置p10属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setP10(String value) {
            this.p10 = value;
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

        /**
         * 获取certExtensions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CertExtensions }
         *     
         */
        public CertExtensions getCertExtensions() {
            return certExtensions;
        }

        /**
         * 设置certExtensions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CertExtensions }
         *     
         */
        public void setCertExtensions(CertExtensions value) {
            this.certExtensions = value;
        }

    }

}

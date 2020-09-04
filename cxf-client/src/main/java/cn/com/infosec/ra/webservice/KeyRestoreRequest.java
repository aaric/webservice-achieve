
package cn.com.infosec.ra.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;anonymous complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
 *                   &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}P10"/&amp;gt;
 *                   &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}timeStamp"/&amp;gt;
 *                   &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}certExtensions" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
@XmlRootElement(name = "keyRestoreRequest")
public class KeyRestoreRequest {

    @XmlElement(required = true)
    protected String transactionCode;
    @XmlElement(required = true)
    protected KeyRestoreRequest.Parameters parameters;
    @XmlElement(required = true)
    protected Signature signature;

    /**
     * ��ȡtransactionCode���Ե�ֵ��
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
     * ����transactionCode���Ե�ֵ��
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
     * ��ȡparameters���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link KeyRestoreRequest.Parameters }
     *     
     */
    public KeyRestoreRequest.Parameters getParameters() {
        return parameters;
    }

    /**
     * ����parameters���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link KeyRestoreRequest.Parameters }
     *     
     */
    public void setParameters(KeyRestoreRequest.Parameters value) {
        this.parameters = value;
    }

    /**
     * ��ȡsignature���Ե�ֵ��
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
     * ����signature���Ե�ֵ��
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
     * &lt;p&gt;anonymous complex type�� Java �ࡣ
     * 
     * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}certSN"/&amp;gt;
     *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}P10"/&amp;gt;
     *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}timeStamp"/&amp;gt;
     *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}certExtensions" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "p10",
        "timeStamp",
        "certExtensions"
    })
    public static class Parameters {

        @XmlElement(required = true)
        protected String certSN;
        @XmlElement(name = "P10", required = true)
        protected String p10;
        @XmlElement(required = true)
        protected String timeStamp;
        protected List<CertExtensions> certExtensions;

        /**
         * ��ȡcertSN���Ե�ֵ��
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
         * ����certSN���Ե�ֵ��
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
         * ��ȡp10���Ե�ֵ��
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
         * ����p10���Ե�ֵ��
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
         * ��ȡtimeStamp���Ե�ֵ��
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
         * ����timeStamp���Ե�ֵ��
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
         * Gets the value of the certExtensions property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the certExtensions property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCertExtensions().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link CertExtensions }
         * 
         * 
         */
        public List<CertExtensions> getCertExtensions() {
            if (certExtensions == null) {
                certExtensions = new ArrayList<CertExtensions>();
            }
            return this.certExtensions;
        }

    }

}


package cn.com.infosec.ra.webservice;

import java.util.ArrayList;
import java.util.List;
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
 *         &amp;lt;element name="certExtension" maxOccurs="unbounded"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="oid"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;maxLength value="64"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="oidType"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;maxLength value="64"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="oidValue"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;maxLength value="128"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
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
    "certExtension"
})
@XmlRootElement(name = "certExtensions")
public class CertExtensions {

    @XmlElement(required = true)
    protected List<CertExtensions.CertExtension> certExtension;

    /**
     * Gets the value of the certExtension property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the certExtension property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCertExtension().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link CertExtensions.CertExtension }
     * 
     * 
     */
    public List<CertExtensions.CertExtension> getCertExtension() {
        if (certExtension == null) {
            certExtension = new ArrayList<CertExtensions.CertExtension>();
        }
        return this.certExtension;
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
     *         &amp;lt;element name="oid"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;maxLength value="64"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="oidType"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;maxLength value="64"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="oidValue"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;maxLength value="128"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
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
        "oid",
        "oidType",
        "oidValue"
    })
    public static class CertExtension {

        @XmlElement(required = true)
        protected String oid;
        @XmlElement(required = true)
        protected String oidType;
        @XmlElement(required = true)
        protected String oidValue;

        /**
         * 获取oid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOid() {
            return oid;
        }

        /**
         * 设置oid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOid(String value) {
            this.oid = value;
        }

        /**
         * 获取oidType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOidType() {
            return oidType;
        }

        /**
         * 设置oidType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOidType(String value) {
            this.oidType = value;
        }

        /**
         * 获取oidValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOidValue() {
            return oidValue;
        }

        /**
         * 设置oidValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOidValue(String value) {
            this.oidValue = value;
        }

    }

}

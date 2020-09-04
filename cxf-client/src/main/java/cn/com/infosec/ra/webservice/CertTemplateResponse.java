
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
 *         &amp;lt;element name="templates"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="template" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;element name="id"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                             &amp;lt;element name="name"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
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
    "transactionCode",
    "templates"
})
@XmlRootElement(name = "certTemplateResponse")
public class CertTemplateResponse {

    @XmlElement(required = true)
    protected String transactionCode;
    @XmlElement(required = true)
    protected CertTemplateResponse.Templates templates;

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
     * ��ȡtemplates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CertTemplateResponse.Templates }
     *     
     */
    public CertTemplateResponse.Templates getTemplates() {
        return templates;
    }

    /**
     * ����templates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CertTemplateResponse.Templates }
     *     
     */
    public void setTemplates(CertTemplateResponse.Templates value) {
        this.templates = value;
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
     *         &amp;lt;element name="template" maxOccurs="unbounded" minOccurs="0"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;sequence&amp;gt;
     *                   &amp;lt;element name="id"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *                       &amp;lt;/restriction&amp;gt;
     *                     &amp;lt;/simpleType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                   &amp;lt;element name="name"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
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
        "template"
    })
    public static class Templates {

        protected List<CertTemplateResponse.Templates.Template> template;

        /**
         * Gets the value of the template property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the template property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTemplate().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link CertTemplateResponse.Templates.Template }
         * 
         * 
         */
        public List<CertTemplateResponse.Templates.Template> getTemplate() {
            if (template == null) {
                template = new ArrayList<CertTemplateResponse.Templates.Template>();
            }
            return this.template;
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
         *         &amp;lt;element name="id"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
         *             &amp;lt;/restriction&amp;gt;
         *           &amp;lt;/simpleType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="name"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
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
            "id",
            "name"
        })
        public static class Template {

            @XmlElement(required = true)
            protected String id;
            @XmlElement(required = true)
            protected String name;

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * ��ȡname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * ����name���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }

    }

}

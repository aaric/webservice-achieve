
package cn.com.infosec.ra.webservice;

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
 *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}certSN"/&amp;gt;
 *         &amp;lt;element ref="{http://webservice.ra.infosec.com.cn/}certificateData"/&amp;gt;
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
    "certSN",
    "certificateData"
})
@XmlRootElement(name = "certUpdateResponse")
public class CertUpdateResponse {

    @XmlElement(required = true)
    protected String transactionCode;
    @XmlElement(required = true)
    protected String certSN;
    @XmlElement(required = true)
    protected CertificateData certificateData;

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
     * ��ȡcertificateData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CertificateData }
     *     
     */
    public CertificateData getCertificateData() {
        return certificateData;
    }

    /**
     * ����certificateData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateData }
     *     
     */
    public void setCertificateData(CertificateData value) {
        this.certificateData = value;
    }

}

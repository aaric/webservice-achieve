
package cn.com.infosec.ra.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.com.infosec.ra.webservice package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TransactionCode_QNAME = new QName("http://webservice.ra.infosec.com.cn/", "transactionCode");
    private final static QName _Result_QNAME = new QName("http://webservice.ra.infosec.com.cn/", "result");
    private final static QName _CaId_QNAME = new QName("http://webservice.ra.infosec.com.cn/", "caId");
    private final static QName _TimeStamp_QNAME = new QName("http://webservice.ra.infosec.com.cn/", "timeStamp");
    private final static QName _P10_QNAME = new QName("http://webservice.ra.infosec.com.cn/", "P10");
    private final static QName _CertSN_QNAME = new QName("http://webservice.ra.infosec.com.cn/", "certSN");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.com.infosec.ra.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CertExtensions }
     * 
     */
    public CertExtensions createCertExtensions() {
        return new CertExtensions();
    }

    /**
     * Create an instance of {@link CertIssueRequest }
     * 
     */
    public CertIssueRequest createCertIssueRequest() {
        return new CertIssueRequest();
    }

    /**
     * Create an instance of {@link CertUpdateRequest }
     * 
     */
    public CertUpdateRequest createCertUpdateRequest() {
        return new CertUpdateRequest();
    }

    /**
     * Create an instance of {@link KeyRestoreRequest }
     * 
     */
    public KeyRestoreRequest createKeyRestoreRequest() {
        return new KeyRestoreRequest();
    }

    /**
     * Create an instance of {@link CertFreezeRequest }
     * 
     */
    public CertFreezeRequest createCertFreezeRequest() {
        return new CertFreezeRequest();
    }

    /**
     * Create an instance of {@link CertUnFreezeRequest }
     * 
     */
    public CertUnFreezeRequest createCertUnFreezeRequest() {
        return new CertUnFreezeRequest();
    }

    /**
     * Create an instance of {@link CertRevokeRequest }
     * 
     */
    public CertRevokeRequest createCertRevokeRequest() {
        return new CertRevokeRequest();
    }

    /**
     * Create an instance of {@link CertTemplateRequest }
     * 
     */
    public CertTemplateRequest createCertTemplateRequest() {
        return new CertTemplateRequest();
    }

    /**
     * Create an instance of {@link CertTemplateResponse }
     * 
     */
    public CertTemplateResponse createCertTemplateResponse() {
        return new CertTemplateResponse();
    }

    /**
     * Create an instance of {@link CertSearchRequest }
     * 
     */
    public CertSearchRequest createCertSearchRequest() {
        return new CertSearchRequest();
    }

    /**
     * Create an instance of {@link CertTemplateResponse.Templates }
     * 
     */
    public CertTemplateResponse.Templates createCertTemplateResponseTemplates() {
        return new CertTemplateResponse.Templates();
    }

    /**
     * Create an instance of {@link CertExtensions.CertExtension }
     * 
     */
    public CertExtensions.CertExtension createCertExtensionsCertExtension() {
        return new CertExtensions.CertExtension();
    }

    /**
     * Create an instance of {@link Signature }
     * 
     */
    public Signature createSignature() {
        return new Signature();
    }

    /**
     * Create an instance of {@link CertificateData }
     * 
     */
    public CertificateData createCertificateData() {
        return new CertificateData();
    }

    /**
     * Create an instance of {@link CertIssueRequest.Parameters }
     * 
     */
    public CertIssueRequest.Parameters createCertIssueRequestParameters() {
        return new CertIssueRequest.Parameters();
    }

    /**
     * Create an instance of {@link CertIssueResponse }
     * 
     */
    public CertIssueResponse createCertIssueResponse() {
        return new CertIssueResponse();
    }

    /**
     * Create an instance of {@link CertUpdateRequest.Parameters }
     * 
     */
    public CertUpdateRequest.Parameters createCertUpdateRequestParameters() {
        return new CertUpdateRequest.Parameters();
    }

    /**
     * Create an instance of {@link CertUpdateResponse }
     * 
     */
    public CertUpdateResponse createCertUpdateResponse() {
        return new CertUpdateResponse();
    }

    /**
     * Create an instance of {@link KeyRestoreRequest.Parameters }
     * 
     */
    public KeyRestoreRequest.Parameters createKeyRestoreRequestParameters() {
        return new KeyRestoreRequest.Parameters();
    }

    /**
     * Create an instance of {@link KeyRestoreResponse }
     * 
     */
    public KeyRestoreResponse createKeyRestoreResponse() {
        return new KeyRestoreResponse();
    }

    /**
     * Create an instance of {@link CertFreezeRequest.Parameters }
     * 
     */
    public CertFreezeRequest.Parameters createCertFreezeRequestParameters() {
        return new CertFreezeRequest.Parameters();
    }

    /**
     * Create an instance of {@link CertFreezeResponse }
     * 
     */
    public CertFreezeResponse createCertFreezeResponse() {
        return new CertFreezeResponse();
    }

    /**
     * Create an instance of {@link CertUnFreezeRequest.Parameters }
     * 
     */
    public CertUnFreezeRequest.Parameters createCertUnFreezeRequestParameters() {
        return new CertUnFreezeRequest.Parameters();
    }

    /**
     * Create an instance of {@link CertUnFreezeResponse }
     * 
     */
    public CertUnFreezeResponse createCertUnFreezeResponse() {
        return new CertUnFreezeResponse();
    }

    /**
     * Create an instance of {@link CertRevokeRequest.Parameters }
     * 
     */
    public CertRevokeRequest.Parameters createCertRevokeRequestParameters() {
        return new CertRevokeRequest.Parameters();
    }

    /**
     * Create an instance of {@link CertRevokeResponse }
     * 
     */
    public CertRevokeResponse createCertRevokeResponse() {
        return new CertRevokeResponse();
    }

    /**
     * Create an instance of {@link CertTemplateRequest.Parameters }
     * 
     */
    public CertTemplateRequest.Parameters createCertTemplateRequestParameters() {
        return new CertTemplateRequest.Parameters();
    }

    /**
     * Create an instance of {@link FaultDetail }
     * 
     */
    public FaultDetail createFaultDetail() {
        return new FaultDetail();
    }

    /**
     * Create an instance of {@link CertSearchRequest.Parameters }
     * 
     */
    public CertSearchRequest.Parameters createCertSearchRequestParameters() {
        return new CertSearchRequest.Parameters();
    }

    /**
     * Create an instance of {@link CertSearchResponse }
     * 
     */
    public CertSearchResponse createCertSearchResponse() {
        return new CertSearchResponse();
    }

    /**
     * Create an instance of {@link CertTemplateResponse.Templates.Template }
     * 
     */
    public CertTemplateResponse.Templates.Template createCertTemplateResponseTemplatesTemplate() {
        return new CertTemplateResponse.Templates.Template();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ra.infosec.com.cn/", name = "transactionCode")
    public JAXBElement<String> createTransactionCode(String value) {
        return new JAXBElement<String>(_TransactionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ra.infosec.com.cn/", name = "result")
    public JAXBElement<Boolean> createResult(Boolean value) {
        return new JAXBElement<Boolean>(_Result_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ra.infosec.com.cn/", name = "caId")
    public JAXBElement<String> createCaId(String value) {
        return new JAXBElement<String>(_CaId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ra.infosec.com.cn/", name = "timeStamp")
    public JAXBElement<String> createTimeStamp(String value) {
        return new JAXBElement<String>(_TimeStamp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ra.infosec.com.cn/", name = "P10")
    public JAXBElement<String> createP10(String value) {
        return new JAXBElement<String>(_P10_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ra.infosec.com.cn/", name = "certSN")
    public JAXBElement<String> createCertSN(String value) {
        return new JAXBElement<String>(_CertSN_QNAME, String.class, null, value);
    }

}

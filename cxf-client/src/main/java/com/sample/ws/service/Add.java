
package com.sample.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;add complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="add"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "x",
    "y"
})
public class Add {

    protected int x;
    protected int y;

    /**
     * ��ȡx���Ե�ֵ��
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * ����x���Ե�ֵ��
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * ��ȡy���Ե�ֵ��
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * ����y���Ե�ֵ��
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

}

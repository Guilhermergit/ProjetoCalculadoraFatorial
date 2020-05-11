
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "fatorial", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fatorial", namespace = "http://control/")
public class Fatorial {

    @XmlElement(name = "num", namespace = "")
    private int num;

    /**
     * 
     * @return
     *     returns int
     */
    public int getNum() {
        return this.num;
    }

    /**
     * 
     * @param num
     *     the value for the num property
     */
    public void setNum(int num) {
        this.num = num;
    }

}

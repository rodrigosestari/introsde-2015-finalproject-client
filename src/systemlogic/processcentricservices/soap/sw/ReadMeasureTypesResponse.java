
package systemlogic.processcentricservices.soap.sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readMeasureTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readMeasureTypesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeasureProfile" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readMeasureTypesResponse", propOrder = {
    "measureProfile"
})
public class ReadMeasureTypesResponse {

    @XmlElement(name = "MeasureProfile")
    protected ReadMeasureTypesResponse.MeasureProfile measureProfile;

    /**
     * Gets the value of the measureProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ReadMeasureTypesResponse.MeasureProfile }
     *     
     */
    public ReadMeasureTypesResponse.MeasureProfile getMeasureProfile() {
        return measureProfile;
    }

    /**
     * Sets the value of the measureProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadMeasureTypesResponse.MeasureProfile }
     *     
     */
    public void setMeasureProfile(ReadMeasureTypesResponse.MeasureProfile value) {
        this.measureProfile = value;
    }


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
     *         &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "measureType"
    })
    public static class MeasureProfile {

        @XmlElement(nillable = true)
        protected List<String> measureType;

        /**
         * Gets the value of the measureType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the measureType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMeasureType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMeasureType() {
            if (measureType == null) {
                measureType = new ArrayList<String>();
            }
            return this.measureType;
        }

    }

}

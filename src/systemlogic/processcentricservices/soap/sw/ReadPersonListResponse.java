
package systemlogic.processcentricservices.soap.sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="people" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="person" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="healthProfile" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="measureType" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "readPersonListResponse", propOrder = {
    "people"
})
public class ReadPersonListResponse {

    protected ReadPersonListResponse.People people;

    /**
     * Gets the value of the people property.
     * 
     * @return
     *     possible object is
     *     {@link ReadPersonListResponse.People }
     *     
     */
    public ReadPersonListResponse.People getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadPersonListResponse.People }
     *     
     */
    public void setPeople(ReadPersonListResponse.People value) {
        this.people = value;
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
     *         &lt;element name="person" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="healthProfile" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="measureType" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "person"
    })
    public static class People {

        @XmlElement(nillable = true)
        protected List<ReadPersonListResponse.People.Person> person;

        /**
         * Gets the value of the person property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the person property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPerson().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReadPersonListResponse.People.Person }
         * 
         * 
         */
        public List<ReadPersonListResponse.People.Person> getPerson() {
            if (person == null) {
                person = new ArrayList<ReadPersonListResponse.People.Person>();
            }
            return this.person;
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
         *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="healthProfile" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="measureType" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
        @XmlType(name = "", propOrder = {
            "idPerson",
            "firstname",
            "lastname",
            "healthProfile"
        })
        public static class Person {

            protected int idPerson;
            @XmlElement(required = true)
            protected String firstname;
            @XmlElement(required = true)
            protected String lastname;
            @XmlElement(nillable = true)
            protected List<ReadPersonListResponse.People.Person.HealthProfile> healthProfile;

            /**
             * Gets the value of the idPerson property.
             * 
             */
            public int getIdPerson() {
                return idPerson;
            }

            /**
             * Sets the value of the idPerson property.
             * 
             */
            public void setIdPerson(int value) {
                this.idPerson = value;
            }

            /**
             * Gets the value of the firstname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstname() {
                return firstname;
            }

            /**
             * Sets the value of the firstname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstname(String value) {
                this.firstname = value;
            }

            /**
             * Gets the value of the lastname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastname() {
                return lastname;
            }

            /**
             * Sets the value of the lastname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastname(String value) {
                this.lastname = value;
            }

            /**
             * Gets the value of the healthProfile property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the healthProfile property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHealthProfile().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ReadPersonListResponse.People.Person.HealthProfile }
             * 
             * 
             */
            public List<ReadPersonListResponse.People.Person.HealthProfile> getHealthProfile() {
                if (healthProfile == null) {
                    healthProfile = new ArrayList<ReadPersonListResponse.People.Person.HealthProfile>();
                }
                return this.healthProfile;
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
             *         &lt;element name="measureType" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
            @XmlType(name = "", propOrder = {
                "measureType"
            })
            public static class HealthProfile {

                @XmlElement(nillable = true)
                protected List<ReadPersonListResponse.People.Person.HealthProfile.MeasureType> measureType;

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
                 * {@link ReadPersonListResponse.People.Person.HealthProfile.MeasureType }
                 * 
                 * 
                 */
                public List<ReadPersonListResponse.People.Person.HealthProfile.MeasureType> getMeasureType() {
                    if (measureType == null) {
                        measureType = new ArrayList<ReadPersonListResponse.People.Person.HealthProfile.MeasureType>();
                    }
                    return this.measureType;
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
                 *         &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
                    "measure",
                    "value"
                })
                public static class MeasureType {

                    @XmlElement(required = true)
                    protected String measure;
                    protected float value;

                    /**
                     * Gets the value of the measure property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMeasure() {
                        return measure;
                    }

                    /**
                     * Sets the value of the measure property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMeasure(String value) {
                        this.measure = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     */
                    public void setValue(float value) {
                        this.value = value;
                    }

                }

            }

        }

    }

}

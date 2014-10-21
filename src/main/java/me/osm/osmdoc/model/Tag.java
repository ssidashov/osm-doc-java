//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.21 at 09:37:20 PM CEST 
//


package me.osm.osmdoc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;group ref="{http://map.osm.me/osm-doc-part}titleDescription" minOccurs="0"/>
 *         &lt;element name="key" type="{http://map.osm.me/osm-doc-part}keyType"/>
 *         &lt;element name="val" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://map.osm.me/osm-doc-part}titleDescription" minOccurs="0"/>
 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute ref="{http://map.osm.me/osm-doc-part}match"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://map.osm.me/osm-doc-part}tag-value-type"/>
 *       &lt;attribute name="exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "alias",
    "description",
    "key",
    "val"
})
@XmlRootElement(name = "tag")
public class Tag
    implements Serializable
{

    private final static long serialVersionUID = 2L;
    protected String title;
    protected List<String> alias;
    protected String description;
    @XmlElement(required = true)
    protected KeyType key;
    protected List<Tag.Val> val;
    @XmlAttribute(name = "tag-value-type", namespace = "http://map.osm.me/osm-doc-part")
    protected Tag.TagValueType tagValueType;
    @XmlAttribute(name = "exclude")
    protected Boolean exclude;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlias() {
        if (alias == null) {
            alias = new ArrayList<String>();
        }
        return this.alias;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setKey(KeyType value) {
        this.key = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the val property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tag.Val }
     * 
     * 
     */
    public List<Tag.Val> getVal() {
        if (val == null) {
            val = new ArrayList<Tag.Val>();
        }
        return this.val;
    }

    /**
     * Gets the value of the tagValueType property.
     * 
     * @return
     *     possible object is
     *     {@link Tag.TagValueType }
     *     
     */
    public Tag.TagValueType getTagValueType() {
        if (tagValueType == null) {
            return Tag.TagValueType.ANY_STRING;
        } else {
            return tagValueType;
        }
    }

    /**
     * Sets the value of the tagValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tag.TagValueType }
     *     
     */
    public void setTagValueType(Tag.TagValueType value) {
        this.tagValueType = value;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExclude() {
        if (exclude == null) {
            return false;
        } else {
            return exclude;
        }
    }

    /**
     * Sets the value of the exclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="anyString"/>
     *     &lt;enumeration value="enum"/>
     *     &lt;enumeration value="measure"/>
     *     &lt;enumeration value="number"/>
     *     &lt;enumeration value="openHours"/>
     *     &lt;enumeration value="phone"/>
     *     &lt;enumeration value="mail"/>
     *     &lt;enumeration value="url"/>
     *     &lt;enumeration value="wiki"/>
     *     &lt;enumeration value="boolean"/>
     *     &lt;enumeration value="period"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum TagValueType {


        /**
         * Any string without restrictions
         * 
         */
        @XmlEnumValue("anyString")
        ANY_STRING("anyString"),

        /**
         * Possible values and their translations are restricted by val tags
         * 
         */
        @XmlEnumValue("enum")
        ENUM("enum"),

        /**
         * Measured value. As 100mph
         * 
         */
        @XmlEnumValue("measure")
        MEASURE("measure"),

        /**
         * Any number
         * 
         */
        @XmlEnumValue("number")
        NUMBER("number"),

        /**
         * Open hours string.
         * 
         */
        @XmlEnumValue("openHours")
        OPEN_HOURS("openHours"),

        /**
         * Phone number string
         * 
         */
        @XmlEnumValue("phone")
        PHONE("phone"),

        /**
         * Email string
         * 
         */
        @XmlEnumValue("mail")
        MAIL("mail"),

        /**
         * Url. Like http://flick.com/12345657
         * 
         */
        @XmlEnumValue("url")
        URL("url"),

        /**
         * Wiki link: ru:Екатеринбург
         * 
         */
        @XmlEnumValue("wiki")
        WIKI("wiki"),

        /**
         * yes/no, true/false, 1/0
         * 
         */
        @XmlEnumValue("boolean")
        BOOLEAN("boolean"),

        /**
         * Eg. 18:00-19:30
         * 
         */
        @XmlEnumValue("period")
        PERIOD("period");
        private final String value;

        TagValueType(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Tag.TagValueType fromValue(String v) {
            for (Tag.TagValueType c: Tag.TagValueType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

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
     *       &lt;group ref="{http://map.osm.me/osm-doc-part}titleDescription" minOccurs="0"/>
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute ref="{http://map.osm.me/osm-doc-part}match"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "title",
        "alias",
        "description"
    })
    public static class Val
        implements Serializable
    {

        private final static long serialVersionUID = 2L;
        protected String title;
        protected List<String> alias;
        protected String description;
        @XmlAttribute(name = "value", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String value;
        @XmlAttribute(name = "match", namespace = "http://map.osm.me/osm-doc-part")
        protected Tag.Val.MatchType match;

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the alias property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alias property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlias().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAlias() {
            if (alias == null) {
                alias = new ArrayList<String>();
            }
            return this.alias;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the match property.
         * 
         * @return
         *     possible object is
         *     {@link Tag.Val.MatchType }
         *     
         */
        public Tag.Val.MatchType getMatch() {
            if (match == null) {
                return Tag.Val.MatchType.EXACT;
            } else {
                return match;
            }
        }

        /**
         * Sets the value of the match property.
         * 
         * @param value
         *     allowed object is
         *     {@link Tag.Val.MatchType }
         *     
         */
        public void setMatch(Tag.Val.MatchType value) {
            this.match = value;
        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType>
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *     &lt;enumeration value="any"/>
         *     &lt;enumeration value="exact"/>
         *     &lt;enumeration value="with-namespace"/>
         *     &lt;enumeration value="contains"/>
         *     &lt;enumeration value="regexp"/>
         *   &lt;/restriction>
         * &lt;/simpleType>
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        public enum MatchType {


            /**
             * No actual checking for value, except "no"
             * 
             */
            @XmlEnumValue("any")
            ANY("any"),

            /**
             * Exactly match (deaflult)
             * 
             */
            @XmlEnumValue("exact")
            EXACT("exact"),

            /**
             * Match with namespace prefix/postfix ru:urban
             * 
             */
            @XmlEnumValue("with-namespace")
            WITH_NAMESPACE("with-namespace"),

            /**
             * Check is value of tag substring of object tag value
             * 
             */
            @XmlEnumValue("contains")
            CONTAINS("contains"),

            /**
             * This is regexp pattern
             * 
             */
            @XmlEnumValue("regexp")
            REGEXP("regexp");
            private final String value;

            MatchType(String v) {
                value = v;
            }

            public String value() {
                return value;
            }

            public static Tag.Val.MatchType fromValue(String v) {
                for (Tag.Val.MatchType c: Tag.Val.MatchType.values()) {
                    if (c.value.equals(v)) {
                        return c;
                    }
                }
                throw new IllegalArgumentException(v);
            }

        }

    }

}

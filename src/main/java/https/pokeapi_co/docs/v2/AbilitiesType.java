//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.09.07 a las 09:30:24 AM CDT 
//


package https.pokeapi_co.docs.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AbilitiesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AbilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ability" type="{https://pokeapi.co/docs/v2}ability"/>
 *         &lt;element name="slot" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="_hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbilitiesType", propOrder = {
    "ability",
    "slot",
    "hidden"
})
public class AbilitiesType {

    @XmlElement(required = true)
    protected Ability ability;
    protected long slot;
    @XmlElement(name = "_hidden")
    protected boolean hidden;

    /**
     * Obtiene el valor de la propiedad ability.
     * 
     * @return
     *     possible object is
     *     {@link Ability }
     *     
     */
    public Ability getAbility() {
        return ability;
    }

    /**
     * Define el valor de la propiedad ability.
     * 
     * @param value
     *     allowed object is
     *     {@link Ability }
     *     
     */
    public void setAbility(Ability value) {
        this.ability = value;
    }

    /**
     * Obtiene el valor de la propiedad slot.
     * 
     */
    public long getSlot() {
        return slot;
    }

    /**
     * Define el valor de la propiedad slot.
     * 
     */
    public void setSlot(long value) {
        this.slot = value;
    }

    /**
     * Obtiene el valor de la propiedad hidden.
     * 
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Define el valor de la propiedad hidden.
     * 
     */
    public void setHidden(boolean value) {
        this.hidden = value;
    }

}

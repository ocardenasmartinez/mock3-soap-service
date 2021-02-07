//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.02.07 a las 01:22:01 PM CLST 
//


package cl.santander.service.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosAcceso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosAcceso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idServidor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioPool" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosAcceso", propOrder = {
    "idServidor",
    "usuarioPool"
})
public class DatosAcceso {

    @XmlElement(required = true)
    protected String idServidor;
    @XmlElement(required = true)
    protected String usuarioPool;

    /**
     * Obtiene el valor de la propiedad idServidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdServidor() {
        return idServidor;
    }

    /**
     * Define el valor de la propiedad idServidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdServidor(String value) {
        this.idServidor = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioPool.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioPool() {
        return usuarioPool;
    }

    /**
     * Define el valor de la propiedad usuarioPool.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioPool(String value) {
        this.usuarioPool = value;
    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.02.05 a las 10:48:02 AM CLST 
//


package cl.santander.service.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosAcceso" type="{http://soap.service.santander.cl}datosAcceso"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idDocRecuperar" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TipoDoc" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tipoMIMEDestino" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datosAcceso"
})
@XmlRootElement(name = "gdRecuperarComoTipoMimeWS")
public class GdRecuperarComoTipoMimeWS {

    @XmlElement(required = true)
    protected DatosAcceso datosAcceso;
    @XmlAttribute(name = "idDocRecuperar", required = true)
    protected String idDocRecuperar;
    @XmlAttribute(name = "TipoDoc", required = true)
    protected String tipoDoc;
    @XmlAttribute(name = "tipoMIMEDestino", required = true)
    protected String tipoMIMEDestino;

    /**
     * Obtiene el valor de la propiedad datosAcceso.
     * 
     * @return
     *     possible object is
     *     {@link DatosAcceso }
     *     
     */
    public DatosAcceso getDatosAcceso() {
        return datosAcceso;
    }

    /**
     * Define el valor de la propiedad datosAcceso.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosAcceso }
     *     
     */
    public void setDatosAcceso(DatosAcceso value) {
        this.datosAcceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idDocRecuperar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocRecuperar() {
        return idDocRecuperar;
    }

    /**
     * Define el valor de la propiedad idDocRecuperar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocRecuperar(String value) {
        this.idDocRecuperar = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Define el valor de la propiedad tipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDoc(String value) {
        this.tipoDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMIMEDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMIMEDestino() {
        return tipoMIMEDestino;
    }

    /**
     * Define el valor de la propiedad tipoMIMEDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMIMEDestino(String value) {
        this.tipoMIMEDestino = value;
    }

}

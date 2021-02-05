//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.02.05 a las 10:59:52 AM CLST 
//


package cl.santander.service.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="idDocRecuperar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoMIMEDestino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datosAcceso">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idServidor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="usuarioPool" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idDocRecuperar",
    "tipoDoc",
    "tipoMIMEDestino",
    "datosAcceso"
})
@XmlRootElement(name = "gdRecuperarComoTipoMimeWS")
public class GdRecuperarComoTipoMimeWS {

    @XmlElement(required = true)
    protected String idDocRecuperar;
    @XmlElement(required = true)
    protected String tipoDoc;
    @XmlElement(required = true)
    protected String tipoMIMEDestino;
    @XmlElement(required = true)
    protected DatosAcceso datosAcceso;

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

    /**
     * Obtiene el valor de la propiedad datosAcceso.
     * 
     * @return
     *     possible object is
     *     {@link GdRecuperarComoTipoMimeWS.DatosAcceso }
     *     
     */
    public GdRecuperarComoTipoMimeWS.DatosAcceso getDatosAcceso() {
        return datosAcceso;
    }

    /**
     * Define el valor de la propiedad datosAcceso.
     * 
     * @param value
     *     allowed object is
     *     {@link GdRecuperarComoTipoMimeWS.DatosAcceso }
     *     
     */
    public void setDatosAcceso(GdRecuperarComoTipoMimeWS.DatosAcceso value) {
        this.datosAcceso = value;
    }


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
    @XmlType(name = "", propOrder = {
        "idServidor",
        "usuarioPool"
    })
    public static class DatosAcceso {

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

}

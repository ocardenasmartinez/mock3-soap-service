package cl.santander;

import cl.santander.service.soap.Country;
import cl.santander.service.soap.GdRecuperarComoTipoMimeWS;
import cl.santander.service.soap.GetCountryResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TipoMimeEndpoint {

    private static final String NAMESPACE_URI = "http://soap.service.santander.cl";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "gdRecuperarComoTipoMimeWS")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GdRecuperarComoTipoMimeWS request) {
        GetCountryResponse response = new GetCountryResponse();
        Country country = new Country();
        country.setCapital("Capital");
        response.setCountry(country);
        return response;
    }

}

package cl.santander;

import cl.santander.service.soap.GdRecuperarComoTipoMimeWS;
import cl.santander.service.soap.GdRecuperarComoTipoMimeWSResponse;
import cl.santander.service.soap.MethodResult;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TipoMimeEndpoint {

    @PayloadRoot(namespace = "http://soap.service.santander.cl", localPart = "gdRecuperarComoTipoMimeWS")
    @ResponsePayload
    public GdRecuperarComoTipoMimeWSResponse getTipoMime(@RequestPayload GdRecuperarComoTipoMimeWS request) {
        GdRecuperarComoTipoMimeWSResponse response = new GdRecuperarComoTipoMimeWSResponse();
        MethodResult methodResult = new MethodResult();
        methodResult.setDocumento("aaaa");
        response.setDocumento(methodResult);
        return response;
    }

}

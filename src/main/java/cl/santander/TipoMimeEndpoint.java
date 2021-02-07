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
        methodResult.setTipoMime("image/jpeg");
        methodResult.setDocumento("/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsU\n" +
                "FRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwN\n" +
                "Gg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3\n" +
                "Nzc3Nzc3Nzc3N//AABEIAHsAewMBIgACEQEDEQH/xAAcAAEAAgMBAQEAAAAAAAAA\n" +
                "AAAABgcEBQgDAQL/xAA8EAABAwMBBQUFBAkFAAAAAAABAgMEAAURBhITITFBB1Fh\n" +
                "cYEUIjKRoSNCYoIkM1JTkrGywdEIFWNywv/EABoBAQACAwEAAAAAAAAAAAAAAAAD\n" +
                "BAIFBgH/xAAjEQACAgIBBAIDAAAAAAAAAAAAAQIDBBEhBRIxUSJBE2Hw/9oADAMB\n" +
                "AAIRAxEAPwC8aUpQClKUApSlAY1ynRrbBemzXQ1HYSVrUeOB5dT4VWL2qLve5JcM\n" +
                "5y1wc5bjRQkOkf8AI4c8fBOMd55149uuoVRXrTZkLwlwqlPDPPZ4IHlnJ80ioLb7\n" +
                "v+KgLRiB4AKh3y6MO52tpcjfpPgUuZGPLB8a3umNUGbcXrJdktM3dhAcG7/Vym/3\n" +
                "iMnI8Unkep51W9vvHw+9UX1hqxUDWtnnw1ne23ZU4UEZUCrJQfy5HrQHTNK/DDiX\n" +
                "mW3WzlC0hSSOoNfugFKUoBSlKAUpSgFKUoBSlKAqHtL0nF1FqR9x+apmbuUMwkFY\n" +
                "CcpG0eHXJUM1SsZyWJ4gNx3VTN5utykZO3nGKuPX8e+T9Y7y0NPERJrKVYGErQUN\n" +
                "qyD12VIVnH7Q7q+WXR0mJ2pS79JYbTbXFOqYUT7yVqAGSOnNVRSvqi9OSM1XN/RD\n" +
                "b1p7VdktC5y4zO7QnLhbd21tDvIx08M4qt3HFOrWtxRUpRJJJ4k1cujNYXO9anRb\n" +
                "ZzajvkvCY0VEpbSEE/CfhwQE9OfHNU7LS0mU8GDloLUEHOfdzw+lSmB2RpNSl6Wt\n" +
                "CljCjCZz/AK2tYFgSG7FbUAghMVoZH/UVn0ApSlAKUpQClKUApSlAK199u8OxWqT\n" +
                "cri8Go8dBUonme4DvJPACvDU2oYOm7W7OuC/dSDsNpPvOHuH9z0rmXVWrL72g3mP\n" +
                "Hd91pbuzEhNk7CCeAJ7zjmo+PKgLp0LqZq7wHJyUrQmRla2zxKDtEZ8RwPHwqSrc\n" +
                "aeSdlWc9Ki1lsEeFaocGOotLio2UuIJSonmTkcRk5PrW2atr7hxLmyFt/s704Pyx\n" +
                "n1zXN5eDe5OEF8f79mxVtckpN8mtuLEMe2NICG1ykFt9TA2XFJ7ipPGqJ11p9nT9\n" +
                "1QzEcUph5veISs+8jjjFdIzYsSPblpaZSk8AnAxjj0rmvX7MiPqu4NyXHHPtNpsr\n" +
                "VnCDxAHgM4q/0/DyMd/Oe16Ir76pw0o8+zp/s+urN50XaJjKgcxkNrA+6tA2VD5i\n" +
                "pFXJvZzrudou5haNt+2vK/SYmef4k9yh9eR8OqbdOjXKCxNgvJejPoC23EHgoGtq\n" +
                "UzJpSlAKUpQClKUArylPtRo7j8hxLbTSSta1HASkDJJr1qvu1+/i2WhqCkgqfCn3\n" +
                "k55tN4OPVZQPLNAU72ratfv14cYBUllOPcJ+BPNKCO/kpXicfdFSPsY0g4po3yQ0\n" +
                "S66CiMCPhR1X68h4edV5bbK9d9VxrU4pRkSHR7QoniCRtL+Qz611Xa4jNvhsxYyA\n" +
                "htpAQlI6ADAoDyZs3DLjwB/CM17qtawPs3wT+JNZya9BwoCLTozzasPg56dx8qpX\n" +
                "trtRZuEG5IR7ryCytX4k8R9CflXSD7aHmyhwAg/Sq07TrCbjpufGAy+wnfsnvKRn\n" +
                "6jI9aA5wQpSFpUg4UDkGr07D9S7haLO6rECepaoo/cSEjLjWe5Q94etUgywp5Lpb\n" +
                "HFtG2R4DGf51JtAOPOyZVvZcLchSBJiLz8D7R2kkeYyD4UB1tStXpm7ov1hgXRsb\n" +
                "IkspWpH7CvvJ9DkVtKAUpSgFKUoBVB9q8z/cdXXGKokssGHDIzwwpQWr+sD0q8pF\n" +
                "xhxnEtyJLTa1ckrWBXPl0tlx1FqrVohpGUzSUOE4AUn4ePoKwlZCKbkzKMJSekjN\n" +
                "0DA3PalqRb6criuupSe7Ln+BV2Mr41W1uShWrFXttvYRe4Sd8nP6uU0cOIPjjj44\n" +
                "Jqdw5G0kAnjWa5WzE3TZFehIxWC27w51677hQHqpVaO+bJeQSOBT7w762a3QBknA\n" +
                "FaG5SQ46Vk4SOvcKA5207bUr145ayMtqcksKA6pCVj+1YehXC3qy3LTz3h+qSKlG\n" +
                "iClu5an1g+kCLCZkFkn777pIQkeij8xUc0Mzi7Gavg3FbUsnxIx/LNAXx2Jzi/ab\n" +
                "1CJBRDuryWvBCjtY+easeqh/07FT9tv8xXJ+aD67OT/VVvUApSlAK0su+pYlvspj\n" +
                "rcSydlZStIUTgHgDz5jrW6rRX20lxSp0MHfgfaN9HQP/AFjlVbLdyqbp8ktKg5an\n" +
                "4Ma2pL70mU+2AX1E7JOcJ5AH0FZFutMG3reXFYQ2XjleBzNYECSAhKknKFDIrZpf\n" +
                "ChwNcpVld7+fnfJdshJPjwU1frpI0fqyW1LQpdrlOh/CRlTDgGN4n0wCOoqfWi6R\n" +
                "rhEblQnkOtKHxIVkVr+1Oxi62VUthI9pjDaT4juqkbPeZtklGVang0tXxoIyh3wU\n" +
                "P8V1GBcrakvtcFO6Gnv2dKtzCBg8a9fbgByqIaavqL3Zo1wQnd70EKbznZUDgjPp\n" +
                "Wydl7CMgFSjwSkdT3Vck1FbfgiSbekbSRMUsYJ4d1RnV011myyUxlASH0llpSjgJ\n" +
                "KuG0T0CRkk+Ffi7Xl633JNtdZZTLU0HjvXCEoQokDlxJJB4cOXiKiHaIxMu1vZO/\n" +
                "bYabJ/VOZZdUcYCiQCknpnKfEZryM1OPcvsOLT0yIaguzL1viaX0+VKt0Ze247y9\n" +
                "qe6rP4RyFeMxaLPYzDaVl6QffV3958scK1sWaxFQrZbKXBwI5k+tSPs1009rbVzY\n" +
                "kozAjFLss9AgH3UfmIx5Zr08Ly7G7GqxaEgoeTsvy8ynARgjbxsj+EJqcV8SkJAA\n" +
                "AAAwAK+0ApSlAK+GvtMUBErzENull1Cf0WQrPDk2s8x5Hn5+dY3tBTyOKmT7Lb7S\n" +
                "mnkBbaxhSVciKjEzTclteYDqXGujbyiFJ/Nxz61zfUekylY7aV5+jY4+TDXbYa2b\n" +
                "LK4rra9kpUk5zXMs9ZTNkpbV9nvV48smup2NLPzNpF1UlEdQwptlw7S/zDGz6VmW\n" +
                "vQWlLUAIdhhAjhtut71XzXk1d6TjW0xk7fLI8yyuTSgU1oTVNgh2GNb3Zfsz7QJX\n" +
                "vwQFEkkkK5deVWBpd+Nep7D8J5D8ZhRWpxBynI5D61sNW9l+m7/DcSxAYt80j7OT\n" +
                "GQEYV+JI4KFfjQFtRZdNsQwEhxGUuEdVDgfrmrOfb2VqPshpjtuXor7ttttzZ1Ox\n" +
                "d4LLjrDsZLaw2CSFJKu7wIrQ2Cy6g1HGcbdbLENOCfaMjbxyGMcvCr7lhiQyW5Da\n" +
                "HUfsrANaqQtmO3umG0Ntj7iBgVq31eUIdqXJPVjd8uTn9cNmXdG7EkAS3ZCY42G8\n" +
                "7CioDPkOddMaN0tb9I2ZFttyc8dp15QG08vqo/2HSoJYrFadP6gkX1uMibLeUS0V\n" +
                "u7JYyOOEkYz45qz7fLROhtSmgQh1O0AeYrc4+VXcvi+SvbROvlrgyaUpVkhFKUoB\n" +
                "SlKAUpSgFKUoD5ioZdQ9ZpziQn9FfWXG1Y4AniU+ecmppXjIYakNqafbS42r4kqG\n" +
                "Qaq5eMsivt3pk1N34pba2iDOT1qGCceVYj0gqITxUpRwkDiSfAda/Go2kQLgWYgK\n" +
                "G8/Dkn+dTHTdvisxW5DbKd8tPFw5J+Z5Vz1PS5WWuMpeDbzyYVQUoryaa3aYlydl\n" +
                "c1fszR5oHFz/AAPrUwjMNxmEMspCW0JCUpHQV6CvtdFj4tVEdQRqbsiy57mxSlKs\n" +
                "kApSlAf/2Q==");
        response.setDocumento(methodResult);
        return response;
    }

}

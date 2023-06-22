package pe.edu.cibertec.boletas;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * java 11, existe http client
 * spring usar la clase RestTemplate <= deprecado
 * spring usar la clase WebClient <==
 * spring 6 con spring boot 3.0 <==
 */
@Component
public class ServicioGateway {
    public ServicioDto findById(Long id) {
        return new RestTemplate().getForObject(
                "http://localhost:8080/servicios/{id}", ServicioDto.class, id);
    }
}

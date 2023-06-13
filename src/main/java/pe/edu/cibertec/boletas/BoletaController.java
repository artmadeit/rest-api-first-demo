package pe.edu.cibertec.boletas;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.cibertec.boletas.api.BoletasApi;
import pe.edu.cibertec.boletas.dtos.Boleta;
import pe.edu.cibertec.boletas.dtos.BoletasBody;

@RestController
public class BoletaController implements BoletasApi {

    @Override
    public ResponseEntity<Void> cancelaBoleta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelaBoleta'");
    }

    @Override
    public ResponseEntity<Boleta> creaBoleta(BoletasBody body) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creaBoleta'");
    }

    @Override
    public ResponseEntity<List<Boleta>> listaBoleta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listaBoleta'");
    }

    @Override
    public ResponseEntity<Boleta> obtieneBoleta(BigDecimal id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtieneBoleta'");
    }

}

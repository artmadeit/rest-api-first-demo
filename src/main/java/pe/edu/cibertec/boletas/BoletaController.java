package pe.edu.cibertec.boletas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import pe.edu.cibertec.boletas.api.BoletasApi;
import pe.edu.cibertec.boletas.dtos.BoletaDto;
import pe.edu.cibertec.boletas.dtos.CreaBoletaRequestDto;

@AllArgsConstructor
@RestController
public class BoletaController implements BoletasApi {

    BoletaRepository boletaRepository;

    @Override
    public ResponseEntity<Void> cancelaBoleta() {
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<BoletaDto> creaBoleta(@Valid CreaBoletaRequestDto creaBoletaRequestDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creaBoleta'");
    }

    @Override
    public ResponseEntity<List<BoletaDto>> listaBoleta() {
        var boletas = boletaRepository.findAll().stream().map(boleta -> {
            BoletaDto boletaDto = new BoletaDto();
            boletaDto.setId(boleta.getId());
            boletaDto.setTotal(boleta.getTotal());
            return boletaDto;
        }).toList();
        return ResponseEntity.ok(boletas);
    }

    @Override
    public ResponseEntity<BoletaDto> obtieneBoleta(BigDecimal id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtieneBoleta'");
    }

}

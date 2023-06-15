package pe.edu.cibertec.boletas;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import pe.edu.cibertec.boletas.api.BoletasApi;
import pe.edu.cibertec.boletas.dtos.BoletaCrearRequestDto;
import pe.edu.cibertec.boletas.dtos.BoletaDto;

@RestController
@AllArgsConstructor
public class BoletaController implements BoletasApi {

    BoletaRepository boletaRepository;

    @Override
    public ResponseEntity<Void> cancelarBoleta(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarBoleta'");
    }

    @Override
    public ResponseEntity<BoletaDto> detalleBoleta(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'detalleBoleta'");
    }

    @Override
    public ResponseEntity<List<BoletaDto>> listaBoletas() {
        var boletas = boletaRepository.findAll();
        var boletaDtos = boletas.stream().map(boleta -> {
            BoletaDto dto = new BoletaDto();
            dto.setId(boleta.id);
            dto.setNombreComprador(boleta.nombreComprador);
            dto.setTotal(boleta.total);
            // ...

            return dto;
        }).toList();

        return ResponseEntity.ok(boletaDtos);
    }

    @Override
    public ResponseEntity<BoletaDto> registrarBoleta(@Valid BoletaCrearRequestDto boletaCrearRequestDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarBoleta'");
    }

}

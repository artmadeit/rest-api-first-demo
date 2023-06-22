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
import pe.edu.cibertec.boletas.dtos.LineaBoletaDto;

@RestController
@AllArgsConstructor
public class BoletaController implements BoletasApi {

    BoletaRepository boletaRepository;
    ServicioGateway servicioGateway;

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
        var boletaDtos = boletas.stream().map(this::mapDto).toList();

        return ResponseEntity.ok(boletaDtos);
    }

    public BoletaDto mapDto(Boleta boleta) {
        BoletaDto dto = new BoletaDto();
        dto.setId(boleta.getId());
        dto.setNombreComprador(boleta.getNombreComprador());
        dto.setTotal(boleta.getTotal());
        dto.setLineas(
                boleta.getLineas().stream().map(linea -> {
                    var lineaDto = new LineaBoletaDto();
                    lineaDto.setMascotaId(linea.mascotaId);
                    lineaDto.setServicioId(linea.servicioId);
                    lineaDto.setVeterinarioId(linea.veterinarioId);

                    return lineaDto;
                }).toList());

        return dto;
    }

    @Override
    public ResponseEntity<BoletaDto> registrarBoleta(@Valid BoletaCrearRequestDto boletaCrearRequestDto) {
        Boleta boleta = new Boleta();
        boleta.setNombreComprador(boletaCrearRequestDto.getNombreComprador());
        for (var linea : boletaCrearRequestDto.getLineas()) {
            var servicioDto = servicioGateway.findById(linea.getServicioId());
            boleta.addLinea(
                    linea.getMascotaId(),
                    linea.getVeterinarioId(),
                    linea.getServicioId(),
                    servicioDto.getPrecio());
        }

        var boletaGuardada = boletaRepository.save(boleta);
        var dto = mapDto(boletaGuardada);

        return ResponseEntity.status(201).body(dto);

    }

}

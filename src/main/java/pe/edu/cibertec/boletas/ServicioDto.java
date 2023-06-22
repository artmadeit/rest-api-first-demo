package pe.edu.cibertec.boletas;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ServicioDto {
    // No son necesarios estos campos por eso los deje comentados:
    Long id;
    // String nombre;
    BigDecimal precio;
}

package pe.edu.cibertec.boletas;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDate fechaRegistro;

    BigDecimal total;
}

package pe.edu.cibertec.boletas;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class LineaBoleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    Boleta boleta;
    Long mascotaId;
    Long veterinarioId;
    Long servicioId;
    BigDecimal monto;

    public LineaBoleta() {
        // jpa only
    }

    LineaBoleta(Boleta boleta, Long mascotaId, Long veterinarioId, Long servicioId, BigDecimal monto) {
        this.mascotaId = mascotaId;
        this.veterinarioId = veterinarioId;
        this.servicioId = servicioId;
        this.boleta = boleta;
    }
}

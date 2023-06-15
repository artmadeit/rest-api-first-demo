package pe.edu.cibertec.boletas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class LineaBoleta {
    @ManyToOne
    Boleta boleta;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long mascotaId;
    Long veterinarioId;
    Long servicioId;
}

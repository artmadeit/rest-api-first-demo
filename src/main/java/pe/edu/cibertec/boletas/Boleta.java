package pe.edu.cibertec.boletas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String nombreComprador;

    private BigDecimal total = new BigDecimal(0);

    @OneToMany(mappedBy = "boleta", cascade = CascadeType.PERSIST)
    private List<LineaBoleta> lineas = new ArrayList<>();

    public void addLinea(
            Long mascotaId,
            Long veterinarioId,
            Long servicioId,
            BigDecimal precio) {
        var lineaBoleta = new LineaBoleta(this, mascotaId, veterinarioId, servicioId, precio);
        this.lineas.add(lineaBoleta);
        this.total = this.total.add(precio);
    }
}

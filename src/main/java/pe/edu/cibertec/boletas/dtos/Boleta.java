package pe.edu.cibertec.boletas.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import pe.edu.cibertec.boletas.dtos.LineaBoleta;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Boleta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-13T16:21:44.073207654-05:00[America/Lima]")


public class Boleta   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nombreComprador")
  private String nombreComprador = null;

  @JsonProperty("fechaRegistro")
  private LocalDate fechaRegistro = null;

  @JsonProperty("total")
  private BigDecimal total = null;

  @JsonProperty("lineas")
  @Valid
  private List<LineaBoleta> lineas = null;

  public Boleta id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Boleta nombreComprador(String nombreComprador) {
    this.nombreComprador = nombreComprador;
    return this;
  }

  /**
   * Get nombreComprador
   * @return nombreComprador
   **/
  @Schema(description = "")
  
    public String getNombreComprador() {
    return nombreComprador;
  }

  public void setNombreComprador(String nombreComprador) {
    this.nombreComprador = nombreComprador;
  }

  public Boleta fechaRegistro(LocalDate fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
    return this;
  }

  /**
   * Get fechaRegistro
   * @return fechaRegistro
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getFechaRegistro() {
    return fechaRegistro;
  }

  public void setFechaRegistro(LocalDate fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
  }

  public Boleta total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public Boleta lineas(List<LineaBoleta> lineas) {
    this.lineas = lineas;
    return this;
  }

  public Boleta addLineasItem(LineaBoleta lineasItem) {
    if (this.lineas == null) {
      this.lineas = new ArrayList<>();
    }
    this.lineas.add(lineasItem);
    return this;
  }

  /**
   * Get lineas
   * @return lineas
   **/
  @Schema(description = "")
      @Valid
    public List<LineaBoleta> getLineas() {
    return lineas;
  }

  public void setLineas(List<LineaBoleta> lineas) {
    this.lineas = lineas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boleta boleta = (Boleta) o;
    return Objects.equals(this.id, boleta.id) &&
        Objects.equals(this.nombreComprador, boleta.nombreComprador) &&
        Objects.equals(this.fechaRegistro, boleta.fechaRegistro) &&
        Objects.equals(this.total, boleta.total) &&
        Objects.equals(this.lineas, boleta.lineas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombreComprador, fechaRegistro, total, lineas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boleta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombreComprador: ").append(toIndentedString(nombreComprador)).append("\n");
    sb.append("    fechaRegistro: ").append(toIndentedString(fechaRegistro)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    lineas: ").append(toIndentedString(lineas)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

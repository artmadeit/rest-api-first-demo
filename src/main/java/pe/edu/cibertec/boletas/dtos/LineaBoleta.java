package pe.edu.cibertec.boletas.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LineaBoleta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-13T16:21:44.073207654-05:00[America/Lima]")


public class LineaBoleta   {
  @JsonProperty("veterinarioId")
  private Long veterinarioId = null;

  @JsonProperty("mascotaId")
  private Long mascotaId = null;

  @JsonProperty("servicioId")
  private Long servicioId = null;

  public LineaBoleta veterinarioId(Long veterinarioId) {
    this.veterinarioId = veterinarioId;
    return this;
  }

  /**
   * Get veterinarioId
   * @return veterinarioId
   **/
  @Schema(description = "")
  
    public Long getVeterinarioId() {
    return veterinarioId;
  }

  public void setVeterinarioId(Long veterinarioId) {
    this.veterinarioId = veterinarioId;
  }

  public LineaBoleta mascotaId(Long mascotaId) {
    this.mascotaId = mascotaId;
    return this;
  }

  /**
   * Get mascotaId
   * @return mascotaId
   **/
  @Schema(description = "")
  
    public Long getMascotaId() {
    return mascotaId;
  }

  public void setMascotaId(Long mascotaId) {
    this.mascotaId = mascotaId;
  }

  public LineaBoleta servicioId(Long servicioId) {
    this.servicioId = servicioId;
    return this;
  }

  /**
   * Get servicioId
   * @return servicioId
   **/
  @Schema(description = "")
  
    public Long getServicioId() {
    return servicioId;
  }

  public void setServicioId(Long servicioId) {
    this.servicioId = servicioId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineaBoleta lineaBoleta = (LineaBoleta) o;
    return Objects.equals(this.veterinarioId, lineaBoleta.veterinarioId) &&
        Objects.equals(this.mascotaId, lineaBoleta.mascotaId) &&
        Objects.equals(this.servicioId, lineaBoleta.servicioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(veterinarioId, mascotaId, servicioId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineaBoleta {\n");
    
    sb.append("    veterinarioId: ").append(toIndentedString(veterinarioId)).append("\n");
    sb.append("    mascotaId: ").append(toIndentedString(mascotaId)).append("\n");
    sb.append("    servicioId: ").append(toIndentedString(servicioId)).append("\n");
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

package pe.edu.cibertec.boletas.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import pe.edu.cibertec.boletas.dtos.LineaBoleta;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BoletasBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-13T16:21:44.073207654-05:00[America/Lima]")


public class BoletasBody   {
  @JsonProperty("nombreComprador")
  private String nombreComprador = null;

  @JsonProperty("lineas")
  @Valid
  private List<LineaBoleta> lineas = null;

  public BoletasBody nombreComprador(String nombreComprador) {
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

  public BoletasBody lineas(List<LineaBoleta> lineas) {
    this.lineas = lineas;
    return this;
  }

  public BoletasBody addLineasItem(LineaBoleta lineasItem) {
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
    BoletasBody boletasBody = (BoletasBody) o;
    return Objects.equals(this.nombreComprador, boletasBody.nombreComprador) &&
        Objects.equals(this.lineas, boletasBody.lineas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreComprador, lineas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletasBody {\n");
    
    sb.append("    nombreComprador: ").append(toIndentedString(nombreComprador)).append("\n");
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

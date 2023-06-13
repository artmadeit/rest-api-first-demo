/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.43).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package pe.edu.cibertec.boletas.api;

import java.math.BigDecimal;
import pe.edu.cibertec.boletas.dtos.Boleta;
import pe.edu.cibertec.boletas.dtos.BoletasBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-13T16:21:44.073207654-05:00[America/Lima]")
@Validated
public interface BoletasApi {

    Logger log = LoggerFactory.getLogger(BoletasApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @Operation(summary = "Cancela una boleta", description = "", tags={ "boletas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "No content") })
    @RequestMapping(value = "/boletas",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> cancelaBoleta() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default BoletasApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Crea una boleta, permite en una boleta atender varias mascotas a la vez", description = "", tags={ "boletas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Boleta.class))) })
    @RequestMapping(value = "/boletas",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Boleta> creaBoleta(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BoletasBody body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"lineas\" : [ {\n    \"servicioId\" : 5,\n    \"mascotaId\" : 5,\n    \"veterinarioId\" : 1\n  }, {\n    \"servicioId\" : 5,\n    \"mascotaId\" : 5,\n    \"veterinarioId\" : 1\n  } ],\n  \"total\" : 6.027456183070403,\n  \"nombreComprador\" : \"nombreComprador\",\n  \"fechaRegistro\" : \"2000-01-23\",\n  \"id\" : 0\n}", Boleta.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default BoletasApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Paginado de boletas", description = "", tags={ "boletas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "ok", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Boleta.class)))) })
    @RequestMapping(value = "/boletas",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Boleta>> listaBoleta() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {\n  \"lineas\" : [ {\n    \"servicioId\" : 5,\n    \"mascotaId\" : 5,\n    \"veterinarioId\" : 1\n  }, {\n    \"servicioId\" : 5,\n    \"mascotaId\" : 5,\n    \"veterinarioId\" : 1\n  } ],\n  \"total\" : 6.027456183070403,\n  \"nombreComprador\" : \"nombreComprador\",\n  \"fechaRegistro\" : \"2000-01-23\",\n  \"id\" : 0\n}, {\n  \"lineas\" : [ {\n    \"servicioId\" : 5,\n    \"mascotaId\" : 5,\n    \"veterinarioId\" : 1\n  }, {\n    \"servicioId\" : 5,\n    \"mascotaId\" : 5,\n    \"veterinarioId\" : 1\n  } ],\n  \"total\" : 6.027456183070403,\n  \"nombreComprador\" : \"nombreComprador\",\n  \"fechaRegistro\" : \"2000-01-23\",\n  \"id\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default BoletasApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Ver detalle de una boleta", description = "", tags={ "boletas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "404", description = "Not found"),
        
        @ApiResponse(responseCode = "200", description = "ok", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Boleta.class))) })
    @RequestMapping(value = "/boletas/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Boleta> obtieneBoleta(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") BigDecimal id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"lineas\" : [ {\n    \"servicioId\" : 5,\n    \"mascotaId\" : 5,\n    \"veterinarioId\" : 1\n  }, {\n    \"servicioId\" : 5,\n    \"mascotaId\" : 5,\n    \"veterinarioId\" : 1\n  } ],\n  \"total\" : 6.027456183070403,\n  \"nombreComprador\" : \"nombreComprador\",\n  \"fechaRegistro\" : \"2000-01-23\",\n  \"id\" : 0\n}", Boleta.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default BoletasApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}


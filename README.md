# API First usando Spring

Usted puede generar a partir de su api specification file descrito usando open api codigo para el backend, frontend o colecciones de postman.

Existen distintas maneras de generar el codigo, la forma mas sencilla es dentro del mismo [Swagger Editor](https://editor.swagger.io/) escoger las opciones Generate Server o Generate Client.

Sin embargo esta opcion no es muy flexible, por ejemplo no permite indicar que los archivos generados esten bajo el nombre de paquete que usted desea (en nuestro caso `pe.edu.cibertec.boletas.api`). Además que genera codigo no muy limpio.

Otra opcion es usando un plugin de maven. Si usted ve el pom.xml, vera que estamos usando un plugin de maven con distintas opciones:

```xml
<plugin>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-generator-maven-plugin</artifactId>
    <version>6.6.0</version>
    <executions>
        <execution>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <generatorName>spring</generatorName>
                <inputSpec>${project.basedir}/src/main/resources/open-api.yml</inputSpec>
                <!-- <groupId>pe.edu.cibertec</groupId>
                <artifactId>boletas-api</artifactId> -->


                <apiPackage>pe.edu.cibertec.boletas.api</apiPackage>
                <modelPackage>pe.edu.cibertec.boletas.dtos</modelPackage>
                <output>${project.build.directory}/generated-sources/swagger</output>
                <configOptions>
                    <openApiNullable>false</openApiNullable>
                    <library>spring-boot</library>
                    <skipDefaultInterface>true</skipDefaultInterface>
                    <interfaceOnly>true</interfaceOnly>
                    <sourceFolder>src/gen/java/main</sourceFolder>
                    <useSpringBoot3>true</useSpringBoot3>
                    <!-- <useSpringController>true</useSpringController> -->
                </configOptions>
            </configuration>
        </execution>
    </executions>
</plugin>
```

El detalle de cada una de las opciones las puede ver aca:

- Opciones para spring, https://openapi-generator.tech/docs/generators/spring/
- Acerca de maven plugin, https://openapi-generator.tech/docs/plugins/

Hemos visto una forma de generar codigo. En general existen distintas maneras de generar codigo, para [su servidor, backend](https://www.baeldung.com/java-openapi-generator-server) o [su cliente.](https://www.baeldung.com/spring-boot-rest-client-swagger-codegen)

## Otros materiales donde aprender

Como mapear fechas en open api, https://www.baeldung.com/openapi-map-date-types
Tutorial en youtube en ingles de API First en spring, https://www.youtube.com/watch?v=YmQyzNF5iKg

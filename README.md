# API First usando Spring

Usted puede generar a partir de su api specification file descrito usando open api codigo para el backend, frontend o colecciones de postman. Esta es una ventaja que tiene el enfoque API First sobre Code First.

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
                <!-- Que tipo de generacion hara? Puede usar muchos framework (laravel, django, ..., vea https://openapi-generator.tech/docs/generators), en nuestro caso spring -->
                <generatorName>spring</generatorName>

                <!-- Donde esta ubicado su archivo de definicion de su api -->
                <inputSpec>${project.basedir}/src/main/resources/open-api.yml</inputSpec>
                <!-- Donde desea que se guarde las clases relacionadas a su API REST (GET, POST, PUT...) -->
                <apiPackage>pe.edu.cibertec.boletas.api</apiPackage>
                <!-- Donde desea que se guarde los models (schema) -->
                <modelPackage>pe.edu.cibertec.boletas.dtos</modelPackage>
                <!-- Donde desea que se guarde todo lo generado (aqui sera en /target/generated-sources/swagger) -->
                <output>${project.build.directory}/generated-sources/swagger</output>
                <configOptions>
                    <library>spring-boot</library>
                    <!-- Si desea o no usar la libreria para manejar nulls de open api generator-->
                    <openApiNullable>false</openApiNullable>

                    <skipDefaultInterface>true</skipDefaultInterface>
                    <interfaceOnly>true</interfaceOnly>
                    <sourceFolder>src/gen/java/main</sourceFolder>
                    <!-- Si usa spring boot 3, si usa java 17 ponga esto en true, sino borrelo -->
                    <useSpringBoot3>true</useSpringBoot3>
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

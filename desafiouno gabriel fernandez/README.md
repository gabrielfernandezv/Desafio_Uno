# Generador Datos Desafio

Desafio 1 nivel 3 realizado

Este proyecto expone un API REST que entrega la siguiente información:

*id*: identificador
*fechaCreacion*: Fecha de inicio de la secuencia
*fechaFin*: Fecha de fin de la secuencia
*fechas*: Lista de fechas que están en el rango de la fecha que se encuentra en “fechaCreacion” hasta la fecha “fechaFin”
*fechasFaltantes*: fechas faltantes del rango inicio - fin
Ejemplo.
```json
{
    "id": 1,
    "fechaCreacion": "1982-07-01",
    "fechaFin": "2017-01-01",
    "fechas": [
        "1983-02-01",
        "1983-07-01",
        "1983-09-01",
        "1983-12-01",
    ],
    "fechasFaltantes": [
        "1983-01-01",
        "1983-03-01",
        "1983-04-01",
        "1983-05-01",
        "1983-06-01",
        "1983-08-01",
        "1983-10-01",
        "1983-11-01"
    ]
}
```
*Nota*:
El formato de las fechas es yyyy-MM-dd
El servicio entrega 1 periodos, el periodo contiene una fecha inicial una fecha final y una lista fechas.

# Detalle de los sistemas

Swagger 2.7.0
Java 8
Spring-Boot 2.1.6.RELEASE
Maven 3


# Compilar y ejecutar el proyecto

Para copilar el proyecto se requiere Java y Maven instalado.
Ingresar al directorio *desafiouno* ejecutar el siguiente comando *maven*

```bash
mvn package
```

Luego de compilar el proyecto ingresar al directorio *target* ejecutar el siguiente comando *java*

```bash
java -jar .\desafiouno-0.0.1-SNAPSHOT.jar
```
*Nota*:
Debe estar disponible el puerto *8080* en el PC donde se ejecute esta API

# Visualizar Documentación y consumir la API

La documentación swagger del API (una vez que se levanta el API) queda disponible en

http://127.0.0.1:9094/swagger-ui.html

Para consumir el servicio se debe invocar la siguiente URL

```bash
Metodo get http://127.0.0.1:9094/call-gdd-api/callperiodos
```


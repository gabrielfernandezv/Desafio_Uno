package com.pr.desafiouno.nivel3.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;
;
import java.time.LocalDate;
import java.util.List;

@Validated
public class Periodo {

    private Long id = null;

    private LocalDate fechaCreacion = null;

    private LocalDate fechaFin = null;

    private List<LocalDate> fechas = null;

    private List<LocalDate> fechasFaltantes = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<LocalDate> getFechas() {
        return fechas;
    }

    public void setFechas(List<LocalDate> fechas) {
        this.fechas = fechas;
    }

    public List<LocalDate> getFechasFaltantes() {
        return fechasFaltantes;
    }

    public void setFechasFaltantes(List<LocalDate> fechasFaltantes) {
        this.fechasFaltantes = fechasFaltantes;
    }
}

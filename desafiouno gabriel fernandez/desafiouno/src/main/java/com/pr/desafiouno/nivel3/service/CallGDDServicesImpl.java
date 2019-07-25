package com.pr.desafiouno.nivel3.service;

import com.pr.desafiouno.nivel3.json.Periodo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.*;

@Service
public class CallGDDServicesImpl implements ICallGDDServices {
    /**
     * Invoco al api periodos GDD y agrego el campo FechasFaltantes donde agrego las fechas que faltan nivel 3
     *
     * @return
     */
    @Override
    public Periodo callPeriodoGDD() {

        RestTemplate restTemplate = new RestTemplate();
        Periodo periodo = restTemplate.getForObject("http://127.0.0.1:9095/periodos/api", Periodo.class);

        List<LocalDate> fechas = periodo.getFechas();
        Collections.sort(fechas);
        Set<LocalDate> fechasSet = new HashSet();
        fechasSet.addAll(fechas);

        Set<Integer> years = new HashSet();

        List<LocalDate> allFechas = new ArrayList<>();
        List<LocalDate> faltantes = new ArrayList<>();

        for (LocalDate fecha : fechas) {
            int year = fecha.getYear();
            years.add(year);
        }

        for (Integer year : years) {
            for (int i = 1; i < 13; i++) {
                allFechas.add(LocalDate.of(year, i, 01));
            }
        }

        for (LocalDate fecha : allFechas) {
            if (fechasSet.add(fecha)) {
                faltantes.add(fecha);
            }
        }

        periodo.setFechasFaltantes(faltantes);

        return periodo;
    }


}

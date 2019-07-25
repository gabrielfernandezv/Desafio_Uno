package com.pr.desafiouno.nivel3.controller;

import com.pr.desafiouno.nivel3.json.Periodo;
import com.pr.desafiouno.nivel3.service.ICallGDDServices;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Validated
@RestController
@RequestMapping("/call-gdd-api")
public class CallGDDController {

    @Autowired
    ICallGDDServices ICallGDDServices;

    @ApiOperation(value = "get All Periodos mas periodos faltantes", response = Periodo.class)
    @GetMapping("/callperiodos")
    public ResponseEntity<Periodo> getAllTipoContratos() {
        return new ResponseEntity<Periodo>(ICallGDDServices.callPeriodoGDD(), HttpStatus.OK);
    }


}

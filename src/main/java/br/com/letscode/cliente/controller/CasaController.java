package br.com.letscode.cliente.controller;

import br.com.letscode.cliente.model.casa.CasaInfo;
import br.com.letscode.cliente.model.casa.dto.SorteioResponse;
import br.com.letscode.cliente.service.client.CasaInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/casa")
@AllArgsConstructor
public class CasaController {

    private CasaInfoService casaInfoService;

    @GetMapping("/{id}")
    public CasaInfo listarCasaInfoById(@PathVariable String id){
        return casaInfoService.listarCasaInfo(id);
    }

    @GetMapping("/sortear")
    public SorteioResponse sortearCasa(){
        return casaInfoService.sortearCasa();
    }
}

package br.com.letscode.cliente.service.client;

import br.com.letscode.cliente.model.casa.CasaInfo;
import br.com.letscode.cliente.model.casa.dto.SorteioResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CasaInfoService {

    @Value("${cliente.casainfobychavecasa.url}")
    private String urlCasaInfo;

    @Value("${cliente.sortearcasa.url}")
    private String urlSortearCasa;

    public CasaInfo listarCasaInfo(String chavecasa) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<CasaInfo> casaInfoResponseEntity =
                restTemplate.exchange(
                        urlCasaInfo,
                        HttpMethod.GET,
                        entity,
                        CasaInfo.class, chavecasa
                );
        return casaInfoResponseEntity.getBody();

    }

    public SorteioResponse sortearCasa() {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<SorteioResponse> casaInfoResponseEntity =
                restTemplate.exchange(
                        urlSortearCasa,
                        HttpMethod.GET,
                        entity,
                        SorteioResponse.class
                );
        return casaInfoResponseEntity.getBody();
    }
}

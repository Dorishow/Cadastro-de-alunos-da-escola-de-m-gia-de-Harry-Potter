package br.com.letscode.cliente.model.casa;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Id;
import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class CasaInfo {
    @Id
    private String id;
    private String name;
    private String animal;
    private String founder;
    private List<Value> values;
}


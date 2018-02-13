package com.gialnet.angularnombres.domain;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Fincas  implements Serializable {

    //@GeneratedValue
    @Id
    private Long id;

    @Column
    private String title;

    public Fincas() {
    }

    public Fincas(Long id, String title) {
        this.id = id;
        this.title = title;
    }


    @Override
    public String toString() {
        return "Fincas{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
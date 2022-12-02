package quarkus.curso;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Fruta extends PanacheEntity {

    private String nome;
    private int quantidade;

}

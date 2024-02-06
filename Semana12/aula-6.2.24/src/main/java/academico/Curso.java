package academico;

import javax.persistence.*;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String Nome;
    private Integer NumSemestre;
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Curso() {
    }

    public Curso(Integer id, String nome, Integer numSemestre) {
        Id = id;
        Nome = nome;
        NumSemestre = numSemestre;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getNumSemestre() {
        return NumSemestre;
    }

    public void setNumSemestre(Integer numSemestre) {
        NumSemestre = numSemestre;
    }
}

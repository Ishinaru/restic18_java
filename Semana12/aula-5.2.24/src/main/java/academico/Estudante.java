package academico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer Id;
    private String Nome;
    private String Email;
    private String Matricula;
    public Estudante(){}
    public Estudante(String Nome, String Email, String Matricula){
        this.Id = null;
        this.Nome = Nome;
        this.Email = Email;
        this.Matricula = Matricula;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String toString(){
        return "Nome: "+Nome+"\nEmail: "+Email+"\nMatrícula: "+Matricula;
    }
}

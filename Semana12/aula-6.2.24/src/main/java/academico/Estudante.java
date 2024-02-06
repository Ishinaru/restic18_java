package academico;

import javax.persistence.*;

@Entity
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @ManyToOne
    @JoinColumn(name = "CodCurso")
    private Curso Curso;
    private String Nome;

    public academico.Curso getCurso() {
        return Curso;
    }

    public void setCurso(academico.Curso curso) {
        Curso = curso;
    }

    private String Email;
    private String Matricula;
    public Estudante(){}
    public Estudante(Integer Id, Curso Curso, String Nome, String Email, String Matricula){
        this.Id = Id;
        this.Curso = Curso;
        this.Nome = Nome;
        this.Email = Email;
        this.Matricula = Matricula;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
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
        return "ID: "+Id+"\nNome: "+Nome+"\nEmail: "+Email+"\nMatrícula: "+Matricula+"\nCurso: "+Curso;
    }

    public static void main(String[] args) {
        /* Insert
            Estudante e1 = new Estudante("David","david@gmail.com","201910280");
            Estudante e2 = new Estudante("Ian","iangaymer@gmail.com","201911111");
            Estudante e3 = new Estudante("Degas","degasçado@gmail.com","199010101");

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_academico");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(e1);
            em.persist(e2);
            em.persist(e3);
            em.getTransaction().commit();
            em.close();
            emf.close();
         */

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_academico");
        EntityManager em = emf.createEntityManager();
        Estudante e = em.find(Estudante.class, 2);
        System.out.println(e);
        em.close();
        emf.close();

    }
}

package dto;

public class EstudanteDTO {
    private String Nome;
    private String Matricula;
    private String Email;
    private String Curso;

    public EstudanteDTO() {
    }

    public EstudanteDTO(String nome, String matricula, String email, String Curso) {
        this.Nome = nome;
        this.Matricula = matricula;
        this.Email = email;
        this.Curso = Curso;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String toString(){
        return "Nome: "+Nome+"\nEmail: "+Email+"\nMatrícula: "+Matricula+"\nCurso: "+Curso;
    }
}

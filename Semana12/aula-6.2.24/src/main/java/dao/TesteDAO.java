package dao;

import academico.Curso;
import academico.Estudante;
import dto.EstudanteDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TesteDAO {
    public static void preparaBD(EntityManager em){
        Curso c1 = new Curso(null, "Matemática", 8);
        Curso c2 = new Curso(null, "Computação", 10);
        Curso c3 = new Curso(null, "Geografia", 8);
        Estudante e1 = new Estudante(null, c1, "David", "david@gmail.com", "201910280");
        Estudante e2 = new Estudante(null, c2, "Ian", "iangaymer@gmail.com", "201912345");
        Estudante e3 = new Estudante(null, c3, "Igor", "igorgaymer@gmail.com", "201810000");
        Estudante e4 = new Estudante(null, c1, "Kainê", "kainelinda@gmail.com", "201911111");
        Estudante e5 = new Estudante(null, c3, "Bia", "biazokagaymer@gmail.com", "201910000");
        Estudante e6 = new Estudante(null, c1, "Degas", "degasçado@gmail.com", "199020123");
        em.getTransaction().begin();
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(e1);
        em.persist(e2);
        em.persist(e3);
        em.persist(e4);
        em.persist(e5);
        em.persist(e6);
        em.getTransaction().commit();
    }

    public static void listarEstudantes(EntityManager em){
        String jpql = "select e from Estudante e";
        TypedQuery<Estudante> tq = em.createQuery(jpql, Estudante.class);
        List<Estudante> listaEstudante = tq.getResultList();
        for (Estudante e : listaEstudante)
            System.out.println(e);
    }

    public static void selecionarEstudante(EntityManager em){
        String jpql = "select e from Estudante e where Id = 1";
        TypedQuery<Estudante> tq = em.createQuery(jpql, Estudante.class);
        Estudante estudante = tq.getSingleResult();
        System.out.println(estudante);
    }

    public static void alterarEstudante(EntityManager em){
        String jpql = "select e from Estudante e where Id = 1";
        TypedQuery<Estudante> tq = em.createQuery(jpql, Estudante.class);
        Estudante estudante = tq.getSingleResult();
        estudante.setEmail("david-novo@gmail.com");
        System.out.println("Email alterado com sucesso!!!");
        em.getTransaction().begin();
        em.persist(estudante);
        em.getTransaction().commit();
        System.out.println(estudante);
    }

    public static void selecionarEstudanteNome(EntityManager em){
        String jpql = "select e.Nome from Estudante e";
        TypedQuery<String> tq = em.createQuery(jpql, String.class);
        List<String> listaEstudante = tq.getResultList();
        for (String e: listaEstudante)
            System.out.println(e);
    }

    public static void gerarEstudanteDTO(EntityManager em){
        String jpql = "select new dto.EstudanteDTO(e.Nome, e.Email, e.Matricula, e.Curso.Nome) from Estudante e";
        TypedQuery tq = em.createQuery(jpql, EstudanteDTO.class);
        List<EstudanteDTO>listaEstudanteDTO = tq.getResultList();
        for(EstudanteDTO e: listaEstudanteDTO){
            System.out.println(e);
        }

    }

    public static void mostrarEstudanteCurso(EntityManager em, Integer num){
        String jpql = "select c from Curso where numSemestre = :num";
        TypedQuery<Curso> tq = em.createQuery(jpql, Curso.class);
        tq.setParameter("num", num);

    }
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_academico");
        EntityManager em = emf.createEntityManager();

        //criar e preparar banco

        TesteDAO.preparaBD(em);
        System.out.println("BD Criado");

        //listar todos os estudantes
        listarEstudantes(em);

        //listar estudante com id 1
        System.out.println("-------------------------");
        selecionarEstudante(em);

        //alterar email do estudante com id 1
        System.out.println("-------------------------");
        alterarEstudante(em);

        //selecionar estudantes por campo nome
        System.out.println("-------------------------");
        selecionarEstudanteNome(em);

        //gerar estudantes DTO
        System.out.println("-------------------------");
        gerarEstudanteDTO(em);


        em.close();

    }
}

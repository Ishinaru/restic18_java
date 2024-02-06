package dao;

import academico.Curso;
import academico.Estudante;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        em.close();
    }

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_academico");
        EntityManager em = emf.createEntityManager();
        TesteDAO.preparaBD(em);
        System.out.println("BD Criado");
    }
}

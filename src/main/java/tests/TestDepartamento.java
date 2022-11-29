package tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Departamento;
import java.util.List;

public class TestDepartamento {
    //Recibe el nombre que asignamos en <persistence-unit/> -> persistence.xml
//  @PersistenceContext(unitName = "GestorPersistencia")

    public static void main(String[] args) {
        EntityManager entityManager;
        EntityManagerFactory emf;
        //Forma tradicional:
        emf = Persistence.createEntityManagerFactory("GestorPersistencia");
        entityManager = emf.createEntityManager();

        List<Departamento> resultList = (List<Departamento>) entityManager.createQuery("FROM Departamento").getResultList();
        resultList.forEach(System.out::println);

        System.out.println("En la BD hay %s departamentos".formatted(resultList.size()));
        entityManager.close();
        emf.close();

    }
}

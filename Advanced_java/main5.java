import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class main5 {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");
        Vehi vob1=new Vehi();
        vob1.setVname("Vehi");
         twoWheel ob1=new twoWheel();

         ob1.setVname("hero honda");
         ob1.setSthandle("has a handle");

         fourwheel ob2=new fourwheel();

         ob2.setVname("maruti");
         ob2.setStrwheel("has a string wheel");






        entityManager.getTransaction().begin();
        entityManager.persist(vob1);
        entityManager.persist(ob1);
        entityManager.persist(ob2);





        System.out.println("Saving Employee to Database");

      //  entityManager.persist(eob1);



        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}

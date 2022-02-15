import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main4 {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
        emp4 ob=new emp4();

       Addres2 a1=new Addres2();
       a1.setPincode1(212);
       a1.setCity1("nagp");
       a1.setState1("mahh");
       /////////////////////////
        Addres2 a2=new Addres2();
        a2.setPincode1(212132);
        a2.setCity1("nag3");
        a2.setState1("mah4");


        /////////////
       emp4 eob1=new emp4();
       eob1.setEname("shubham");
       eob1.setE_mail("asd@gmail.com");
       eob1.getAd1().add(a1);
        eob1.getAd1().add(a2);

       /////////////////////////






        System.out.println("Saving Employee to Database");

      //  entityManager.persist(eob1);
        emp4 e1 = entityManager.find(emp4.class, 1L);
        System.out.println(eob1.getAd1());

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}

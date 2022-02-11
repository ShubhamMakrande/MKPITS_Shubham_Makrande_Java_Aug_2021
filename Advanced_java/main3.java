import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main3 {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
        emp3 ob=new emp3();

       Addres1 a1=new Addres1();
       a1.setPincode1(212);
       a1.setCity1("nagp");
       a1.setState1("mahh");
       /////////////////////////
        Addres1 a2=new Addres1();
        a2.setPincode1(212132);
        a2.setCity1("nag3");
        a2.setState1("mah4");


        /////////////
       emp3 eob1=new emp3();
       eob1.setEname("shubham");
       eob1.setE_mail("asd@gmail.com");
        eob1.setOffice_ad(a1);
       eob1.setHome_ad(a2);

       /////////////////////////






        System.out.println("Saving Employee to Database");

        entityManager.persist(eob1);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}

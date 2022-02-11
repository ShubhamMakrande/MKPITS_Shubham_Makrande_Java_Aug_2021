import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class main2 {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
        emp2 ob=new emp2();

       Addres a1=new Addres();
       a1.setPincode1(212132);
       a1.setCity1("nag");
       a1.setState1("mah");
       emp2 eob1=new emp2();
       eob1.setEname("shubham");
       eob1.setE_mail("asd@gmail.com");
       eob1.setAob(a1);
       /////////////////////////
        Addres a2=new Addres();
        a2.setPincode1(2121322);
        a2.setCity1("nag2");
        a2.setState1("mah2");
        emp2 eob2=new emp2();
        eob2.setEname("shubham2");
        eob2.setE_mail("asd2@gmail.com");
        eob2.setAob(a2);

        System.out.println("Saving Employee to Database");

        entityManager.persist(eob1);
        entityManager.persist(eob2);
        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}

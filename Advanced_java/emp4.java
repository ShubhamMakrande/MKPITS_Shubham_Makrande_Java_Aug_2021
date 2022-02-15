import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class emp4 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String ename;
    private String e_mail;
    @ElementCollection
           @JoinTable(name="empaddress",joinColumns = @JoinColumn(name="emp_id"))
     Set<Addres2> ad1=new HashSet<Addres2>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public Set<Addres2> getAd1() {
        return ad1;
    }



    public void setAd1(Set<Addres2> ad1) {
        this.ad1 = ad1;

    }

    @Override
    public String toString() {
        return "emp3{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", ad1=" + ad1 +
                '}';
    }
}

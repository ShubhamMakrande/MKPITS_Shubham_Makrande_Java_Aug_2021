import javax.persistence.*;

@Entity
public class emp3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String ename;
    private String e_mail;
   @Embedded
   @AttributeOverrides(value = {
           @AttributeOverride(name = "pincode1", column = @Column(name = "home_pin")),
           @AttributeOverride(name = "city1", column = @Column(name = "home_city")),
           @AttributeOverride(name = "state1", column = @Column(name = "home_satate"))

   })
   private Addres1 home_ad;
   @Embedded
  private Addres1 office_ad;

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

    public Addres1 getHome_ad() {
        return home_ad;
    }

    public void setHome_ad(Addres1 home_ad) {
        this.home_ad = home_ad;
    }

    public Addres1 getOffice_ad() {
        return office_ad;
    }

    public void setOffice_ad(Addres1 office_ad) {
        this.office_ad = office_ad;
    }
}

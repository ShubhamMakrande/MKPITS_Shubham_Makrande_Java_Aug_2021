import javax.persistence.*;
import java.util.Date;

@Entity
public class emp2 {

    private String ename;
    private String e_mail;
   @EmbeddedId
    private Addres aob;


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

    public Addres getAob() {
        return aob;
    }

    public void setAob(Addres aob) {
        this.aob = aob;
    }
}

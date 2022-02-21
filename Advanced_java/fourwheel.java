import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "fourw")
public class fourwheel extends Vehi{
    private String strwheel;

    public String getStrwheel() {
        return strwheel;
    }

    public void setStrwheel(String strwheel) {
        this.strwheel = strwheel;
    }
}

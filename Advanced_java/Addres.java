import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@Embeddable
class Addres implements Serializable {
    private static final long serialVersionUID = -776913048247346597L;
    private int pincode1;
    private String city1;
    private String state1;

    public int getPincode1() {
        return pincode1;
    }

    public void setPincode1(int pincode1) {
        this.pincode1 = pincode1;
    }

    public String getCity1() {
        return city1;
    }

    public void setCity1(String city1) {
        this.city1 = city1;
    }

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }
}

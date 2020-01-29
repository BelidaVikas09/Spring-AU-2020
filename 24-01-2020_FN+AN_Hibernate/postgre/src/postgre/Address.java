package postgre;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private int pin;
    private String Street;
    private String city;
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    public String getStreet() {
        return Street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        Street = street;
    }
}

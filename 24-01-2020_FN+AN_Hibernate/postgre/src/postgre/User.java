package postgre;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="USER_DETAILS")
public class User{
    @Id
    @Column(name="ID")
    private int id;
    private String name;
    private String email;
    private int phone;
    @OneToMany
    @JoinTable(name="user_products", joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns =@JoinColumn(name="p_id"))
    private List<Electronics>e=new ArrayList<Electronics>();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "city", column = @Column(name = "HOME_CITY")),
            @AttributeOverride(name = "street", column = @Column(name = "Street_addr"))
    })
    private Address address;
    public void setAddress(Address add){
        this.address=add;
    }
    public Address getAddress(){
        return address;
    }
    @Override
    public String toString(){
        return "Username:"+this.getName()+"\n Address:"+this.getAddress().getPin();
    }
    public void setE(Electronics e) {
        this.e.add(e);
    }
    public List<Electronics> getE() {
        return e;
    }
}
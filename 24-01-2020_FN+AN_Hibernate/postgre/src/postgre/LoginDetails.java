package postgre;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="LOGIN_DETAILS")
public class LoginDetails{
   private String user_name;
   private String password;
   @Id
   private int usr_id;
    public int getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(int usr_id) {
        this.usr_id = usr_id;
    }

    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString(){
        return "LoginDetails:\n"+" id: "+this.getUsr_id()+" \n passwd:"+this.getPassword()+"\n";
    }
}

package demosplitwise.demo.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="splitwiseusers")
public class User implements Serializable{
    private static final long serialVersionUID = -3009157732242249406L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Userid", unique = true)
    private long userid;

    @Column(name="username",unique = true)
    private String name;

    @Column(name="emailid")
    private String emailID;

    @Column(name="phone_number")
    private String phone_number;

    @Column(name="age")
    private int age;

    @Column(name="debt")
    private int debt;

    protected User(){}

    public User(String name,String emailid,String phone_number,int age,int debt){
        this.name=name;
        this.emailID=emailid;
        this.phone_number=phone_number;
        this.age=age;
        this.debt=debt;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    @Override
    public String toString(){
        return String.format("User[userid=%d,name=%s, emailid=%s, phone_number=%s, age=%d, debt=%d]",userid,name,
                emailID,phone_number,age,debt);
    }
}

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
    private long userID;

    @Column(name="username",unique = true)
    private String name;

    @Column(name="emailid")
    private String emailID;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="age")
    private int age;

    @Column(name="debt")
    private int debt;

    protected User(){}

    public User(String name,String emailid,String phone_number,int age,int debt){
        this.name=name;
        this.emailID=emailid;
        this.phoneNumber=phone_number;
        this.age=age;
        this.debt=debt;
    }

    public long getUserid() {
        return userID;
    }

    public void setUserid(long userid) {
        this.userID = userid;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        return String.format("User[userid=%d,name=%s, emailid=%s, phone_number=%s, age=%d, debt=%d]",userID,name,
                emailID,phoneNumber,age,debt);
    }
}

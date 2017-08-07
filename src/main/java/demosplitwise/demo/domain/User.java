package demosplitwise.demo.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="splitwiseusers")
public class User implements Serializable{
    private static final long serialVersionUID = -3009157732242249406L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Userid")
    private long userid;

    @Column(name="name")
    String name;

    @Column(name="emailid")
    String emailID;

    @Column(name="phone_number")
    long phone_number;

    @Column(name="age")
    int age;

    @Column(name="debt")
    int debt;

    protected User(){}

    public User(String name,String emailid,long phone_number,int age,int debt){
        this.name=name;
        this.emailID=emailid;
        this.phone_number=phone_number;
        this.age=age;
        this.debt=debt;
    }

    @Override
    public String toString(){
        return String.format("User[userid=%d,name=%s, emailid=%s, phone_number=%d, age=%d, debt=%d]",userid,name,
                emailID,phone_number,age,debt);
    }
}

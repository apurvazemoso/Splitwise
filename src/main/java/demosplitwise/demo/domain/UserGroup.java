package demosplitwise.demo.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zemoso on 9/8/17.
 */
@Entity
@Table(name = "usergroups")
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name= "group_id")
    private long gid;

    @Column(name = "user_id")
    private long uid;

    @Column(name = "date_of_joining")
    private Date doj;

    @Column(name = "group_debt")
    private double debt;

    protected UserGroup(){

    }

    public UserGroup(long gid, long uid, Date doj, double debt) {
        this.gid = gid;
        this.uid = uid;
        this.doj = doj;
        this.debt = debt;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public long getGid() {

        return gid;
    }

    public void setGid(long gid) {
        this.gid = gid;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "gid=" + gid +
                ", uid=" + uid +
                ", doj=" + doj +
                ", debt=" + debt +
                '}';
    }
}
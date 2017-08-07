package demosplitwise.demo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="transactions")
public class Transactions implements Serializable{
    public static final long serialVersionUID = -3009157732242239406L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transId")
    private long transID;

    @Column(name = "Description")
    String description;

    @Column(name = "Date_of_Trans")
    String dot;

    @Column(name = "Transaction_Amount")
    int amount;

    @Column(name="Mode_of_Payment")
    String mop;

    protected Transactions(){}

    public Transactions(String description,String dot, int amount, String mop){

        this.description = description;
        this.dot = dot;
        this.amount = amount;
        this.mop = mop;
    }

    @Override
    public String toString(){
        return String.format("Transactions[transid=%d,description=%s, Date of Transaction=%s, " +
                "Amount=%d, Mode of payment=%s]",transID,description,dot,amount,mop );
    }

}

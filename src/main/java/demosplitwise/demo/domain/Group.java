package demosplitwise.demo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="group")
public class Group implements Serializable {
    public static final long serialVersionUID = -3109157732242239406L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "group_id")
    private long groupId;

    @Column(name = "group_name")
    String groupName;

    @Column(name = "Total_Members")
    int totalMembers;

    @Column(name = "Created_by")
    String createdBy;

    @Column(name = "date_of_creation")
    String dateOfCreation;

    protected Group() {
    }

    public Group(String groupName, String createdBy, String dateOfCreation) {
        this.groupName = groupName;
        this.createdBy = createdBy;
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public String toString() {
        return String.format("group[groupid=%d,createdBy=%s, Date of Creation=%s]",
                groupId, createdBy, dateOfCreation);
    }

}
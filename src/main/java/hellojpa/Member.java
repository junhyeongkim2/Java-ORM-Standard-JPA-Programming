package hellojpa;

import javax.persistence.*;

@Entity
@Table(name="MBR")
public class Member {

    @Id
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}

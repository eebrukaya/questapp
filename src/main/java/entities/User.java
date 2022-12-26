package entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Temporal(TemporalType.DATE)
    @Column(name = "password_change_date")
    private Date passwordChangeDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_password_reset_date")
    private Date lastPasswordResetDate;

    @Column(name = "active")
    private Boolean active;

    public User() {
    }

    public User(Long id) {
        this.id=id;
    }
}

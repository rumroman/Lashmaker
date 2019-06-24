package app.auth;

import javax.persistence.*;

@Entity
@Table(name="auth_user_group")
public class AuthGroup {
    @Id
    @Column(name="auth_user_group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String username;
    @Column(name = "auth_group")
    private String authGroup;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthGroup() {
        return authGroup;
    }

    public void setAuthGroup(String authGroup) {
        this.authGroup = authGroup;
    }
}

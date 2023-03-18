package security.oauth.domain.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Users {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

    public Users update(String name) {
        this.name = name;
        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }
}

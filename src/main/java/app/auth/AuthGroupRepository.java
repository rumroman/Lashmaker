package app.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthGroupRepository extends JpaRepository<AuthGroup,Integer> {
    List<AuthGroup> findByUsername(String username);
}

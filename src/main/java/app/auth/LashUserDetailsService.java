package app.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LashUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public LashUserDetailsService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
//        User user = new User();
//        User user2 = new User();
//        user.setPassword("password");
//        user2.setPassword("password");
//        user.setUsername("client");
//        user2.setUsername("master");
//        userRepository.save(user);
//        userRepository.save(user2);

    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUsername(username);
        if(null == user){
            throw new UsernameNotFoundException("cannot find username: " + username);
        }

        return new LashUserPrincipal(user);
    }


}

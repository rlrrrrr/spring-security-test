package security.demo.infrastructure;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import security.demo.service.GeneratePasswordInterface;

@Service
public class GeneratePassword implements PasswordEncoder, GeneratePasswordInterface {
    @Override
    public String encode(CharSequence rawPassword) {
        return null;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return false;
    }
}

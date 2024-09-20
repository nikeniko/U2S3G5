package nicolas.U2S3G5.services;

import nicolas.U2S3G5.entity.User;
import nicolas.U2S3G5.exceptions.NotFoundException;
import nicolas.U2S3G5.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByEmail(String email) {
        User found = this.userRepository.findByEmail(email)
                .orElseThrow(() -> new NotFoundException("User not found"));
        return found;
    }
}
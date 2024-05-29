package awakeTech.Servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.jpa.repository.JpaRepository;

import awakeTech.Spring.modelos.user;
import awakeTech.Repositorio.userRepository;

@Service
public class userServicio{
    @Autowired
    private userRepository userRepository;

    public user updateUser(Long id, user userDetails) {
        user user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        user.setEmail(userDetails.getEmail());
        user.setRole(userDetails.getRole());
        return userRepository.save(user);
    }
    
    public Optional<user> getUserById(Long id) {
        return userRepository.findById(id);
    }
    
}
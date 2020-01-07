package arkham.knight.fastfood.services;

import arkham.knight.fastfood.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    @Autowired
    private UserRepository userRepository;
}

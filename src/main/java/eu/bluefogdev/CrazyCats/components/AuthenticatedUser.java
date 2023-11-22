package eu.bluefogdev.CrazyCats.components;

import eu.bluefogdev.CrazyCats.data.repositories.UserRepository;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuthenticatedUser {

    private final UserRepository userRepo;

    public AuthenticatedUser(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    private Optional<Authentication> getAuthentication() {
        SecurityContext context = SecurityContextHolder.getContext();
        return Optional.ofNullable(context.getAuthentication())
                       .filter(authentication -> !(authentication instanceof AnonymousAuthenticationToken));
    }
}

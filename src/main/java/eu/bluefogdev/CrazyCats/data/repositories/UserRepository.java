package eu.bluefogdev.CrazyCats.data.repositories;

import eu.bluefogdev.CrazyCats.data.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Player, String> {

    Player findUser(String username);
}

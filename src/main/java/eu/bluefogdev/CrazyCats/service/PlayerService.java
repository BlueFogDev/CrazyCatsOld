package eu.bluefogdev.CrazyCats.service;

import eu.bluefogdev.CrazyCats.data.entities.Player;
import eu.bluefogdev.CrazyCats.data.enums.Ability;
import eu.bluefogdev.CrazyCats.data.enums.Race;
import eu.bluefogdev.CrazyCats.data.enums.Skill;
import eu.bluefogdev.CrazyCats.data.enums.Weapon;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final EntityManager entityManager;

    @Autowired
    public PlayerService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public Player createPlayer(
            String name, String login, String email, String password,
            Race race, Weapon weapon,
            Ability ability1, Ability ability2,
            Skill skill1, Skill skill2
                              ) {
        // Erstelle einene Spieler
        Player player = Player.builder()
                              .name(name)
                              .login(login)
                              .email(email)
                              .password(PasswordService.hashPassword(password))
                              .build();

        // Definoiere die Attribute
        List<Skill> playerSkills = List.of(skill1, skill2);
        List<Double> playerSkillLevel = List.of(skill1.getLevel(), skill2.getLevel());
        List<Ability> playerAbilities = List.of(ability1, ability2);
        List<Double> playerAbilityPower = List.of(ability1.getPower(), ability2.getPower());

        // Setze Attribute für den Spieler
        player.setRace(race);
        player.setSkills(playerSkills);
        player.setAbilities(playerAbilities);
        player.setWeapon(weapon);

        // Setze Werte für die Attribute
        player.setSkillLevel(playerSkillLevel);
        player.setAbilitiyPower(playerAbilityPower);
        player.setWeaponDamage(weapon.getDamage());

        // Speichere den Spieler mit dem EntityManager
        entityManager.getTransaction().begin(); // Transaktion beginnen
        entityManager.persist(player); // Speichert den Spieler in der Datenbank
        entityManager.getTransaction().commit(); // Transaktion commiten (commit() oder rollback() im Falle eines Fehlers)

        // Gib den Spieler zurück
        return player;
    }
}
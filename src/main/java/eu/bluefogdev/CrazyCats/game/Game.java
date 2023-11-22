package eu.bluefogdev.CrazyCats.game;

import eu.bluefogdev.CrazyCats.data.entities.Player;
import eu.bluefogdev.CrazyCats.data.enums.Ability;
import eu.bluefogdev.CrazyCats.data.enums.Race;
import eu.bluefogdev.CrazyCats.data.enums.Skill;
import eu.bluefogdev.CrazyCats.data.enums.Weapon;
import eu.bluefogdev.CrazyCats.service.PlayerService;
import jakarta.persistence.EntityManager;

public class Game {

    public Game(EntityManager entityManager) {
        createPlayerOne(entityManager);
    }

    public void createPlayerOne(EntityManager entityManager) {
        // Hier erstellen wir einen PlayerService (angenommen, es wurde injiziert oder instanziiert)
        PlayerService playerService = new PlayerService(entityManager); // Hier müsstest du die Instanzierung anpassen

        // Erstellen eines Spielers mit dem PlayerService
        Player player1 = playerService.createPlayer(
                "Sandro Simperl",
                "sasi",
                "sandrosimperl@gmx.de",
                "791300",
                Race.DEMON,
                Weapon.THROWING_KNIVES,
                Ability.FIREBALL,
                Ability.SUMMON_ALLY,
                Skill.MAGIC,
                Skill.CLIMBING
                                                   );

        // Spieler anzeigen
        System.out.println(player1);
    }
}
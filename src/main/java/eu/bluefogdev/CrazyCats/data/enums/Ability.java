package eu.bluefogdev.CrazyCats.data.enums;

import lombok.Getter;

@Getter
public enum Ability {
    HEAL("Heilung", 20.0, "Fähigkeit zur Heilung"),
    FIREBALL("Feuerball", 30.0, "Wirft Feuerbälle"),
    INVISIBILITY("Unsichtbarkeit", 0.0, "Macht den Spieler unsichtbar"),
    TELEPORT("Teleportation", 0.0, "Fähigkeit zum Teleportieren"),
    SHIELD("Schild", 15.0, "Erschafft einen Schutzschild"),
    ICE_BLAST("Eiszauber", 25.0, "Lässt Eiszauber explodieren"),
    LIGHTNING_STRIKE("Blitzschlag", 35.0, "Ruft einen Blitz herbei"),
    TIME_WARP("Zeitkrümmung", 0.0, "Manipuliert die Zeit"),
    STRENGTH_BOOST("Stärkungszauber", 10.0, "Erhöht die Stärke"),
    SUMMON_ALLY("Verbündeten beschwören", 0.0, "Beschwört einen mächtigen Verbündeten");

    private final String name;
    private final Double power;
    private final String description;

    Ability(String name, Double power, String description) {
        this.name = name;
        this.power = power;
        this.description = description;
    }
}
package eu.bluefogdev.CrazyCats.data.enums;

import lombok.Getter;

@Getter
public enum Skill {
    SWIMMING("Schwimmen", 1.0, "Grundlegende Schwimmfähigkeiten"),
    CLIMBING("Klettern", 1.0, "Fähigkeit zum Klettern"),
    STEALTH("Stealth", 1.0, "Fähigkeit, unbemerkt zu bleiben"),
    ARCHERY("Bogenschießen", 1.0, "Die Kunst des Bogenschießens"),
    MAGIC("Zauberkunst", 1.0, "Mächtige Zauberfertigkeiten"),
    ACROBATICS("Akrobatik", 1.0, "Körperliche Beweglichkeit"),
    LOCKPICKING("Schlossknacken", 1.0, "Die Kunst des Schlossknackens"),
    ALCHEMY("Alchemie", 1.0, "Herstellung von Tränken und Elixieren"),
    RIDING("Reiten", 1.0, "Fähigkeit, Tiere zu reiten"),
    SURVIVAL("Überleben", 1.0, "Überlebensfähigkeiten in der Wildnis");

    private final String name;
    private final Double level;
    private final String description;

    Skill(String name, Double level, String description) {
        this.name = name;
        this.level = level;
        this.description = description;
    }
}
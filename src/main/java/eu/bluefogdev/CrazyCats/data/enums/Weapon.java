package eu.bluefogdev.CrazyCats.data.enums;

import lombok.Getter;

@Getter
public enum Weapon {
    SWORD("Schwert", 10.0, "Ein scharfes Schwert"),
    AXE("Axt", 15.0, "Eine mächtige Axt"),
    BOW("Bogen", 8.0, "Ein präziser Bogen"),
    DAGGER("Dolch", 7.0, "Ein kleiner, aber schneller Dolch"),
    HAMMER("Hammer", 20.0, "Ein großer Hammer für schwere Schläge"),
    STAFF("Stab", 12.0, "Ein magischer Stab"),
    CROSSBOW("Armbrust", 13.0, "Eine präzise Armbrust"),
    SPEAR("Speer", 14.0, "Ein langer Speer für Stiche"),
    MACE("Morgenstern", 18.0, "Ein mächtiger Morgenstern"),
    THROWING_KNIVES("Wurfmesser", 6.0, "Scharfe Wurfmesser");

    private final String name;
    private final Double damage;
    private final String description;

    Weapon(String name, Double damage, String description) {
        this.name = name;
        this.damage = damage;
        this.description = description;
    }
}
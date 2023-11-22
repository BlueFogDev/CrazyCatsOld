package eu.bluefogdev.CrazyCats.data.enums;

import lombok.Getter;

@Getter
public enum Race {
    HUMAN("Mensch", "Vielfältige Menschen", 10.0),
    ELF("Elf", "Anmutige Elfen mit spitzer Ohren", 8.0),
    DWARF("Zwerg", "Stämmige Zwerge mit großer Stärke", 12.0),
    ORC("Ork", "Mächtige und kriegerische Orks", 15.0),
    HALFLING("Halbling", "Kleine, geschickte Halblinge", 7.0),
    UNDEAD("Untoter", "Einst lebendig, nun untot", 5.0),
    DEMON("Dämon", "Mächtige dämonische Wesen", 18.0),
    DRAGONBORN("Drachenblütiger", "Mit Drachenblut gesegnete Wesen", 14.0),
    GNOME("Gnom", "Kleine, technisch versierte Gnome", 9.0),
    TROLL("Troll", "Große und robuste Trolle", 20.0);

    private final String name;
    private final String description;
    private final Double strength;

    Race(String name, String description, Double strength) {
        this.name = name;
        this.description = description;
        this.strength = strength;
    }
}
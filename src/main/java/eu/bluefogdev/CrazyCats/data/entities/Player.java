package eu.bluefogdev.CrazyCats.data.entities;

import eu.bluefogdev.CrazyCats.data.enums.Ability;
import eu.bluefogdev.CrazyCats.data.enums.Race;
import eu.bluefogdev.CrazyCats.data.enums.Skill;
import eu.bluefogdev.CrazyCats.data.enums.Weapon;
import eu.bluefogdev.CrazyCats.service.PasswordService;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Builder
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Table()
public class Player {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2")
    @Column(nullable = false, length = 128)
    private String playerId;

    private String name;
    private String username;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private List<Skill> skills;
    @ElementCollection
    private List<Double> skillLevel;

    @Enumerated(EnumType.STRING)
    private List<Ability> abilities;
    @ElementCollection
    private List<Double> abilitiyPower;

    @Enumerated(EnumType.STRING)
    private Weapon weapon;
    private Double weaponDamage;

    @Enumerated(EnumType.STRING)
    private Race race;

    public void setPassword(String password) {
        this.password = PasswordService.hashPassword(password);
    }

    public boolean checkPassword(String password) {
        return PasswordService.checkPassword(password, this.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayerId(), getName(), getUsername(), getEmail(), getPassword(), getSkills(), getAbilities(), getRace(), getWeapon());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        return Objects.equals(getPlayerId(), player.getPlayerId()) &&
               Objects.equals(getName(), player.getName()) &&
               Objects.equals(getUsername(), player.getUsername()) &&
               Objects.equals(getEmail(), player.getEmail()) &&
               Objects.equals(getPassword(), player.getPassword()) &&
               Objects.equals(getSkills(), player.getSkills()) &&
               Objects.equals(getAbilities(), player.getAbilities()) &&
               Objects.equals(getRace(), player.getRace()) &&
               Objects.equals(getWeapon(), player.getWeapon());
    }

    @Override
    public String toString() {
        return username + "\n\t" + race + "\n\t(" + skills + ")" + "\n\t(" + weapon + ")" + "\n\t(" + abilities + ")";
    }
}
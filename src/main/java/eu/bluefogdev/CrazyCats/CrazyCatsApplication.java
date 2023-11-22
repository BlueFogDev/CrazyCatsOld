package eu.bluefogdev.CrazyCats;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"eu.bluefogdev.CrazyCats.entities"})
@Theme(value = "crazycats", variant = "dark")
public class CrazyCatsApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(CrazyCatsApplication.class, args);
    }
}
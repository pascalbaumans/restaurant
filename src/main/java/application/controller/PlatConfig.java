package application.controller;

import application.PlatRepository;
import application.entity.Plat;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlatConfig {

    @Bean
    CommandLineRunner commandLineRunner(PlatRepository platRepository)
    {
        return args -> {
            Plat plat = new Plat(10,"Plat 1");
            Plat plat2 = new Plat(133,"Plat 2");

        };
    };

    };
}

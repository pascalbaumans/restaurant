package application.controller;

import application.entity.Plat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/plat")
public class PlatController {

    private final PlatService platService;

    // @Autowired // ? not needed ?
    public PlatController(PlatService platService) {
        this.platService = platService;
    }

    @GetMapping
    public List<Plat> getPlats()  {

        return platService.getPlats();

    }


}

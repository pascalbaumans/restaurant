package application.controller;

import application.entity.Plat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
@Data
@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/plat")
public class  PlatController
{

    PlatService platService;

    @GetMapping
    public List<Plat> getPlats() {
        return platService.getPlats();

    }


}

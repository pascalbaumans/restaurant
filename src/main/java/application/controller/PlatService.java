package application.controller;

import application.PlatRepository;
import application.entity.Plat;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Service
public class PlatService
{

    PlatRepository platrepository;

    public List<Plat> getPlats() {

        return platrepository.findAll();

       // return List.of(new Plat(1L, new BigDecimal("15.5"), "Steak au poivre"),
       //         new Plat(2L, new BigDecimal("18.5"), "Saumon sauce Dugléré"),
       //         new Plat(3L, new BigDecimal("22.55"), "Entrecote Bordelaise"),
       //         new Plat(3L, new BigDecimal("12.55"), "Boulettes Liegeoise")
       // );

    }


}

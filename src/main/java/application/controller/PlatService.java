package application.controller;

import application.entity.Plat;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class PlatService {

    public List<Plat> getPlats() {
        return List.of(new Plat(1L, new BigDecimal("15.5"), "Steak au poivre", LocalDate.of(2000, 01, 10)),
                new Plat(2L, new BigDecimal("18.5"), "Saumon sauce Dugléré", LocalDate.of(2005, 01, 18)),
                new Plat(3L, new BigDecimal("22.55"), "Entrecote Bordelaise", LocalDate.of(2006, 01, 20)),
                new Plat(3L, new BigDecimal("12.55"), "Boulettes Liegeoise", LocalDate.of(2020, 01, 01))
        );

    }
}

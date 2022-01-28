package application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plat {
    private Long id;
    private BigDecimal price;
    private String name;
    private LocalDate dateinvention;
    //private List<Alergen> alergenList;

    public Plat(BigDecimal price, String name, LocalDate dateinvention) {
        this.price = price;
        this.name = name;
        this.dateinvention = dateinvention;
    }


}

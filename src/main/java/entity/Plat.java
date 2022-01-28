package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plat {
    private Long id;
    private BigDecimal price;
    private String name;
    //private List<Alergen> alergenList;

    public Plat(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

}

package application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Plat {


    @Id
    @SequenceGenerator(name = "plat_sequence", sequenceName = "plat_sequence", allocationSize = 1)
    @GeneratedValue(generator = "plat_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    private BigDecimal price;
    private String name;
    //private List<Alergen> alergenList;

    public Plat(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

}

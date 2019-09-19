package l.daloia.anoki.azienda.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;


import javax.validation.constraints.NotNull;

@Entity
//@DiscriminatorValue("seller")
public class Seller extends Worker{

    @Column(name="SALES_AMOUNT")
    @Getter @Setter
    private Double salesAmount;

}

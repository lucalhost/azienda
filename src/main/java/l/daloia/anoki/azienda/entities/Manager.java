package l.daloia.anoki.azienda.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
//@DiscriminatorValue("managers")
public class Manager extends Worker{

    @OneToMany(mappedBy="parentManager")
    @Getter @Setter
    private List<Worker> worker;

    @ManyToOne
    @Getter @Setter
    private Manager parentManager;
}

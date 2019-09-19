package l.daloia.anoki.azienda.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
//@DiscriminatorValue("technicians")
public class Technician extends Worker{

    public Technician(@NotEmpty @NotBlank @NotNull String id, String name, double salary, String role) {
        super(id, name, salary, role);
    }

    public Technician() {
    }
}

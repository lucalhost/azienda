package l.daloia.anoki.azienda.daos;

import l.daloia.anoki.azienda.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IWorkerDao extends JpaRepository<Worker, String>{

    Worker getSalaryById(String id);





}

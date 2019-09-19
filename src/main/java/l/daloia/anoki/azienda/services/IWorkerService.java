package l.daloia.anoki.azienda.services;

import l.daloia.anoki.azienda.entities.Worker;

import java.util.Optional;

public interface IWorkerService {

    //creazione di un nuovo lavoratore
    Worker saveWorker(Worker worker);

    //modifica
    //Worker updateWorker(Worker worker);

    //eliminazione
    String deleteWorker(String id);

    //calcolo della retribuzione in base al lavoratore indicato
    Worker getSalaryById(String id);

    //fornisce il lavoratore
    Optional<Worker> getWorker(String id);
}

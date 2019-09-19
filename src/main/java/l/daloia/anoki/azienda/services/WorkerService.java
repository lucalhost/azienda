package l.daloia.anoki.azienda.services;

import l.daloia.anoki.azienda.daos.IWorkerDao;
import l.daloia.anoki.azienda.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;


@Service @Transactional
public class WorkerService implements  IWorkerService{

    @Autowired
    IWorkerDao workerDao;

    @Override
    public Worker saveWorker(Worker worker) {
        return workerDao.save(worker);
    }

    /*@Override
    public Worker updateWorker(Worker worker) {
        return workerDao.merge(worker);
    }*/

    @Override
    public String deleteWorker(String id) {
        workerDao.deleteById(id);
        return "the worker has been deleted";
    }

    @Override
    public Worker getSalaryById(String id) {
        return workerDao.getSalaryById(id);
    }

    @Override
    public Optional<Worker> getWorker(String id) {
        return workerDao.findById(id);
    }
}


//  public int manageDipendenti(Dipendente dipendente){
//		if(dipendente.getAlDipendenti() != null ){
//			numero += dipendente.getAlDipendenti().size();
//
//			for(Dipendente d : dipendente.getAlDipendenti()){
//
//					manageDipendenti(d);
//
//			}
//		}
//		return numero;
//	}
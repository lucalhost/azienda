package l.daloia.anoki.azienda;

import l.daloia.anoki.azienda.daos.IWorkerDao;
import l.daloia.anoki.azienda.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AziendaApplication implements CommandLineRunner {

	@Autowired
	IWorkerDao workerDao;

	public static void main(String[] args) {
		SpringApplication.run(AziendaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		workerDao.save(new Worker("abcd1","Ferdinando Brambilla", 1400.6 , "tecnico"));


	}
}

//String id, String name, Double salary, String role
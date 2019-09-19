package l.daloia.anoki.azienda.controllers;

import l.daloia.anoki.azienda.entities.Worker;
import l.daloia.anoki.azienda.services.IWorkerService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @AllArgsConstructor
    public class JsonResponseBody{
        @Getter @Setter
        private int server;
        @Getter @Setter
        private Object response;
    }

    private static final Logger log = LoggerFactory.getLogger(RestController.class);

    @Autowired
    IWorkerService workerService;

    @RequestMapping("/worker/salary/{id}")
    public ResponseEntity<JsonResponseBody> getSalaryById(HttpServletRequest request, @PathVariable(name = "id") String id) {

        return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), workerService.getSalaryById(id)));
    }

    @RequestMapping(value = "/worker/new", method=POST)
    public ResponseEntity<JsonResponseBody> newWorker(HttpServletRequest request, @Valid Worker worker, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new JsonResponseBody(HttpStatus.FORBIDDEN.value(), "Error! Invalid format of data."));
        }
        return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), workerService.saveWorker(worker)));
    }

    /*
    @RequestMapping(value = "/worker/update", method=POST)
    public ResponseEntity<JsonResponseBody> updateWorker(HttpServletRequest request, @Valid Worker worker, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new JsonResponseBody(HttpStatus.FORBIDDEN.value(), "Error! Invalid format of data."));
        }
        return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), workerService.updateWorker(worker)));
    }*/

    @RequestMapping("/worker/delete/{id}")
    public ResponseEntity<JsonResponseBody> deleteWorkerById(HttpServletRequest request, @PathVariable(name = "id") String id) {

        return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), workerService.deleteWorker(id)));
    }

    @RequestMapping("/worker/get/{id}")
    public ResponseEntity<JsonResponseBody> getWorkerById(HttpServletRequest request, @PathVariable(name = "id") String id) {

        return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), workerService.getWorker(id)));
    }

}

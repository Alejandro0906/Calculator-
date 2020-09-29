package io.quind.Calculator_Week1.service;

import io.quind.Calculator_Week1.dao.PersonDao;
import io.quind.Calculator_Week1.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin("*")
    @RestController
    @RequestMapping("/consoles")
    public class PersonController {

    // se define la interfaz
    // se instancia el controlador
        @Autowired
        private PersonDao consoleDAO;

        public PersonController() {
        }

        public PersonController(PersonDao employerDAO) {
            this.consoleDAO = employerDAO;
        }

        @GetMapping
        public ResponseEntity<List<Person>> getConsola () {
            List<Person> consoles = consoleDAO.findAll();
            return ResponseEntity.ok(consoles);
        }

        @RequestMapping(value = "{consoleid}")
        public ResponseEntity<Person> getConsolaById (@PathVariable("consoleid") Long consoleid){
            Optional<Person> optionalConsole = consoleDAO.findById(consoleid);
            if (optionalConsole.isPresent()) {
                return ResponseEntity.ok(optionalConsole.get());
            } else {
                return ResponseEntity.noContent().build();
            }
        }

        @PostMapping
        public ResponseEntity<Person> createConsole (@RequestBody Person console){
            Person newConsole = consoleDAO.save(console);
            return ResponseEntity.ok(newConsole);
        }

        @PutMapping
        public ResponseEntity<Person> updateConsole(@RequestBody Person console){
            Optional<Person> optionalConsole = consoleDAO.findById(console.getId());
            if(optionalConsole.isPresent()) {
                Person updateConsole = optionalConsole.get();
                updateConsole.setName(console.getName());
                consoleDAO.save(updateConsole);
                return ResponseEntity.ok(updateConsole);
            }
            else{
                return ResponseEntity.notFound().build();
            }
        }

        @DeleteMapping(value = "{consoleid}")
        public ResponseEntity<Void> deleteConsole (@PathVariable("consoleid") Long consoleid){
            consoleDAO.deleteById(consoleid);
            return ResponseEntity.ok(null);
        }
    }













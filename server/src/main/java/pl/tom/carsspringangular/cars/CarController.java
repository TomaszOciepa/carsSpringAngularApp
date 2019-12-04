package pl.tom.carsspringangular.cars;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class CarController {

    private CarRepo repository;

    public CarController(CarRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/cars")
    @CrossOrigin(origins = "http://localhost:4200")
    public Iterable<Car> getAll() {
        return repository.findAll();
    }

    @GetMapping("/car")
    @CrossOrigin(origins = "http://localhost:4200")
    public Optional<Car> getCar(@RequestParam(value = "id", required = false) Long id ){
        return repository.findById(id);
    }
}

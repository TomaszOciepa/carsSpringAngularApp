package pl.tom.carsspringangular.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private CarRepo carRepo;

    @Autowired
    public Start(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample(){
        Car car1 = new Car("Mercedes", "CLS");
        carRepo.save(car1);

        Car car2 = new Car("BMW", "X5");
        carRepo.save(car2);

        Car car3 = new Car("SUBARU", "IMPREZA");
        carRepo.save(car3);

        Car car4 = new Car("Mercedes", "GLS");
        carRepo.save(car4);

        Car car5 = new Car("Porshe", "911");
        carRepo.save(car5);


    }
}

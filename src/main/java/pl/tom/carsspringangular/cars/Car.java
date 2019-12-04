package pl.tom.carsspringangular.cars;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Mark;
    private String Model;

    public Car() {
    }

    public Car(String mark, String model) {
        Mark = mark;
        Model = model;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + Id +
                ", Mark='" + Mark + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}

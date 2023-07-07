package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name = "model")
    String model;
    @Column(name = "series")
    int series;

/*    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToOne(mappedBy = "userCar", cascade = {CascadeType.ALL*//*PERSIST, CascadeType.REFRESH*//*})
    private User user;*/

    public Car(){}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';

    }
}

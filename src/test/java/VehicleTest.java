//package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = new Car("BMW","X5", 2010);
        motorcycle = new Motorcycle("Yamaha", "R1", 2017);
    }

    /*Проверить, что экземпляр объекта Car также является
    экземпляром транспортного средства (используя оператор instanceof).
    */

    @Test
    void carIsVehicle(){
       assertThat(car instanceof Vehicle);
    }

    /*Проверить, что объект Car создается с 4-мя колесами.*/

    @Test
    void carHaveFourWheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /*Проверить, что объект Motorcycle создается с 2-мя колесами.*/
    @Test
    void motorcycleHaveTwoWheels(){
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }






}
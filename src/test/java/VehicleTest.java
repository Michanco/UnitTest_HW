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
    /* Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).*/
    @Test
    void carHaveTestSpeed(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    /*Проверить, что объект Motorcycle развивает скорость 75
    в режиме тестового вождения (используя метод testDrive()).*/
    @Test
    void motorcycleHaveTestSpeed(){
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    /*Проверить, что в режиме парковки (сначала testDrive, потом park,
    т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
     */
    @Test
    void carMoveTest(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    /*Проверить, что в режиме парковки (сначала testDrive, потом park,
    т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
     */
    @Test
    void motorcycleMoveTest(){
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
package com.babikov.alexey.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Работники")
public class WorkerTest {

    @DisplayName("Проверка конструктора")
    @Test
    void shouldConstructorRigth(){
        Worker newWorker = new Worker(1, "Alexey", new Department(1, "NEWDEP"),
                130000, 1);

        assertAll(
                () -> assertEquals("Alexey", newWorker.getName()),
                () -> assertEquals(130000, newWorker.getSalary()),
                () -> assertEquals(1, newWorker.getRole()),
                () -> assertEquals(1, newWorker.getWorker_id())
        );
    }

    @DisplayName("Проверка сеттеров и геттеров")
    @Test
    void shouldSettersAndGettersWorkRigth(){
        Worker newWorker = new Worker();

        newWorker.setWorker_id(1);
        newWorker.setName("Igor");
        newWorker.setDep(new Department(1, "TestDep"));
        newWorker.setSalary(80000);
        newWorker.setRole(1);

        assertAll(
                () -> assertEquals(1, newWorker.getWorker_id()),
                () -> assertEquals("Igor", newWorker.getName()),
                () -> assertNotNull(newWorker.getDep()),
                () -> assertEquals(80000, newWorker.getSalary()),
                () -> assertEquals(1, newWorker.getRole())
        );
    }

    @DisplayName("Проверка Интерфейса")
    @Test
    void chouldInterfaceWorkRigth(){
        Worker newWorker = new Worker(1, "Alexey", new Department(1, "NEWDEP"),
                130000, 1);
        newWorker.changeDep(new Department(2, "Second"));

        assertEquals("Second", newWorker.getDep().getName());
    }
}

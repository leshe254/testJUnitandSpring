package com.babikov.alexey.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс отделы")
public class DepartmentTest {

    @DisplayName("Проверка конструктора")
    @Test
    void shouldConstructorRigth(){
        Department newDep = new Department(1, "HeadQuatters");

        assertAll(
                () -> assertEquals(1, newDep.getDep_id()),
                () -> assertEquals("HeadQuatters", newDep.getName())
        );
    }

    @DisplayName("Проверка сеттеров и геттеров")
    @Test
    void shouldSettersAndGettersWorkRigth(){
        Department newDep = new Department();

        newDep.setDep_id(2);
        newDep.setName("TestName");

        assertAll(
                () -> assertEquals(2, newDep.getDep_id()),
                () -> assertEquals("TestName", newDep.getName())
        );
    }

    @DisplayName("Проверка Интерфейса")
    @Test
    void shouldInterfaceWorksRigth(){
        Department newDep = new Department(2, "FirstName");

        newDep.changeName("Test");

        assertEquals("Test", newDep.getName());
    }
}

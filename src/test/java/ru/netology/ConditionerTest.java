package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldIncreaseCurrentTemperature(int CurrentTemperature, int MaxTemperature, int expected) {
//     conditioner.setCurrentTemperature();
//      conditioner.setMaxTemperature();
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println("Текущая температура = " + conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature2() {
        conditioner.setCurrentTemperature(34);
        conditioner.setMaxTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(35, conditioner.getCurrentTemperature());
        System.out.println("Текущая температура = " + conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature3() {
        conditioner.setCurrentTemperature(36);
        conditioner.setMaxTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(35, conditioner.getCurrentTemperature());
        System.out.println("Текущая температура = " + conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        conditioner.setCurrentTemperature(15);
        conditioner.setMinTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
        System.out.println("Текущая температура = " + conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature2() {
        conditioner.setCurrentTemperature(18);
        conditioner.setMinTemperature(17);
        conditioner.decreaseCurrentTemperature();
        assertEquals(17, conditioner.getCurrentTemperature());
        System.out.println("Текущая температура = " + conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature3() {
        conditioner.setCurrentTemperature(14);
        conditioner.setMinTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
        System.out.println("Текущая температура = " + conditioner.getCurrentTemperature());
    }

}
package ru.test.springcourse;

public class ClassicalMusic implements Music {

    public void doMyInit() {
        System.out.println("Doing my initialization.");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destroy.");
    }

    @Override
    public String getSong() {
        return "Bach Tokkata";
    }

    // код для доступа к классической музыки

}

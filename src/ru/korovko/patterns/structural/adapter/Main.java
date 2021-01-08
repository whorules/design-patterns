package ru.korovko.patterns.structural.adapter;

public class Main {

    public static void main(String[] args) {
        Measurable everest = new Everest();
        MeasurableAdapter adapter = new MeasurableAdapterImpl(everest);
        System.out.println(adapter.getHeight()); // returns 8848 - height of an Everest in meters
    }
}

package ru.korovko.patterns.structural.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MeasurableAdapterImpl implements MeasurableAdapter {

    private final Measurable measurable;

    @Override
    public double getHeight() {
        return convertToMeters(measurable.getHeight());
    }

    private double convertToMeters(double feet) {
        return feet / 3.281;
    }
}

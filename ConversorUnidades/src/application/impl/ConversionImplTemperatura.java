package application.impl;

import application.model.*;

public class ConversionImplTemperatura implements Conversion<Double> {

    @Override
    public Double unitConversion(Double conv) {
        return (conv * 9 / 5) + 32;
    }

}

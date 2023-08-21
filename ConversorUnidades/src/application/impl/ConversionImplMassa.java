package application.impl;

import application.model.*;

public class ConversionImplMassa implements Conversion<Double> {

    @Override
    public Double unitConversion(Double conv) {
        return conv * 1000;
    }

}

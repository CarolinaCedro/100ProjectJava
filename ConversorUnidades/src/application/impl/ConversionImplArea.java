package application.impl;

import application.model.*;

public class ConversionImplArea implements Conversion<Double> {

    @Override
    public Double unitConversion(Double conv) {
        return conv / 10000;
    }

}

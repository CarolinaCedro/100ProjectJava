package application.impl;

import application.model.*;

public class ConversionImplComprimento implements Conversion<Double> {

    @Override
    public Double unitConversion(Double conv) {
        return conv / 100;
    }

}

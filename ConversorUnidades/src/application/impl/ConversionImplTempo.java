package application.impl;

import application.model.*;

public class ConversionImplTempo implements Conversion<Double> {

    @Override
    public Double unitConversion(Double conv) {
        return conv / 60;
    }

}

public class Calculator implements Operations {

    @Override
    public Long adicao(Long numberOne, Long numberTwo) {
        return numberOne + numberTwo;
    }

    @Override
    public Long subtracao(Long numberOne, Long numberTwo) {
        return numberOne - numberTwo;
    }

    @Override
    public Long multiplicacao(Long numberOne, Long numberTwo) {
        return numberOne * numberTwo;
    }

    @Override
    public double divisao(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            throw new RuntimeException("Não posssivel divisão por 0");
        }
        return numberOne / numberTwo;
    }
}

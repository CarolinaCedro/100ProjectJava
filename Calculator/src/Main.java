<<<<<<< HEAD
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ViewActions viewActions = new ViewActions();
        String opView;

        do {
            String numberOne = JOptionPane.showInputDialog(null,
                    "Entre com o primeiro numero: ",
                    "Calculadora", JOptionPane.INFORMATION_MESSAGE);

            String numberTwoo = JOptionPane.showInputDialog(null,
                    "Entre com o segundo numero: ",
                    "Calculadora", JOptionPane.INFORMATION_MESSAGE);

            opView = JOptionPane.showInputDialog(null,
                    "" +
                            "Escolha operação desejada: \n" +
                            " (1)Adição \n" +
                            " (2)Subtração \n" +
                            " (3)Multiplicação \n" +
                            " (4)Divisão \n" +
                            " (0)Sair \n",

                    "Operações", JOptionPane.INFORMATION_MESSAGE);

            int op = Integer.parseInt(opView);

            switch (op) {
                case 1 ->
                        viewActions.showResultMessage(calculator.adicao(Long.parseLong(numberOne), Long.parseLong(numberTwoo)));
                case 2 ->
                        viewActions.showResultMessage(calculator.subtracao(Long.parseLong(numberOne), Long.parseLong(numberTwoo)));
                case 3 ->
                        viewActions.showResultMessage(calculator.multiplicacao(Long.parseLong(numberOne), Long.parseLong(numberTwoo)));
                case 4 ->
                        viewActions.showResultMessageDouble(calculator.divisao(Double.parseDouble(numberOne), Double.parseDouble(numberTwoo)));
                case 0 -> viewActions.showMessage("Obrigado por usar a calculadora. Encerrando o programa.");
                default -> viewActions.showMessage("Opção inválida. Por favor, escolha uma opção válida.");

            }

        } while (toLongNumber(opView) != 0);
=======
/*
 * Criar um crud em memoria usando a interface de poup-up do swing para criar um crud DAO em Memória.
 *
 *   *Criar cliente
 *   *Visualizar cliente
 *   *Atualizar cliente
 *   *Excluir cliente
 *
 * */


import dao.*;
import domain.*;
import view.*;


public class Main {

    public static ClienteDao clienteDao;
    public static ViewActions viewActions = new ViewActions();

    public static void main(String[] args) {
        clienteDao = new MapDao();

        //"Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
        int op = stringToInt(viewActions.menu());
        String cadastrarCliente = viewActions.cadastrar();
        Cliente cliente = toCliente(cadastrarCliente);


        switch (op) {
            case 1 -> clienteDao.cadastrar(cliente);
            case 2 -> clienteDao.consultar(viewActions.findById());
            case 3 -> clienteDao.excluir(viewActions.deleteById());
            case 4 -> clienteDao.alterar(viewActions.alterar());
            case 5 -> viewActions.sairDialog("Saindo do programa");
        }



>>>>>>> 12230912940cd5ac86f2df580aca2f560f3b9a67


    }

<<<<<<< HEAD
    public static Long toLongNumber(String value) {
        return Long.parseLong(value);
    }
=======

    public static Cliente toCliente(String data) {
        //Nome, CPF, Telefone, Endereço, Número, Cidade e Estado"
        Cliente cliente = new Cliente();
        String[] valuesPositions = data.split(",");
        cliente.setNome(valuesPositions[0]);
        cliente.setCpf(stringToLong(valuesPositions[1]));
        cliente.setTel(stringToLong(valuesPositions[2]));
        cliente.setEnd(valuesPositions[3]);
        cliente.setNumero(stringToLong(valuesPositions[4]));
        cliente.setCidade(valuesPositions[5]);
        cliente.setEstado(valuesPositions[6]);
        return cliente;
    }


    public static Long stringToLong(String value) {
        return Long.parseLong(value);
    }

    public static int stringToInt(String value) {
        return Integer.parseInt(value);
    }


>>>>>>> 12230912940cd5ac86f2df580aca2f560f3b9a67
}

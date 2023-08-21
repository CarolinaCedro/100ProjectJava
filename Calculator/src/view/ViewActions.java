package view;

import javax.swing.*;

public class ViewActions {

    public void textView(String title, String text) {
        JOptionPane.showInputDialog(null,
                text,
                title, JOptionPane.INFORMATION_MESSAGE);
    }

    public String menu() {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        return opcao;
    }

    public Long findById() {
        return Long.parseLong(JOptionPane.showInputDialog(null,
                "Digite o id do cliente",
                "Procurar", JOptionPane.INFORMATION_MESSAGE));


    }
    public Long deleteById() {
        return Long.parseLong(JOptionPane.showInputDialog(null,
                "Digite o id do cliente que deseja excluir",
                "Procurar", JOptionPane.INFORMATION_MESSAGE));


    }
    public Long alterar() {
        return Long.parseLong(JOptionPane.showInputDialog(null,
                "Digite o id do cliente que deseja alterar",
                "Procurar", JOptionPane.INFORMATION_MESSAGE));


    }

    public String cadastrar() {
        String dados = JOptionPane.showInputDialog(null,
                "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        return dados;
    }

    public void Option() {
        String[] options = {"Option 1", "Option 2", "Option 3"};
        String selectedOption = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Menu",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );

        if (selectedOption != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Opção selecionada: " + selectedOption,
                    "Seleção",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }


    public void opView(String title, String text) {
        String op = JOptionPane.showInputDialog(null,
                text,
                title, JOptionPane.INFORMATION_MESSAGE);
    }

    public void sucess(String title, String text) {
        String op = JOptionPane.showInputDialog(null,
                text,
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void error(String title, String text) {
        String op = JOptionPane.showInputDialog(null,
                text,
                "Erro", JOptionPane.INFORMATION_MESSAGE);
    }

    public void inputDialog(String title, String text) {
        String inputDialog = JOptionPane.showInputDialog(null,
                text,
                title, JOptionPane.INFORMATION_MESSAGE);
    }

    public void sairDialog(String text) {
        String inputDialog = JOptionPane.showInputDialog(null,
                text,
                "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}

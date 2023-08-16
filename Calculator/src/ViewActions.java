import javax.swing.*;

public class ViewActions {

    public void textView(String title, String text) {
        JOptionPane.showInputDialog(null,
                text,
                title, JOptionPane.INFORMATION_MESSAGE);
    }

    public void showResultMessage(Long result) {
        JOptionPane.showMessageDialog(null,
                "Seu resultado é: " + result,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }


    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showResultMessageDouble(double result) {
        JOptionPane.showMessageDialog(null,
                "Seu resultado é: " + result,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

}

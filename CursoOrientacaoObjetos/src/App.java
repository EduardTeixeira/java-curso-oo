import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        System.out.println(numero);
    }
}

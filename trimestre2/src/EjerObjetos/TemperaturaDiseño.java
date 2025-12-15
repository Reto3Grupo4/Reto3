package EjerObjetos;

import javax.swing.*;
import java.awt.event.*;

public class TemperaturaDiseño extends JFrame {

    private static final long serialVersionUID = 1L;

    private JTextField txtInput;
    private JTextField txtResult;
    private JButton btnCtoF;
    private JButton btnFtoC;
    private Temperatura temperatura;

    public TemperaturaDiseño() {
        temperatura = new Temperatura();
        setTitle("Conversor de Temperatura");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        txtInput = new JTextField(10);
        txtResult = new JTextField(10);
        txtResult.setEditable(false);
        btnCtoF = new JButton("C -> F");
        btnFtoC = new JButton("F -> C");

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtInput)
                    .addComponent(btnCtoF))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtResult)
                    .addComponent(btnFtoC))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput)
                    .addComponent(txtResult))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCtoF)
                    .addComponent(btnFtoC))
        );

        btnCtoF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(txtInput.getText());
                    double fahrenheit = temperatura.CelciusToFahrenheit(celsius);
                    txtResult.setText(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
                }
            }
        });

        btnFtoC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(txtInput.getText());
                    double celsius = temperatura.FahrenheitToCelsius(fahrenheit);
                    txtResult.setText(String.format("%.2f", celsius));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TemperaturaDiseño();
    }
}
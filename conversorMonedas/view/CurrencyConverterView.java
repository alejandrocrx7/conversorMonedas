import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CurrencyConverterView extends JFrame {
    private JTextField amountField = new JTextField(10);
    private JComboBox<String> fromCurrency = new JComboBox<>(new String[]{"USD", "EUR", "GBP", "COP", "JPY"});
    private JComboBox<String> toCurrency = new JComboBox<>(new String[]{"USD", "EUR", "GBP", "COP", "JPY"});
    private JButton convertButton = new JButton("Convert");
    private JLabel resultLabel = new JLabel("Result: ");

    public CurrencyConverterView() {
        // Configurar el marco de la ventana
        setTitle("Currency Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        // Configurar los componentes
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Amount: "), gbc);

        gbc.gridx = 1;
        add(amountField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("From: "), gbc);

        gbc.gridx = 1;
        add(fromCurrency, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("To: "), gbc);

        gbc.gridx = 1;
        add(toCurrency, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        add(convertButton, gbc);

        gbc.gridy = 4;
        add(resultLabel, gbc);
    }

    public double getAmount() {
        return Double.parseDouble(amountField.getText());
    }

    public String getFromCurrency() {
        return fromCurrency.getSelectedItem().toString();
    }

    public String getToCurrency() {
        return toCurrency.getSelectedItem().toString();
    }

    public void setResult(double result) {
        resultLabel.setText("Result: " + result);
    }

    public void addConvertListener(ActionListener listener) {
        convertButton.addActionListener(listener);
    }
}

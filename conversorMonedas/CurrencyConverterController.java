

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverterController {
    private CurrencyConverter model;
    private CurrencyConverterView view;

    public CurrencyConverterController(CurrencyConverter model, CurrencyConverterView view) {
        this.model = model;
        this.view = view;

        view.addConvertListener(new ConvertListener());
    }

    class ConvertListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double amount = view.getAmount();
            String from = view.getFromCurrency();
            String to = view.getToCurrency();
            double result = model.convert(from, to, amount);
            view.setResult(result);
        }
    }
}

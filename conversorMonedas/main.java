public class main {
    public static void main(String[] args) {
        CurrencyConverter model = new CurrencyConverter();
        CurrencyConverterView view = new CurrencyConverterView();
        CurrencyConverterController controller = new CurrencyConverterController(model, view);

        view.setVisible(true);
    }
}

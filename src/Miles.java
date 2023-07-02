public class Miles extends Expression{
    @Override
    public String miles(double quantity) {
        return Double.toString(quantity);
    }

    @Override
    public String kilometres(double quantity) {
        return Double.toString(quantity*1.60934);
    }

    @Override
    public String yards(double quantity) {
        return Double.toString(quantity*1760);
    }

    @Override
    public String metres(double quantity) {
        return Double.toString(quantity*1609.34);
    }

    @Override
    public String feets(double quantity) {
        return Double.toString(quantity*5280);
    }

    @Override
    public String inches(double quantity) {
        return Double.toString(quantity*63360);
    }

    @Override
    public String centimetres(double quantity) {
        return Double.toString(quantity*160934);
    }
}

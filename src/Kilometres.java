public class Kilometres extends Expression{
    @Override
    public String miles(double quantity) {
        return Double.toString(quantity*0.621371);
    }

    @Override
    public String kilometres(double quantity) {
        return Double.toString(quantity);
    }

    @Override
    public String yards(double quantity) {
        return Double.toString(quantity*1093.61);
    }

    @Override
    public String metres(double quantity) {
        return Double.toString(quantity*1000);
    }

    @Override
    public String feets(double quantity) {
        return Double.toString(quantity*3280.84);
    }

    @Override
    public String inches(double quantity) {
        return Double.toString(quantity*39370.1);
    }

    @Override
    public String centimetres(double quantity) {
        return Double.toString(quantity*100000);
    }
}

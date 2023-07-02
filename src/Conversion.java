import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Conversion {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Convertor");
        String questionAsked = JOptionPane.showInputDialog(frame,"Enter the question.");
        ConversionContext question = new ConversionContext(questionAsked);
        String fromConv = question.getFromConv();
        String toConv = question.getToConv();
        Double quantity = question.getQuantity();
        try {
            Class tempClass = Class.forName(fromConv);
            Constructor constructor = tempClass.getConstructor();
            Object convertFrom = (Expression) constructor.newInstance();
            Class[] methodParams = new Class[]{Double.TYPE};
            Method conversionMethod = tempClass.getMethod(toConv, methodParams);
            Object[] params = new Object[]{new Double(quantity)};
            String toQuantity = (String) conversionMethod.invoke(convertFrom, params);
            String answer = question.getResponse() + toQuantity + " " + toConv;
            JOptionPane.showMessageDialog(null, answer);
            frame.dispose();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
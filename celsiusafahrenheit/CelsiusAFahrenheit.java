package celsiusafahrenheit;

import javax.swing.*;

public class CelsiusAFahrenheit {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Temperatura en Celsius"));
        double farenheit = (celsius*1.8)+32;
        JOptionPane.showMessageDialog(null,"La Temperatura en Farenheit es: "+farenheit);
        JOptionPane.showMessageDialog(null,"Temperatura sin decimales: "+(int)farenheit);
    }
}

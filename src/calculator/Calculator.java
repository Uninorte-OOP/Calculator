/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import javax.swing.JOptionPane;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            JOptionPane.showMessageDialog(null, "Divisor no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

}

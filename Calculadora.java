import javax.swing.*;

public class Calculadora{

    public static void main(String[] args){

        int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero Inteiro:"));

        int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero Inteiro:"));
        
        int soma = primeiroValor + segundoValor;

        JOptionPane.showMessageDialog(null, primeiroValor + " + " + segundoValor + " = " + soma);


    }


}
import javax.swing.*;

public class Calculadora{

    public static void main(String[] args){

        String operador;
        int primeiroValor;
        int segundoValor;

        int resultado = 0;

        String sair = "a";

        do{

            primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Insira numero Inteiro:"));

            do{
                operador = JOptionPane.showInputDialog("Selecione:\n+ (somar)\n - (subtrair)\n * (multiplicar)\n / (dividir)");

            }while(!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/"));

            segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Insira numero Inteiro:"));
        
            if(operador.equals("+")){

                resultado = primeiroValor + segundoValor;

            }else if (operador.equals("-")){

                resultado = primeiroValor - segundoValor;

            }else if (operador.equals("*")){

                resultado = primeiroValor * segundoValor;

            }else if (operador.equals("/")){
                if(segundoValor == 0){

                    JOptionPane.showMessageDialog(null, "Não é possivel fazer a divisão por Zero");
                
                }else{
                    resultado = primeiroValor / segundoValor;
                }
            }

            if(segundoValor != 0){

                JOptionPane.showMessageDialog(null, primeiroValor + operador + segundoValor + " = " + resultado);
            }
        sair = JOptionPane.showInputDialog("Deseja continuar:\n s para Sair");

        }while(!sair.equals("s"));

    }


}
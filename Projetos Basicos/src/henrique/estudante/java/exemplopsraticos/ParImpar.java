package henrique.estudante.java.exemplopsraticos;

import javax.swing.*;

public class ParImpar {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número para descobrirmos se é par" +
                " ou impar ?"));

        if (numero % 2 == 0){ //<- Se o numero é par.
            System.out.println("É par");
        }else {
            System.out.println("É impar");
        }

        if (numero > 10){
            String maior;
            maior = "Maior";
            JOptionPane.showMessageDialog(null, "Esse valor é " + maior);
        } else if (numero < 10) {
            String menor;
            menor = "Menor";
            JOptionPane.showMessageDialog(null, "Esse valor é " + menor);
        }
    }
}

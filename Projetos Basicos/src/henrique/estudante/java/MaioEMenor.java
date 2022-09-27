package henrique.estudante.java;

import javax.swing.*;
import java.util.Scanner;

public class MaioEMenor {
    public static void main(String[] args) {
        String nome = null;
        float media = 0;
        for (int i = 0; i < 11; i++){
          nome = JOptionPane.showInputDialog("Informe um nome?");
          media = Float.parseFloat(JOptionPane.showInputDialog("Informe uma média anual?"));

        }

        if (media >= 10){
            JOptionPane.showMessageDialog(null, "Maior média foi do (a) " + nome + " com" + media);

        }else{
            JOptionPane.showMessageDialog(null, "Menor média foi do (a) " + nome + " com" + media);
        }
    }
}

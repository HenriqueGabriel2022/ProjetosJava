package henrique.estudante.java.exemplopsraticos;

import javax.swing.*;


public class Retorne {
    public boolean Verdade(){
        int soma,a,b;
        boolean resposta = true;

         a = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um numero?"));
         b = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um outro numero?"));
         soma = a+b;
         JOptionPane.showMessageDialog(null,"A soma é ? " + soma);

        for(int i = 0; i > soma ; i++){
            if (a < 0 && soma != 0){
              a = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor ao a"));
            } else if (b < 0 && soma != 0) {
              b = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor ao b?"));
            }
            soma = a+b;
            JOptionPane.showMessageDialog(null,"A soma é " + soma);
        }

        resposta = true;
        JOptionPane.showMessageDialog(null, "A resposta é " + resposta);

        return resposta;
    }
}

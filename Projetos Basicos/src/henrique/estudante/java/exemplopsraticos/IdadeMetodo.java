package henrique.estudante.java.exemplopsraticos;

import javax.swing.*;

public class IdadeMetodo {

    int idade;

    public void Idade(){
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe um Idade"));
        if (idade >= 18){
            JOptionPane.showMessageDialog( null,"Maior de Idade");
        }else {
            JOptionPane.showMessageDialog(null,"Menor de Idade");
        }
    }

    public void RetorneIdade(){
        if(idade >= 18 && idade < 70){
            JOptionPane.showMessageDialog(null,"Pode dirigir");
        }else if (idade >= 70){
            JOptionPane.showMessageDialog(null," Não pode dirigir");
        }


    }

}

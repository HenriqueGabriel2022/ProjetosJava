package henrique.estudante.java.exemplopsraticos;

import javax.swing.*;


public class ProvaFinal {
    public static void main(String[] args) {
        String nome, sexm = null, sexf = null, resposta, solucao = null, s1 = null;
        float n1,n2,n3;

       resposta = JOptionPane.showInputDialog("Informe se é menino ou menina com O ou A (maisculo ou minuscolo)");
       solucao = JOptionPane.showInputDialog("Aluno ou Aluna?");

       if (sexm == "O" || sexm == "o"){
           resposta = sexm;
        } else if (sexf == "A" || sexf == "a") {
           resposta = sexf;
       }

        //Sucesso
        nome = JOptionPane.showInputDialog("Informe um nome?");
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do 1° Trimestre"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do 2° Trimestre"));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do 3° Trimestre")) ;

        float mf;
        mf = (float) ((n1 * 0.3) + (n2 * 0.3) + (n3 * 0.4));


        if (mf >= 6.0){
            s1 ="Aprovado";
        } else if (mf > 3.0 && mf < 5.9) {
            s1 ="de Prova Final";
        } else if (mf < 3.0) {
            s1 ="Reprovado";
        }

        System.out.println(resposta + " " + solucao + " "  + nome + " tem média " + mf + " e está " + s1);



    }
}

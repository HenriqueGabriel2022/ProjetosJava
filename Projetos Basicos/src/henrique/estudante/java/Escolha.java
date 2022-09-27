package henrique.estudante.java;

import javax.swing.*;

public class Escolha {
    public static void main(String[] args) {
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Escolha um Número ?"));

        switch (a){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Junho");
                break;
            case 6:
                System.out.println("Julho");
                break;
            case 7:
                System.out.println("Agosoto");
                break;
            case 8:
                System.out.println("Setembro");
                break;
            case 9:
                System.out.println("Novembro");
                break;

            default:
                System.out.println("Valor não existencial.");

        }
    }
}

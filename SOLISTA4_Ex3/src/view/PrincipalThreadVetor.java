package view;
import controller.ControllerThreadVetor;
import javax.swing.JOptionPane;
public class PrincipalThreadVetor {
    public static void main (String[] args){
        
        int[]vet = new int[1000];
        int valorI = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor ímpar: "));
        while (valorI%2 == 0){
            valorI = Integer.parseInt(JOptionPane.showInputDialog("Precisa ser ímpar: "));
        }
        int valorP = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor par: "));
        while (valorP%2!= 0){
            valorP = Integer.parseInt(JOptionPane.showInputDialog("Precisa ser par: "));
        }
        
        for (int i = 0; i <1000; i++){
            vet[i] = (int)(Math.random() * 100) + 1;
        }
        
        Thread ThreadVetor1 = new Thread(new ControllerThreadVetor(valorI, vet));
        Thread ThreadVetor2 = new Thread(new ControllerThreadVetor(valorP, vet));

        ThreadVetor1.start();
        ThreadVetor2.start();
    }
}
       

    

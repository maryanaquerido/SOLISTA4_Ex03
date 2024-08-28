package controller;

public class ControllerThreadVetor implements Runnable { 
    private int valor;
    private int[] vet;

    public ControllerThreadVetor(int valor, int[] vet) {
        this.valor = valor;
        this.vet = vet;
    }
    
    public void run (){
        calc(); 
    }
        private void calc (){
        
            if (valor % 2 == 0){
                long tempoInicialPar = System.nanoTime();
                for (int i = 0 ; i < vet.length; i++){
                    int valorp = vet[i];
                }   
                long tempoFinalPar = System.nanoTime();
                double tempoTotalPar = (tempoFinalPar - tempoInicialPar)/ Math.pow(10, 9);
                
                System.out.println("Valor: " + valor + " = par! - Tempo para percorrer o vetor: " + tempoFinalPar +"s.");
            } else {
                long tempoInicialImpar = System.nanoTime();
                for (int valori : vet){
                 
                }
                long tempoFinalImpar = System.nanoTime();
                double tempoTotalImpar = (tempoFinalImpar - tempoInicialImpar)/ Math.pow(10, 9);
                
                System.out.println("Valor: " + valor + " = Ímpar! - Tempo para percorrer o vetor: " + tempoFinalImpar +"s.");
            }
    }
    
    
}

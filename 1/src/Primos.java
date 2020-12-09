public class Primos extends Thread{
    private int inicio;
    private int fim;
    private int quantidade = 0;
    public Primos(int inicio, int fim){
        this.inicio = inicio;
        this.fim = fim;
    }

    public void setInicio(int inicio){
        this.inicio = inicio;
    }

    public int getInicio(){
        return this.inicio;
    }

    public void setFim(int fim){
        this.fim = fim;
    }

    public int getFim(){
        return this.fim;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    public void run(){
        int quantidade = 0;
        for(int i = this.inicio ; i <= this.fim; i++){
            int divisores = 0;
            for(int divisor = 2; divisor < this.fim; divisor++){
                if(divisor != i){
                    if(i%divisor == 0){
                        divisores++;
                    }
                }
            }
            if(divisores == 0){
             quantidade++;
            }
        }
        this.quantidade = quantidade;
    }
}

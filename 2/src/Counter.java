public class Counter{
    private int count = 0;

    synchronized void increment(){
        if(count < 3){
            this.count++;
            System.out.println("Contador incrementado, novo valor : " + Integer.toString(this.count));
        }else{
            System.out.println("Contador no limite, esperando ele diminuir");
        }

    }
    synchronized void decrement(){
        if(count > 0){
            this.count--;
            System.out.println("Contador decrementado, novo valor : " + Integer.toString(this.count));
        }else{
            System.out.println("Contador no limite, esperando ele aumentar");
        }
    }
}

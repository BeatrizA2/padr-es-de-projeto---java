package Entidades.Cliente;

public class NaoDevedor implements Cliente{
    private float saldo;
    private float limite;

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite(){
        if(saldo < 5000){
            limite = 750;
        }
        else if(saldo < 10000){
            limite = 1200;
        }
        else{
            limite = (float) (saldo*0.25);
        }
        return limite;
    }

    
}

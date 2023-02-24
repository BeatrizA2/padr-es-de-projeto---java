package Entidades.Cliente;

public class Devedor implements Cliente {
    private float saldo;
    private float divida;
    private float limite;

    public void setDivida(float divida) {
        this.divida = divida;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite(){
        
        if(divida > saldo){
            limite = (float) (saldo*0.1);
        }
        else if (divida == saldo){
            limite = (float) (saldo*0.15);
        }
        else{
            limite = (float) (saldo*0.25);
        }

        return limite;
    }
}

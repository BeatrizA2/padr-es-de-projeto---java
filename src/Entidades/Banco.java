package Entidades;

public class Banco {

    private static Banco banco = new Banco();

    private Banco(){
        super();
    }

    public static Banco getBanco(){
        return banco;
    }

    public void creditoAprovado(float limite, boolean devedor){
        if(devedor == false){
            if(limite > 3000){
                System.out.println("O crédito requisitado não foi aprovado");
            }
            else{
                System.out.println("O crédito requisitado foi aprovado e já está disponível para uso");
            }
        }
        else{
            System.out.println("O crédito requisitado não foi aprovado");
        }

    }
    
}

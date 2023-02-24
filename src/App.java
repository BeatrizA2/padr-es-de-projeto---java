import Entidades.Banco;
import Entidades.Cliente.Devedor;
import Entidades.Cliente.NaoDevedor;

public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = Banco.getBanco();

        Devedor devedor = new Devedor();
        NaoDevedor naoDevedor = new NaoDevedor();

        devedor.setDivida(500);
        devedor.setSaldo(234);

        naoDevedor.setSaldo(5740);
        
        float devedor_limite = devedor.getLimite();
        float naoDevedor_limite = naoDevedor.getLimite();

        //análise do devedor
        banco.creditoAprovado(devedor_limite, true);

        //análise do não devedor
        banco.creditoAprovado(naoDevedor_limite, false);
    }
}

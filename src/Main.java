import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        Banco centroSulBank = new Banco();
        Cliente vanderlei = new Cliente();
        vanderlei.setNome("Vanderlei");
        centroSulBank.setNome("CentroSul");

        Conta cc = new ContaCorrente(vanderlei, centroSulBank);
        Conta poupanca = new ContaPoupanca(vanderlei, centroSulBank);
        
        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        contas.add(poupanca);
        contas.add(cc);
       centroSulBank.setContas(contas);
       centroSulBank.listarContas(contas);
       
    }
}

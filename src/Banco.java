import java.util.List;

public class Banco {
    public String nome;
    protected List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void listarContas(List<Conta> contas) {
        System.out.println("==Contas Ativas==");
        contas.forEach(System.out::println);
    }

 



}

public class ContaBancaria {
    
    private Integer numeroConta;
    private String nomeTitular;
    private Double saldo;

    public ContaBancaria() {

    }

    public ContaBancaria(Integer numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public ContaBancaria(Integer numeroConta, String nomeTitular, Double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return  numeroConta;
    }


    public String getNomeTitular() {
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double montante) {
        saldo += montante;
    }

    public void sacar(double montante) {
        saldo -= montante;
    }

    public String exibirConta() {
        return "Número da conta: " + getNumeroConta()
               + "\nTitular: " + getNomeTitular()
               + "\nSaldo: R$ " + String.format("%.2f", getSaldo());
    }
}

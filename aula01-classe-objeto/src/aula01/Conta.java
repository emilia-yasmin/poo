package aula01;

public class Conta {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;
    private boolean status;

    public Conta(String nomeTitular , int numeroConta , double saldo){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.status = true;
    }

    public void exibir(){
        System.out.println("======= Dados Bancarios ========");
        System.out.println("Cliente: " + getNomeTitular());
        System.out.println("Numero da Conta: " + getNumeroConta());
        System.out.println("=================================");
    }

    public String getNomeTitular (){
        return this.nomeTitular;
    }
    public String setNomeTitular(String nome){
        this.nomeTitular = nome;
        return "Numero da conta atualizado.";
    }

    public int  getNumeroConta (){
        return this.numeroConta;
    }

    public String setNumeroConta(int novoNumero){
        this.numeroConta = novoNumero;
        return "Numero da conta atualizado";
    }

    public boolean getStatus(){
        return this.status;

    }

    public String setStatus(boolean novoStatus){
        this.status = novoStatus;
        var resultado = getStatus()? "Conta ativada" : "Conta cancelada";
        return resultado;
    }

    public double getSaldo(){
        return this.saldo;
    }
    private void setSaldo(double valor){
        this.saldo = valor;
    }

    public String depositar(double valor){
        setSaldo(getSaldo()+ valor);
        return "Deposito realizado!";
    }
    public String sacar(double valor){
        setSaldo(getSaldo() - valor);
        return "Saque realizado com sucesso!";
    }
}

package aula01;

public class MainConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("Maria Betania", 2234 , 50.00);

        var resposta = c1.depositar(100.00);
        
        var saque = c1.sacar(30.00);
        System.out.println(resposta);
        System.out.println(saque);
        var valorSaldo = c1.getSaldo();
        System.out.printf("Saldo da conta R$ %.2f", valorSaldo);

    }
}

public class OperacoesContaCorrenteImpl implements OperacoesContaCorrente {
    @Override
    public double realizaDeposito(ContaCorrente contaCorrente, Double deposito) {
        if (deposito < 0) {
            System.out.println("Não foi possivel fazer o depósito " + deposito);
            return contaCorrente.getSaldo();
        } else {
            var novoSaldo = contaCorrente.getSaldo() + deposito;
            contaCorrente.setSaldo(novoSaldo);
            System.out.println("Deposito de " + deposito + " realizado com sucesso. Saldo atual: " + novoSaldo);
        }
        return contaCorrente.getSaldo();
    }

    @Override
    public boolean realizaSaque(ContaCorrente contaCorrente, Double saque) {
        if (saque <= contaCorrente.getSaldo()) {
            var novoSaldo = contaCorrente.getSaldo() - saque;
            contaCorrente.setSaldo(novoSaldo);
            System.out.println("Saque realizado com sucesso! Valor na conta: " + novoSaldo);
            return true;
        } else {
            System.out.println("Não foi possivel realizar o saque");
        }
        return false;
    }
}

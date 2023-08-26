public interface OperacoesContaCorrente {
    double realizaDeposito(ContaCorrente contaCorrente, Double deposito);

    boolean realizaSaque(ContaCorrente contaCorrente, Double saque);
}

package AtivFinal_Java;

public abstract class Conta {
    // Atributos
    String saldo;
    String numeroConta;

    // métodos
    // construtor
    public Conta(String saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public Conta() {
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

}

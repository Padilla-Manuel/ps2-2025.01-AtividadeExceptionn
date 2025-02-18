/**
 * Documentando Trabalho
 * Esta classe é a conta bancária
 * @see java.lang.Object
 * @author Manuel Padilla
 * @version 1.0
 */


package br.dev.joaquim.bank;

/**
 * Atributos da Conta Bancaria 
 * accountNumber
 * balance
 * accountHolderName
 * @see java.lang.Object
 * @author Manuel Padilla
 * @version 1.0
 */
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;


/**
 * Aqui criamos um construtor
 * @author Manuel Padilla
 * @version 1.0
 */
    public BankAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

/**
 * Os set's e get's dos atributos
 * @author Manuel Padilla
 * @version 1.0
 */
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("O valor precisa ser positivo, foi informado R$ " + value);
        }
        this.balance += value;
    }

    public void withdraw(double value) throws InsufficientFundsException {
        if (value < 0) {
            throw new IllegalArgumentException("O valor precisa ser positivo, foi informado R$ " + value);
        }
        if (value > this.balance) {
            throw new InsufficientFundsException(value, this.balance);
        }
        this.balance -= value;
    }
/**
 * Colocando Override
 * @author Manuel Padilla
 * @see java.lang.Object
 * @version 1.0
 */
    @Override
    public String toString() {
        return "Conta " + accountNumber + " de " + accountHolderName + " tem R$ " + balance + " de saldo";
    }
}
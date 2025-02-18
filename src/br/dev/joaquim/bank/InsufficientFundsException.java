/**
 * Criando nova classe para o Exception
 * @author Manuel Padilla
 * @see java.lang.Object
 * @version 1.0
 */
package br.dev.joaquim.bank;

// Exceção personalizada para saldo insuficiente da atividade 1
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(double value, double balance) {
        super("Saque de R$ " + value + " não permitido. Saldo disponível: R$ " + balance);
    }
}
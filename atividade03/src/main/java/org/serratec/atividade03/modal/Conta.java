package org.serratec.atividade03.modal;

public class Conta {

	private int numeroConta;
	private String titular;
	private float saldo;
	
	public void sacar(float valor) {
		if(saldo > valor) {
			saldo = saldo - valor;
			this.setSaldo(saldo);
		}
	}
	public void depositar(float valor) {
		saldo = saldo + valor;
		this.setSaldo(saldo);
	}
	
	public Conta() {}
	
	public Conta(int numeroConta, String titular, float saldo) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}

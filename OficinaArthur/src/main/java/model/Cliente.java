package model;

import java.time.LocalDate;
import java.util.List;

public class Cliente extends Carro {
	public Cliente(String placa, String cor, Integer ano, Integer anoModelo, String marca, String modelo, Carro cliente,
			Oficina oficina) {
		super(placa, cor, ano, anoModelo, marca, modelo, cliente, oficina);
	}

	String cpf;
	String nome;
	LocalDate dataDeNacimento;
	List<Carro> carros;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNacimento() {
		return dataDeNacimento;
	}

	public void setDataDeNacimento(LocalDate dataDeNacimento) {
		this.dataDeNacimento = dataDeNacimento;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
}

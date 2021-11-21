package model;

import java.util.List;

public class Oficina extends Carro {
	public Oficina(String placa, String cor, Integer ano, Integer anoModelo, String marca, String modelo, Carro cliente,
			Oficina oficina) {
		super(placa, cor, ano, anoModelo, marca, modelo, cliente, oficina);
	}

	Integer codigo;
	String nome;
	String especialidade;
	String endereco;
	List<Carro> carros;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
}

package model;

public class Carro {
	String placa;
	String cor;
	Integer ano;
	Integer anoModelo;
	String marca;
	String modelo;
	Carro cliente;
	Oficina oficina;

	public Carro(String placa, String cor, Integer ano, Integer anoModelo, String marca, String modelo, Carro cliente,
			Oficina oficina) {
		super();
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
		this.anoModelo = anoModelo;
		this.marca = marca;
		this.modelo = modelo;
		this.cliente = cliente;
		this.oficina = oficina;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Carro getCliente() {
		return cliente;
	}

	public void setCliente(Carro cliente) {
		this.cliente = cliente;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

}

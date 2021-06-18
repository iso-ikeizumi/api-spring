package com.projeto.api.dtos;

import com.projeto.api.entities.Veiculo;

public class VeiculoResponseDTO {

    private String marca;
    private String modelo;
    private String ano;

    VeiculoResponseDTO() {}

    public VeiculoResponseDTO(Veiculo veiculo) {
      this.marca = veiculo.getMarca();
      this.modelo = veiculo.getModelo();
      this.ano = Integer.toString(veiculo.getAno());
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

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

}


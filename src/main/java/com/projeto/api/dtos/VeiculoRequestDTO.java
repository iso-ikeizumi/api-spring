package com.projeto.api.dtos;

import com.projeto.api.entities.Veiculo;

public class VeiculoRequestDTO {
	
    private Long id;
    private String marca;
    private String modelo;
    private String ano;

    VeiculoRequestDTO() {}

    VeiculoRequestDTO(String marca, String modelo, String ano) {
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
    }
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

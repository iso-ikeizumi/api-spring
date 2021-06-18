package com.projeto.api.dtos;

public class VeiculoRequestDTO {
	
    private Long id;
    private String marca;
    private String modelo;
    private String ano;
    private long userId;

    VeiculoRequestDTO() {}

    VeiculoRequestDTO(String marca, String modelo, String ano, long userId) {
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
      this.userId = userId;
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}

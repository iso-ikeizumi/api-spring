package com.projeto.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.projeto.api.dtos.RequestFIPEDTO;

@Entity
public class Veiculo {

	@Id @GeneratedValue
    private Long id;
    private String marca;
    private String modelo;
    private int ano;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    Veiculo() {}

    public Veiculo(String marca, String modelo, int ano, User user) {
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
      this.user = user;
    }
    
    public Veiculo(RequestFIPEDTO requestFIPE, User user) {
        this.marca = requestFIPE.getMarca();
        this.modelo = requestFIPE.getModelo();
        this.ano = requestFIPE.getAnoModelo(); 
        this.user = user;
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
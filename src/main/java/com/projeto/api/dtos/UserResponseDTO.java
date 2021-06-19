package com.projeto.api.dtos;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projeto.api.entities.User;
import com.projeto.api.entities.Veiculo;

public class UserResponseDTO {

    private String name;
    private String email;
    private String cpf;
    private Date birthDate;
    @JsonIgnoreProperties("user")
    private Set<Veiculo> veiculos;

    UserResponseDTO() {}

    public UserResponseDTO(User user) {
      this.name = user.getName();
      this.email = user.getEmail();
      this.cpf = user.getCpf();
      this.birthDate = user.getBirthDate();
      this.veiculos = user.getVeiculos();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Set<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Set<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}  

}


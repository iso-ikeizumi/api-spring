package com.projeto.api.dtos;

import java.util.Date;

import com.projeto.api.entities.User;

public class UserResponseDTO {

    private String name;
    private String email;
    private String cpf;
    private Date birthDate;

    UserResponseDTO() {}

    public UserResponseDTO(User user) {
      this.name = user.getName();
      this.email = user.getEmail();
      this.cpf = user.getCpf();
      this.birthDate = user.getBirthDate();
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

}


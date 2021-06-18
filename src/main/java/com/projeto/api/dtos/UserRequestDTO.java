package com.projeto.api.dtos;

import java.util.Date;

import com.projeto.api.entities.User;

public class UserRequestDTO {
	
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private Date birthDate;

    UserRequestDTO() {}

    UserRequestDTO(String name, String email, String cpf, Date birthDate) {
      this.name = name;
      this.email = email;
      this.cpf = cpf;
      this.birthDate = birthDate;
    }

    public User getUser() {
    	return new User(this.getName(), this.getEmail(), this.getCpf(), this.getBirthDate());
    }
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

package com.projeto.api.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User {

	@Id @GeneratedValue
    private Long id;
    private String name;
    @Column(unique=true)
    private String email;
    @Column(unique=true)
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @OneToMany(mappedBy="user")
	private Set<Veiculo> veiculos;

    User() {}

    public User(String name, String email, String cpf, Date birthDate) {
      this.name = name;
      this.email = email;
      this.cpf = cpf;
      this.birthDate = birthDate;
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

	public Set<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Set<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}  
	
}
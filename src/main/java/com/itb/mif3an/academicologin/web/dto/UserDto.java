package com.itb.mif3an.academicologin.web.dto;

import java.time.LocalDate;
import java.util.List;

import com.itb.mif3an.academicologin.model.Endereco;

public class UserDto {

	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private LocalDate dataNascimento;
	
	private List<Endereco> enderecos;
	
	public UserDto () {
		
	}

	public UserDto(String firstName, String lastName, String email, String password) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public UserDto(String firstName, String lastName, String email, String password, List<Endereco> enderecos) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.enderecos = enderecos;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}

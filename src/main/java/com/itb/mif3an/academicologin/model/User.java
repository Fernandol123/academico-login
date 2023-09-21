package com.itb.mif3an.academicologin.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

	//private : Acessecdentro da própria classe
	//public : Acesso livre à todas as classes
	//protected : Acesso liberado dentro para classes filhas (Herança)
	
	//GenerationYype.AUTO
	//valor padrão (deixa para o provedor a sequência a ser seguida, caso não o provedor 
	//a sequência.
	//GenerationType.TABLE
	//Criamos uma tabela para gerenciar as chaves primárias, não há suporte para todos
	//os provedores
	
	@Id //PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-Incremento
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private LocalDate dataNascimento;
	
	 //1:N
	@OneToMany //Um usuários para muitos endereços
	@JoinColumn(name="endereco_id")  //Chave estrangeira Fk
	private List<Endereco> enderecos;
	
	//m:n
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name="users_roles",
			joinColumns=@JoinColumn(name="user_id",referencedColumnName = "id"),
	        inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName = "id")
	)
	private Collection<Role> roles;
	
	//Construtor padrão: No possui parâmetros
	
	public User() {
		
	}
	
	public User(String firstName) {
		
		this.firstName = firstName;
	}

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	public User(String firstName, String lastName, String email, String password) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
	
	
	public User(String firstName, String lastName, String email, String password, Collection<Role> roles) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
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

	public void setId(long id) {
		this.id = id;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}

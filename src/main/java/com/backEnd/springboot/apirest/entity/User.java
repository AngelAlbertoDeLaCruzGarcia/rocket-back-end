package com.backEnd.springboot.apirest.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "users_angel_alberto")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "first_name", length = 30, nullable = false )
	private String firstName;
	
	@Column(name = "second_name", length = 30)
	private String secondName;
	
	@Column(name = "first_lastname", length = 30, nullable = false )
	private String firstLastname;

	@Column(name = "second_lastname", length = 30, nullable = false )
	private String secondLastname;

	@Column(name = "birthday", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date birthday;

	@Column(name = "email", length = 100, nullable = false )
	private String email;	
	
	@Column(name = "telefono", length = 15, nullable = false )
	private String telefono;

	@Column(name = "create_at", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	@Column(name = "update_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateAt;

	@Column(name = "delete_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date deleteAt;
	
	public User(String firstName, String secondName, String firstLastname, String secondLastname, Date birthday,
			String email, String telefono, Date createAt, Date updateAt, Date deleteAt) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.firstLastname = firstLastname;
		this.secondLastname = secondLastname;
		this.birthday = birthday;
		this.email = email;
		this.telefono = telefono;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.deleteAt = deleteAt;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstLastname() {
		return firstLastname;
	}

	public void setFirstLastname(String firstLastname) {
		this.firstLastname = firstLastname;
	}

	public String getSecondLastname() {
		return secondLastname;
	}

	public void setSecondLastname(String secondLastname) {
		this.secondLastname = secondLastname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public Date getDeleteAt() {
		return deleteAt;
	}

	public void setDeleteAt(Date deleteAt) {
		this.deleteAt = deleteAt;
	}
		
	public User() {}

	public static final long serialVersionUID = 1L; 
}

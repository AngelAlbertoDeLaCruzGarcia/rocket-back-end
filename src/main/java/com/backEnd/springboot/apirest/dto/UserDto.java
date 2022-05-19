package com.backEnd.springboot.apirest.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.NumberFormat;

import io.micrometer.core.lang.Nullable;

public class UserDto{
	@NotBlank
	private String firstName;
	@Nullable
	private String secondName;
	@NotBlank
	private String firstLastname;
	@NotBlank
	private String secondLastname;
	
	private String birthday;
	@Email
	private String email;
	@NumberFormat
	private String telefono;
	
	private Date createAt;
	private Date updateAt;
	private Date deleteAt;
	
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
		
	public UserDto(String firstName, String secondName, String firstLastname, String secondLastname, String birthday,
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
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
		
	public UserDto() {}

	public static final long serialVersionUID = 1L; 
}

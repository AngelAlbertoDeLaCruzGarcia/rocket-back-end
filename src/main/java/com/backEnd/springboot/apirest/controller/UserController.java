package com.backEnd.springboot.apirest.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backEnd.springboot.apirest.dto.UserDto;
import com.backEnd.springboot.apirest.entity.User;
import com.backEnd.springboot.apirest.excepciones.Mensaje;
import com.backEnd.springboot.apirest.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	@Autowired
	UserService userServ;
	@SuppressWarnings({"rawtypes", "unchecked", "null"})
	@PostMapping("/create")
	public ResponseEntity<?> create(@Valid @RequestBody UserDto userDto, Errors errores){
		try {
			if (errores.hasErrors()) {
				return new ResponseEntity(errores.getFieldErrors(), HttpStatus.BAD_REQUEST);
			}
			SimpleDateFormat isoFormat = new SimpleDateFormat("dd-MM-yyyy"); 
	        isoFormat.setTimeZone(TimeZone.getTimeZone("America/Mexico_City"));
	        Date date = isoFormat.parse(userDto.getBirthday());
	        		
			User user =	new User(userDto.getFirstName(), userDto.getSecondName(), userDto.getFirstLastname(), userDto.getSecondLastname(),
				date, userDto.getEmail(), userDto.getTelefono(), new Date(), userDto.getUpdateAt(),userDto.getDeleteAt()
			);
			 userServ.save(user);
			return new ResponseEntity(new Mensaje("Agregado correctamente"), HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity(e, HttpStatus.BAD_REQUEST);
		}
	} 
}

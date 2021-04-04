package com.bee_studio_mobile.app.ws.controller;

import com.bee_studio_mobile.app.ws.dto.UserDto;
import com.bee_studio_mobile.app.ws.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bee_studio_mobile.app.ws.Model.reponse.request.UserDetailRequestModel;
import com.bee_studio_mobile.app.ws.ui.model.response.UserRest;

/*
 * Ces anotation permet a cette classe de recevoir des requetes http
 *  il est neccessaire d'ajouter ces annotations
 * */
@RestController
@RequestMapping("users") // http://localhoat:8080/users/methods
public class UserController {

	@GetMapping
	public String getUser() {

		return "la methode getUser() a ete appele";

	}

	@PostMapping
	public UserRest createUser(@RequestBody UserDetailRequestModel userDetail) {
		//initialisation de l'interface utilisateur

		@Autowired
		UserService userService;

		//ici je recrois le sinformation de lutilisateur
		UserRest returnValue = new UserRest();
		//ici je convertis les informations
		// utilisateur en le Dto grace a BeanUtils
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetail,userDto);
		//ici je creait un nouvell utilisateu de type UserDto
		//qui est retourner a la fin grace au userService
		//que je convertis encore en type UserRest pour la reponse
		UserDto createUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createUser,returnValue);

		return returnValue;

	}

	@PutMapping
	public String updateUser() {
		return "la methode updateUser a ete appele";

	}

	@DeleteMapping
	public String deleteUser() {
		return "la methode deleteUser a ete appele";

	}

}

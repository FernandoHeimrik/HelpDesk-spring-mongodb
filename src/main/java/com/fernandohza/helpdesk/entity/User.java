package com.fernandohza.helpdesk.entity;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fernandohza.helpdesk.entity.enums.ProfileEnum;

@Document
public class User {

	@Id
	private int Id;
	
	@Indexed(unique= true)
	@NotBlank(message="Email required")
	@Email
	private String email;
	
	@NotBlank(message="Password required")
	@Size(min=6)
	private String password;
	
	private ProfileEnum profile;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public ProfileEnum getProfile() {
		return profile;
	}

	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}
	
	
}

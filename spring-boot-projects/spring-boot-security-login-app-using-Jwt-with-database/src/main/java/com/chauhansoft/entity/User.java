package com.chauhansoft.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User_jwt")
public class User {

	@Id
	@GeneratedValue
	private int userId;
	private String username;
	private String password;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "User_role_jwt",joinColumns =@JoinColumn(name="userId"),inverseJoinColumns = @JoinColumn(name="roleId"))
	private Set<Role> roles;
}

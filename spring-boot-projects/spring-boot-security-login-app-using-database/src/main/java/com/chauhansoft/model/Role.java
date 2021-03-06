package com.chauhansoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Role_security")
@Setter
@Getter
@NoArgsConstructor
public class Role {

	@Id
	@GeneratedValue//(strategy = GenerationType.AUTO)
	private int role_id;
	private String role;
}

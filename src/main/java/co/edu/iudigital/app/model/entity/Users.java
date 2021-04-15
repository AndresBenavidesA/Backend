package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="users")

public class Users implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "users_id")
	private int usersId;
	private String name;
	private String email;
	private String password;
	@Column(name = "createAt")
	private LocalDateTime createAt;
	
	@ManyToOne
	@JoinColumn(name = "profile_id")
	
	private Profile profileId;
	
	
	
	
}

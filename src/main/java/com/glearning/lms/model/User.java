package com.glearning.lms.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private String emailAddress;
    
    @ManyToMany(mappedBy = "users", cascade = CascadeType.PERSIST)
    private Set<Role> roles = new HashSet<>();;

    private User(){}

    public User(String username, String password, String emailAddress){
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
    }
    
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public long getId() {
		return id;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	//scaffolding code
    public void addRole(Role role) {
    	this.roles.add(role);
    	role.getUsers().add(this);
    }

	@Override
	public int hashCode() {
		return Objects.hash(emailAddress, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(emailAddress, other.emailAddress) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", emailAddress=" + emailAddress
				+ "]";
	}
}

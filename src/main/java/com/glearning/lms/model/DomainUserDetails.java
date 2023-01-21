package com.glearning.lms.model;

import static java.util.stream.Collectors.toSet;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class DomainUserDetails implements UserDetails {
	
	private final User user;

	public DomainUserDetails(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.user
				.getRoles()
				.stream()
				.map(Role::getRole)
				.map(SimpleGrantedAuthority::new)
				.collect(toSet());
	}

	@Override
	public String getPassword() {
		System.out.println("Inside the getPassword method ");
		System.out.println("Password :: "+ this.user.getPassword());
		return this.user.getPassword();
	}

	@Override
	public String getUsername() {
		return this.user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}

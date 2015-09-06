package net.dontdrinkandroot.example.angularrestspringsecurity.entity;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


@javax.persistence.Entity
public class Member implements Entity, UserDetails
{

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true, length = 16, nullable = false)
	private String name;
	
	@Column
	private Long age;
	
	@Column
	private Date date;
	

	public Member(Long id, String name, Long age, Date date) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.date = date;
	}





	public Long getAge() {
		return age;
	}





	public void setAge(Long age) {
		this.age = age;
	}





	public Date getDate() {
		return date;
	}





	public void setDate(Date date) {
		this.date = date;
	}





	protected Member()
	{
		/* Reflection instantiation */
	}

	
	


	public Long getId()
	{
		return this.id;
	}


	public void setId(Long id)
	{
		this.id = id;
	}


	public String getName()
	{
		return this.name;
	}


	public void setName(String name)
	{
		this.name = name;
	}



	@Override
	public String getUsername()
	{
		return this.name;
	}


	@Override
	public boolean isEnabled()
	{
		return true;
	}





	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}





	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}





	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

}
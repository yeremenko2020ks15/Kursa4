package com.example.accessingdatamysql;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Company implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String Name;
	private String Email;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private OilType oilType;

	public Company() {
	}

	public Company(String Name, String email, OilType oilType) {
		this.Name = Name;
		this.Email = email;
		this.oilType = oilType;
	}

	@Override
	public String toString() {
		return "Company{" +
				"id=" + id +
				", Name='" + Name + '\'' +
				", Email='" + Email + '\'' +
				", oilType=" + oilType +
				'}';
	}
}
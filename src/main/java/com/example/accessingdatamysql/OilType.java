package com.example.accessingdatamysql;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class OilType implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private double stock_volume;

	@Column(unique = true)
	private String oil_type;



	@OneToMany(mappedBy = "oilType", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private Set<Company> companies;

	public OilType() {
	}

	public OilType(String oil_type, double stock_volume) {
		this.oil_type = oil_type;
		this.stock_volume = stock_volume;
	}

	@Override
	public String toString() {
		return "OilType{" +
				"id=" + id +
				", oil_type='" + oil_type + '\'' +
				", stock_volume=" + stock_volume +
				'}';
	}


}
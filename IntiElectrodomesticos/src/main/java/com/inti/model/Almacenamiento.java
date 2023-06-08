package com.inti.model;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "tb_almacenamiento")
@Data
public class Almacenamiento {
	
	@Id
	private int id_alm;
	private String nomb_alm;
	
}

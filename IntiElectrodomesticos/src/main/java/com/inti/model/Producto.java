package com.inti.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "tb_producto")
@Data
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prod;
	private int id_alm;
	private int id_marc;
	private int stock_prod;
	private double precio_prod;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_alm", insertable = false, updatable = false)
	private Almacenamiento objAlm;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_marc", insertable = false, updatable = false)
	private Marca objMarc;

}

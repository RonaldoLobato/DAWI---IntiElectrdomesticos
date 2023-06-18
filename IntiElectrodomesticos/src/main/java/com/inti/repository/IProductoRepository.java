package com.inti.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.inti.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer>{
	

}

package foi.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import foi.ejercicio3.dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, Integer>{

}

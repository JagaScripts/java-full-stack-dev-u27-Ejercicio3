package foi.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import foi.ejercicio3.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}

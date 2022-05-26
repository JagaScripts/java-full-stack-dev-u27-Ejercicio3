package foi.ejercicio3.service;

import java.util.List;

import foi.ejercicio3.dto.Productos;

public interface IProductosService {

	//Metodos del CRUD
		public List<Productos> listarProductos(); 
		
		public Productos guardarProductos(Productos productos);	
		
		public Productos ProductosXID(int codigo); 
		
		public Productos actualizarProductos(Productos productos); 
		
		public void eliminarProductos(int codigo);
	
}

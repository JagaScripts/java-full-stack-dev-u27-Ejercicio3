package foi.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import foi.ejercicio3.dao.IVentaDAO;
import foi.ejercicio3.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService{
	
	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Venta> listarVenta() {
		return iVentaDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public Venta ventaXID(int codigo) {
		return iVentaDAO.findById(codigo).get();
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int codigo) {
		iVentaDAO.deleteById(codigo);		
	}
	
	

}

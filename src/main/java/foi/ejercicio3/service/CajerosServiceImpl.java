package foi.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import foi.ejercicio3.dao.ICajerosDAO;
import foi.ejercicio3.dto.Cajeros;

@Service
public class CajerosServiceImpl implements ICajerosService {

	@Autowired
	ICajerosDAO iCajerosDAO;

	@Override
	public List<Cajeros> listarCajeros() {
		// TODO Auto-generated method stub
		return iCajerosDAO.findAll();
	}

	@Override
	public Cajeros guardarCajeros(Cajeros cajeros) {
		// TODO Auto-generated method stub
		return iCajerosDAO.save(cajeros);
	}

	@Override
	public Cajeros cajerosXID(int codigo) {
		// TODO Auto-generated method stub
		return iCajerosDAO.findById(codigo).get();
	}

	@Override
	public Cajeros actualizarCajeros(Cajeros cajeros) {
		// TODO Auto-generated method stub
		return iCajerosDAO.save(cajeros);
		
	}

	@Override
	public void eliminarCajeros(int codigo) {
		iCajerosDAO.deleteById(codigo);
	}

}

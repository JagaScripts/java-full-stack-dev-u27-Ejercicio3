package foi.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import foi.ejercicio3.dao.IMaquinasRegistradorasDAO;
import foi.ejercicio3.dto.MaquinasRegistradoras;

@Service
public class MaquinasRegistradorasServiceImpl implements IMaquinasRegistradorasService{

	@Autowired
	IMaquinasRegistradorasDAO iMaquinasRegistradorasDAO;

	@Override
	public List<MaquinasRegistradoras> listarMaquinasRegistradoras() {
		return iMaquinasRegistradorasDAO.findAll();
	}

	@Override
	public MaquinasRegistradoras guardarMaquinasRegistradoras(MaquinasRegistradoras maquinasRegistradoras) {
		return iMaquinasRegistradorasDAO.save(maquinasRegistradoras);
	}

	@Override
	public MaquinasRegistradoras MaquinasRegistradorasXID(int codigo) {
		return iMaquinasRegistradorasDAO.findById(codigo).get();
	}

	@Override
	public MaquinasRegistradoras actualizarMaquinasRegistradoras(MaquinasRegistradoras maquinasRegistradoras) {
		return iMaquinasRegistradorasDAO.save(maquinasRegistradoras);
	}

	@Override
	public void eliminarMaquinasRegistradoras(int codigo) {
		iMaquinasRegistradorasDAO.deleteById(codigo);		
	}
	
	
}

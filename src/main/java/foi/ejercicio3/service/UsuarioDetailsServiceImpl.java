package foi.ejercicio3.service;

import static java.util.Collections.emptyList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import foi.ejercicio3.dao.IUsuarioDAO;
import foi.ejercicio3.dto.Usuario;

@Service
public class UsuarioDetailsServiceImpl implements UserDetailsService {

	private IUsuarioDAO iUsuarioDAO;

	public UsuarioDetailsServiceImpl(IUsuarioDAO iUsuarioDAO) {
		this.iUsuarioDAO = iUsuarioDAO;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = iUsuarioDAO.findByUsername(username);
		if (usuario == null) {
			throw new UsernameNotFoundException(username);
		}
		return new User(usuario.getUsername(), usuario.getPassword(), emptyList());
	}
	
}

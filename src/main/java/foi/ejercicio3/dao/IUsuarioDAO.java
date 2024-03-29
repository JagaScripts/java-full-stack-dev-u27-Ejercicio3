package foi.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import foi.ejercicio3.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}
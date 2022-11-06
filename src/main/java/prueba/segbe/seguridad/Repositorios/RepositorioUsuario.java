package prueba.segbe.seguridad.Repositorios;
import prueba.segbe.seguridad.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioUsuario extends
        MongoRepository<Usuario,String> {
}
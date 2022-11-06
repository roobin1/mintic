package prueba.segbe.seguridad.Repositorios;
import prueba.segbe.seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioRol extends
        MongoRepository<Rol,String> {
}
package prueba.segbe.seguridad.Repositorios;
import prueba.segbe.seguridad.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioPermiso extends
        MongoRepository<Permiso,String> {
}

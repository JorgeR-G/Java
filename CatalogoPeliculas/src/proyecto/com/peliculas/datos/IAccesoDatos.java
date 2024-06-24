package proyecto.com.peliculas.datos;

import java.util.List;
import proyecto.com.peliculas.domain.Pelicula;
import proyecto.com.peliculas.excepciones.*;

public interface IAccesoDatos {

	boolean existe(String nombreRecurso) throws AccesoDatosEx;

	List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

	void escribir(Pelicula pelicula, String nombreRecursos, boolean anexar) throws EscrituraDatosEx;

	String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

	void crear(String nombreRecurso) throws AccesoDatosEx;

	void borrar(String nombreRecurso) throws AccesoDatosEx;
}


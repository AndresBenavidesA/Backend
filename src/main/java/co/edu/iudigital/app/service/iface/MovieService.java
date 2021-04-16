package co.edu.iudigital.app.service.iface;

import java.util.List;

import co.edu.iudigital.app.model.entity.Movie;

public interface MovieService {
	/**
	 * Obtener todas las peliculas
	 * @return
	 */
	public List<Movie> getAll();
	/**
	 * Crear pelicula
	 * @param movie
	 */
	public void create(Movie movie);
	
	/**
	 * Editar una pelicula por su Id
	 * @param movie
	 * @param movieId
	 */
	public void edit(Movie movie, int movieId);	
	
	/**
	 * Borra una pelicula por su Id
	 * @param movieId
	 */
	public void delete(int movieId);
	
	/**
	 * Calificar pelicula por Id
	 * @param movie
	 * @param movieId
	 */
	public void rate(Movie movie, int movieId);
	
	
}

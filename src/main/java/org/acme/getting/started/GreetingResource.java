package org.acme.getting.started;

import org.acme.getting.started.response.CalificacionResponse;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
	/**
	 * Inyeccion del servicio
	 */
	@Inject
	GreetingService<?> service;

	/**
	 * Metodo con el param
	 *
	 * @param idEstudiante
	 * @return retorno datos del estudiante
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public CalificacionResponse<?> getCalificacion(@QueryParam(value = "idEstudiante") long idEstudiante) {
		/**
		 * Retorno del objeto
		 */
		return service.getCalificacion(idEstudiante);

	}
}
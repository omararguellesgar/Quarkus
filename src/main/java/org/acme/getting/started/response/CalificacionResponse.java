/**
 * 
 */
package org.acme.getting.started.response;

import java.util.List;

/**
 * @author omara
 *
 */
public class CalificacionResponse<Calificacion> {

	private List<Calificacion> calificaciones;

	/**
	 * @param calificaciones
	 */
	public CalificacionResponse(List<Calificacion> calificaciones) {
		super();
		this.calificaciones = calificaciones;
	}

	/**
	 * @return the calificaciones
	 */
	public List<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	/**
	 * @param calificaciones the calificaciones to set
	 */
	public void setCalificaciones(List<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

	@Override
	public String toString() {
		return "CalificacionResponse [calificaciones=" + calificaciones + "]";
	}

}

package com.nttdata.spring.repository;

/**
 * 
 * @author Jose
 *
 *         Interfaz del repositorio personalizado
 */
public interface CustomCustomerRepository {

	/**
	 * Busca un cliente por nombre y apellidos
	 * 
	 * @param name     (nombre)
	 * @param surnames (apellidos)
	 * @return customer
	 */
	public Customer getCustomerByNameAndSurnames(final String name, final String surnames);

}

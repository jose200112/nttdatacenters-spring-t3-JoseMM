package com.nttdata.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Jose
 * 
 *         Repositorio de clientes
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomCustomerRepository {

}

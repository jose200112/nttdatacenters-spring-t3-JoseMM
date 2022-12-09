package com.nttdata.spring.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * 
 * @author Jose
 *
 *         Repositorio personalizado
 */
public class CustomCustomerRepositoryImpl implements CustomCustomerRepository {

	@PersistenceContext
	EntityManager em;

	@Override
	public Customer getCustomerByNameAndSurnames(final String name, final String surnames) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);

		Root<Customer> customer = cq.from(Customer.class);

		final Predicate p1 = cb.like(customer.<String>get("name"), name);
		final Predicate p2 = cb.like(customer.<String>get("surnames"), surnames);

		cq.select(customer).where(cb.and(p1, p2));

		return em.createQuery(cq).getResultList().get(0);
	}

}

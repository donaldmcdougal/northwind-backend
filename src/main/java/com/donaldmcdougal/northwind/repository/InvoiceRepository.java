/**
 * 
 */
package com.donaldmcdougal.northwind.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.donaldmcdougal.northwind.domain.Invoice;

/**
 * @author Donald McDougal
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "invoices", path = "invoices")
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

	Optional<Invoice> findOneById(@Param("id") Long id);
	
	@Query("select i from Invoice i where i.order.id = :id")
	List<Invoice> findAllByOrder(@Param("id") Long id);
}

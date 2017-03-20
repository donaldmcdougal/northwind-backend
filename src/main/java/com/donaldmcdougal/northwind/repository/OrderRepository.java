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

import com.donaldmcdougal.northwind.domain.Order;

/**
 * @author Donald McDougal
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")
public interface OrderRepository extends JpaRepository<Order, Long> {

	Optional<Order> findOneById(@Param("id") Long id);
	
	@Query("select o from Order o where o.employee.id = :id")
	List<Order> findAllByEmployee(@Param("id") Long id);
	
	@Query("select o from Order o where o.customer.id = :id")
	List<Order> findAllByCustomer(@Param("id") Long id);
	
	@Query("select o from Order o where o.shipper.id = :id")
	List<Order> findAllByShipper(@Param("id") Long id);
	
	@Query("select o from Order o where o.taxStatus.id = :id")
	List<Order> findAllByTaxStatus(@Param("id") Integer id);
	
	@Query("select o from Order o where o.status.id = :id")
	List<Order> findAllByStatus(@Param("id") Integer id);
}

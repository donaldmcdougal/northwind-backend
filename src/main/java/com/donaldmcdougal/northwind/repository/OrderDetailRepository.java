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

import com.donaldmcdougal.northwind.domain.OrderDetail;

/**
 * @author Donald McDougal
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "orderDetails", path = "orderDetails")
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

	Optional<OrderDetail> findOneById(@Param("id") Long id);
	
	@Query("select i from OrderDetail i where i.order.id = :id")
	List<OrderDetail> findAllByOrder(@Param("id") Long id);
	
	@Query("select i from OrderDetail i where i.product.id = :id")
	List<OrderDetail> findAllByProduct(@Param("id") Long id);
	
	@Query("select i from OrderDetail i where i.status.id = :id")
	List<OrderDetail> findAllByStatus(@Param("id") Long id);
	
	List<OrderDetail> findAllByPurchaseOrderId(@Param("id") Long purchaseOrderId);
	
	List<OrderDetail> findAllByInventoryId(@Param("id") Long inventoryId);
}

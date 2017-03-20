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

import com.donaldmcdougal.northwind.domain.PurchaseOrderDetail;

/**
 * @author Donald McDougal
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "purchaseOrderDetails", path = "purchaseOrderDetails")
public interface PurchaseOrderDetailRepository extends JpaRepository<PurchaseOrderDetail, Long> {

	Optional<PurchaseOrderDetail> findOneById(@Param("id") Long id);
	
	@Query("select pod from PurchaseOrderDetail pod where pod.purchaseOrder.id = :id")
	List<PurchaseOrderDetail> findAllByPurchaseOrder(@Param("id") Long id);
	
	@Query("select pod from PurchaseOrderDetail pod where pod.product.id = :id")
	List<PurchaseOrderDetail> findAllByProduct(@Param("id") Long id);
	
	@Query("select pod from PurchaseOrderDetail pod where pod.inventoryTransaction.id = :id")
	List<PurchaseOrderDetail> findAllByInventoryTransaction(@Param("id") Long id);
}

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

import com.donaldmcdougal.northwind.domain.PurchaseOrder;

/**
 * @author Donald McDougal
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "purchaseOrders", path = "purchaseOrders")
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {

	Optional<PurchaseOrder> findOneById(@Param("id") Long id);
	
	@Query("select po from PurchaseOrder po where po.supplier.id = :id")
	List<PurchaseOrder> findAllBySupplier(@Param("id") Long id);
	
	@Query("select po from PurchaseOrder po where po.createdBy.id = :id")
	List<PurchaseOrder> findAllByCreatedBy(@Param("id") Long id);
	
	@Query("select po from PurchaseOrder po where po.status.id = :id")
	List<PurchaseOrder> findAllByStatus(@Param("id") Long id);
	
	@Query("select po from PurchaseOrder po where po.approvedBy.id = :id")
	List<PurchaseOrder> findAllByApprovedBy(@Param("id") Long id);
	
	@Query("select po from PurchaseOrder po where po.submittedBy.id = :id")
	List<PurchaseOrder> findAllBySubmittedBy(@Param("id") Long id);
}

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

import com.donaldmcdougal.northwind.domain.InventoryTransaction;

/**
 * @author Donald McDougal
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "inventoryTransactions", path = "inventoryTransactions")
public interface InventoryTransactionRepository extends JpaRepository<InventoryTransaction, Long> {

	Optional<InventoryTransaction> findOneById(@Param("id") Long id);
	
	@Query("select it from InventoryTransaction it where it.transactionType.id = :id")
	List<InventoryTransaction> findAllByTransactionType(@Param("id") Integer id);
	
	@Query("select it from InventoryTransaction it where it.product.id = :id")
	List<InventoryTransaction> findAllByProduct(@Param("id") Long id);
	
	@Query("select it from InventoryTransaction it where it.purchaseOrder.id = :id")
	List<InventoryTransaction> findAllByPurchaseOrder(@Param("id") Long id);
	
	@Query("select it from InventoryTransaction it where it.customerOrder.id = :id")
	List<InventoryTransaction> findAllByCustomerOrder(@Param("id") Long id);
}

/**
 * 
 */
package com.donaldmcdougal.northwind.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.donaldmcdougal.northwind.domain.InventoryTransactionType;

/**
 * @author Donald McDougal
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "inventoryTransactionTypes", path = "inventoryTransactionTypes")
public interface InventoryTransactionTypeRepository extends JpaRepository<InventoryTransactionType, Integer> {

	Optional<InventoryTransactionType> findOneById(@Param("id") Long id);
}

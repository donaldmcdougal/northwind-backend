/**
 * 
 */
package com.donaldmcdougal.northwind.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.donaldmcdougal.northwind.domain.PurchaseOrderStatus;

/**
 * @author Donald McDougal
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "purchaseOrderStatuses", path = "purchaseOrderStatuses")
public interface PurchaseOrderStatusRepository extends JpaRepository<PurchaseOrderStatus, Long> {

	Optional<PurchaseOrderStatus> findOneById(@Param("id") Long id);
}

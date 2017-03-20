/**
 * 
 */
package com.donaldmcdougal.northwind.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.donaldmcdougal.northwind.domain.OrderTaxStatus;

/**
 * @author Donald McDougal
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "orderTaxStatuses", path = "orderTaxStatuses")
public interface OrderTaxStatusRepository extends JpaRepository<OrderTaxStatus, Integer> {

	Optional<OrderTaxStatus> findOneById(@Param("id") Integer id);
}

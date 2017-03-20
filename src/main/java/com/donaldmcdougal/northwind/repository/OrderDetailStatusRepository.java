/**
 * 
 */
package com.donaldmcdougal.northwind.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.donaldmcdougal.northwind.domain.OrderDetailStatus;

/**
 * @author Donald McDougal
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "orderDetailStatuses", path = "orderDetailStatuses")
public interface OrderDetailStatusRepository extends JpaRepository<OrderDetailStatus, Long> {

	Optional<OrderDetailStatus> findOneById(@Param("id") Long id);
}

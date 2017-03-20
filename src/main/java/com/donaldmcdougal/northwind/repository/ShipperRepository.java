/**
 * 
 */
package com.donaldmcdougal.northwind.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.donaldmcdougal.northwind.domain.Shipper;

/**
 * @author Donald McDougal
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "shippers", path = "shippers")
public interface ShipperRepository extends JpaRepository<Shipper, Long> {

	Optional<Shipper> findOneById(@Param("id") Long id);
}

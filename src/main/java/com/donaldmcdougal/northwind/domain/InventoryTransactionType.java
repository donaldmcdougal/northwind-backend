/**
 * 
 */
package com.donaldmcdougal.northwind.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author Donald McDougal
 *
 */
@Entity
@Table(name = "inventory_transaction_types")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class InventoryTransactionType {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	@Column(name = "type_name")
	@Size(max = 50)
	@NotNull
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

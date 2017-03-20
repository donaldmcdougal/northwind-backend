/**
 * 
 */
package com.donaldmcdougal.northwind.domain;

import java.math.BigDecimal;

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
@Table(name = "products")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Product {
	
	@Column(name = "supplier_ids")
	private String supplierIds;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(name = "product_code")
	@Size(max = 25)
	private String productCode;

	@Column(name = "product_name")
	@Size(max = 50)
	private String productName;
	
	private String description;
	
	@Column(name = "standard_cost")
	private BigDecimal standardCost;
	
	@NotNull
	@Column(name = "list_price")
	private BigDecimal listPrice;
	
	@Column(name = "reorder_level")
	private Long reorderLevel;
	
	@Column(name = "target_level")
	private Long targetLevel;
	
	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;

	@NotNull
	private Boolean discontinued;
	
	@Column(name = "minimum_reorder_quantity")
	private Long minimumReorderQuantity;
	
	@Size(max = 50)
	private String category;
	
	private byte[] attachments;

	public String getSupplierIds() {
		return supplierIds;
	}

	public void setSupplierIds(String supplierIds) {
		this.supplierIds = supplierIds;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getStandardCost() {
		return standardCost;
	}

	public void setStandardCost(BigDecimal standardCost) {
		this.standardCost = standardCost;
	}

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	public Long getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(Long reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public Long getTargetLevel() {
		return targetLevel;
	}

	public void setTargetLevel(Long targetLevel) {
		this.targetLevel = targetLevel;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public Boolean getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}

	public Long getMinimumReorderQuantity() {
		return minimumReorderQuantity;
	}

	public void setMinimumReorderQuantity(Long minimumReorderQuantity) {
		this.minimumReorderQuantity = minimumReorderQuantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public byte[] getAttachments() {
		return attachments;
	}

	public void setAttachments(byte[] attachments) {
		this.attachments = attachments;
	}
}

/**
 * 
 */
package com.donaldmcdougal.northwind.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author Donald McDougal
 *
 */
@Entity
@Table(name = "purchase_order_details")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PurchaseOrderDetail {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "purchase_order_id")
	private PurchaseOrder purchaseOrder;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Product product;
	
	private BigDecimal quantity;
	
	@Column(name = "unit_cost")
	private BigDecimal unitCost;
	
	@Column(name = "date_received")
	private Date dateReceived;
	
	@NotNull
	@Column(name = "posted_to_inventory")
	private Boolean postedToInventory;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "inventory_id")
	private InventoryTransaction inventoryTransaction;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}

	public Date getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	public Boolean getPostedToInventory() {
		return postedToInventory;
	}

	public void setPostedToInventory(Boolean postedToInventory) {
		this.postedToInventory = postedToInventory;
	}

	public InventoryTransaction getInventoryTransaction() {
		return inventoryTransaction;
	}

	public void setInventoryTransaction(InventoryTransaction inventoryTransaction) {
		this.inventoryTransaction = inventoryTransaction;
	}
}

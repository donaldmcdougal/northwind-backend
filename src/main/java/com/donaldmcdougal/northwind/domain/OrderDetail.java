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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author Donald McDougal
 *
 */
@Entity
@Table(name = "order_details")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OrderDetail {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Product product;
	
	private BigDecimal quantity;
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	private Double discount;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "status_id")
	private OrderDetailStatus status;
	
	@Column(name = "date_allocated")
	private Date dateAllocated;
	
	@Column(name = "purchase_order_id")
	private Long purchaseOrderId;
	
	@Column(name = "inventory_id")
	private Long inventoryId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
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

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public OrderDetailStatus getStatus() {
		return status;
	}

	public void setStatus(OrderDetailStatus status) {
		this.status = status;
	}

	public Date getDateAllocated() {
		return dateAllocated;
	}

	public void setDateAllocated(Date dateAllocated) {
		this.dateAllocated = dateAllocated;
	}

	public Long getPurchaseOrderId() {
		return purchaseOrderId;
	}

	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}
}

/**
 * 
 */
package com.donaldmcdougal.northwind.domain;

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
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author Donald McDougal
 *
 */
@Entity
@Table(name = "inventory_transactions")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class InventoryTransaction {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "transaction_type")
	private InventoryTransactionType transactionType;
	
	@Column(name = "transaction_created_date")
	private Date transactionCreatedDate;
	
	@Column(name = "transaction_modified_date")
	private Date transactionModifiedDate;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Product product;
	
	@NotNull
	private Long quantity;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "purchase_order_id")
	private PurchaseOrder purchaseOrder;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_order_id")
	private Order customerOrder;
	
	@Size(max = 255)
	private String comments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public InventoryTransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(InventoryTransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public Date getTransactionCreatedDate() {
		return transactionCreatedDate;
	}

	public void setTransactionCreatedDate(Date transactionCreatedDate) {
		this.transactionCreatedDate = transactionCreatedDate;
	}

	public Date getTransactionModifiedDate() {
		return transactionModifiedDate;
	}

	public void setTransactionModifiedDate(Date transactionModifiedDate) {
		this.transactionModifiedDate = transactionModifiedDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public Order getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(Order customerOrder) {
		this.customerOrder = customerOrder;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}

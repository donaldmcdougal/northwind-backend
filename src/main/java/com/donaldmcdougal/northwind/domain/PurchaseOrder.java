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
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author Donald McDougal
 *
 */
@Entity
@Table(name = "purchase_orders")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PurchaseOrder {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "created_by")
	private Employee createdBy;
	
	@Column(name = "submitted_date")
	private Date submittedDate;
	
	@Column(name = "creation_date")
	private Date creationDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "status_id")
	private PurchaseOrderStatus status;
	
	@Column(name = "expected_date")
	private Date expectedDate;
	
	@NotNull
	@Column(name = "shipping_fee")
	private BigDecimal shippingFee;
	
	@NotNull
	private BigDecimal taxes;
	
	@Column(name = "payment_date")
	private Date paymentDate;
	
	@Column(name = "payment_amount")
	private BigDecimal paymentAmount;
	
	@Column(name = "payment_method")
	@Size(max = 50)
	private String paymentMethod;
	
	private String notes;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "approved_by")
	private Employee approvedBy;
	
	@Column(name = "approved_date")
	private Date approvedDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "submitted_by")
	private Employee submittedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Employee getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}

	public Date getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public PurchaseOrderStatus getStatus() {
		return status;
	}

	public void setStatus(PurchaseOrderStatus status) {
		this.status = status;
	}

	public Date getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}

	public BigDecimal getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(BigDecimal shippingFee) {
		this.shippingFee = shippingFee;
	}

	public BigDecimal getTaxes() {
		return taxes;
	}

	public void setTaxes(BigDecimal taxes) {
		this.taxes = taxes;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Employee getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(Employee approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public Employee getSubmittedBy() {
		return submittedBy;
	}

	public void setSubmittedBy(Employee submittedBy) {
		this.submittedBy = submittedBy;
	}
}

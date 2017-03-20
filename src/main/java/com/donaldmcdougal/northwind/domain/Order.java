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
@Table(name = "orders")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Column(name = "order_date")
	private Date orderDate;
	
	@Column(name = "shipped_date")
	private Date shippedDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "shipper_id")
	private Shipper shipper;
	
	@Column(name = "ship_name")
	private String shipName;
	
	@Column(name = "ship_address")
	private String shipAddress;

	@Column(name = "ship_city")
	private String shipCity;

	@Column(name = "ship_state_province")
	private String shipStateProvince;

	@Column(name = "ship_zip_postal_code")
	private String shipZipPostalCode;

	@Column(name = "ship_country_region")
	private String shipCountryRegion;
	
	@Column(name = "shipping_fee")
	private BigDecimal shippingFee;
	
	private BigDecimal taxes;
	
	@Column(name = "payment_type")
	private String paymentType;
	
	@Column(name = "paid_date")
	private Date paidDate;
	
	private String notes;
	
	@Column(name = "tax_rate")
	private Double taxRate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tax_status_id")
	private OrderTaxStatus taxStatus;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "status_id")
	private OrderStatus status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public Shipper getShipper() {
		return shipper;
	}

	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public String getShipCity() {
		return shipCity;
	}

	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	public String getShipStateProvince() {
		return shipStateProvince;
	}

	public void setShipStateProvince(String shipStateProvince) {
		this.shipStateProvince = shipStateProvince;
	}

	public String getShipZipPostalCode() {
		return shipZipPostalCode;
	}

	public void setShipZipPostalCode(String shipZipPostalCode) {
		this.shipZipPostalCode = shipZipPostalCode;
	}

	public String getShipCountryRegion() {
		return shipCountryRegion;
	}

	public void setShipCountryRegion(String shipCountryRegion) {
		this.shipCountryRegion = shipCountryRegion;
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

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public OrderTaxStatus getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(OrderTaxStatus taxStatus) {
		this.taxStatus = taxStatus;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
}

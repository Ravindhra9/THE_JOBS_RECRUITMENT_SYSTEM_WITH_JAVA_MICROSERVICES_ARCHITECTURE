package com.admin_service.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	private Integer paymentId;
	private Integer employerId;
	private String cardNumber;
	private String nameOnCard;
	private LocalDate expiryDate;
	private String cvv;
	private String accountBalance;
	
	public Payment() {
		super();
	}

	public Payment(Integer paymentId, Integer employerId, String cardNumber, String nameOnCard, LocalDate expiryDate,
			String cvv, String accountBalance) {
		super();
		this.paymentId = paymentId;
		this.employerId = employerId;
		this.cardNumber = cardNumber;
		this.nameOnCard = nameOnCard;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.accountBalance = accountBalance;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Integer getEmployerId() {
		return employerId;
	}

	public void setEmployerId(Integer employerId) {
		this.employerId = employerId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", employerId=" + employerId + ", cardNumber=" + cardNumber
				+ ", nameOnCard=" + nameOnCard + ", expiryDate=" + expiryDate + ", cvv=" + cvv + ", accountBalance="
				+ accountBalance + "]";
	}
	
	
	
}

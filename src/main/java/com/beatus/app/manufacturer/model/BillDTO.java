package com.beatus.app.manufacturer.model;

import java.util.List;

public class BillDTO {

	private String billNumber;
	private String billFromContactId;
	private String billToContactId;
	private String companyId;
	private String uid;
	private List<ItemDTO> items;
	private String dateOfBill;
	private String dueDate;
	private Double totalAmount;
	private Double totalTax;
	private Double totalCGST;
	private Double totalSGST;
	private Double totalIGST;
	private String referenceMobileNumber;
	private String referenceAadharCardNumber;
	private String isTaxeble;
	private String isUpdated;
	private String isDeleted;
	private String year;
	private String month;
	private String day;
	
	public String getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public String getBillFromContactId() {
		return billFromContactId;
	}
	public void setBillFromContactId(String billFromContactId) {
		this.billFromContactId = billFromContactId;
	}
	public String getBillToContactId() {
		return billToContactId;
	}
	public void setBillToContactId(String billToContactId) {
		this.billToContactId = billToContactId;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getDateOfBill() {
		return dateOfBill;
	}
	public void setDateOfBill(String dateOfBill) {
		this.dateOfBill = dateOfBill;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
	public String getIsUpdated() {
		return isUpdated;
	}
	public void setIsUpdated(String isUpdated) {
		this.isUpdated = isUpdated;
	}
	public String getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getIsTaxeble() {
		return isTaxeble;
	}
	public void setIsTaxeble(String isTaxeble) {
		this.isTaxeble = isTaxeble;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getReferenceMobileNumber() {
		return referenceMobileNumber;
	}
	public void setReferenceMobileNumber(String referenceMobileNumber) {
		this.referenceMobileNumber = referenceMobileNumber;
	}
	public String getReferenceAadharCardNumber() {
		return referenceAadharCardNumber;
	}
	public void setReferenceAadharCardNumber(String referenceAadharCardNumber) {
		this.referenceAadharCardNumber = referenceAadharCardNumber;
	}
	public Double getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(Double totalTax) {
		this.totalTax = totalTax;
	}
	public Double getTotalCGST() {
		return totalCGST;
	}
	public void setTotalCGST(Double totalCGST) {
		this.totalCGST = totalCGST;
	}
	public Double getTotalSGST() {
		return totalSGST;
	}
	public void setTotalSGST(Double totalSGST) {
		this.totalSGST = totalSGST;
	}
	public Double getTotalIGST() {
		return totalIGST;
	}
	public void setTotalIGST(Double totalIGST) {
		this.totalIGST = totalIGST;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
}

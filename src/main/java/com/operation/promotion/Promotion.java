package com.operation.promotion;

public class Promotion {

   private int promotionId;
   private int adId;
   private String promotionCategory;
   private String email;
   private String cardNumber;
   private String expireDate;
   private String cvv;
   private String cardHolderName;
   private String mfs;
   private String mfsNumber;
   private String tsNumber;
   private double subTotal;
   private double vat;
   private double total;
   
public Promotion(int promotionId, int adId, String promotionCategory, String email, String cardNumber,
		String expireDate, String cvv, String cardHolderName, String mfs, String mfsNumber, String tsNumber,
		double subTotal, double vat, double total) {
	super();
	this.promotionId = promotionId;
	this.adId = adId;
	this.promotionCategory = promotionCategory;
	this.email = email;
	this.cardNumber = cardNumber;
	this.expireDate = expireDate;
	this.cvv = cvv;
	this.cardHolderName = cardHolderName;
	this.mfs = mfs;
	this.mfsNumber = mfsNumber;
	this.tsNumber = tsNumber;
	this.subTotal = subTotal;
	this.vat = vat;
	this.total = total;
}
public Promotion() {
	super();
	// TODO Auto-generated constructor stub
}
public int getPromotionId() {
	return promotionId;
}
public void setPromotionId(int promotionId) {
	this.promotionId = promotionId;
}
public int getAdId() {
	return adId;
}
public void setAdId(int adId) {
	this.adId = adId;
}
public String getPromotionCategory() {
	return promotionCategory;
}
public void setPromotionCategory(String promotionCategory) {
	this.promotionCategory = promotionCategory;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCardNumber() {
	return cardNumber;
}
public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}
public String getExpireDate() {
	return expireDate;
}
public void setExpireDate(String expireDate) {
	this.expireDate = expireDate;
}
public String getCvv() {
	return cvv;
}
public void setCvv(String cvv) {
	this.cvv = cvv;
}
public String getCardHolderName() {
	return cardHolderName;
}
public void setCardHolderName(String cardHolderName) {
	this.cardHolderName = cardHolderName;
}
public String getMfs() {
	return mfs;
}
public void setMfs(String mfs) {
	this.mfs = mfs;
}
public String getMfsNumber() {
	return mfsNumber;
}
public void setMfsNumber(String mfsNumber) {
	this.mfsNumber = mfsNumber;
}
public String getTsNumber() {
	return tsNumber;
}
public void setTsNumber(String tsNumber) {
	this.tsNumber = tsNumber;
}
public double getSubTotal() {
	return subTotal;
}
public void setSubTotal(double subTotal) {
	this.subTotal = subTotal;
}
public double getVat() {
	return vat;
}
public void setVat(double vat) {
	this.vat = vat;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
   
}

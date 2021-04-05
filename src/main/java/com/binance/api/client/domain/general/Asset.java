package com.binance.api.client.domain.general;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * An asset Binance supports. Representing the provided Asset model. <a href=
 * "https://binance-docs.github.io/apidocs/spot/en/#get-all-margin-assets-market_data">See
 * Doku</a>
 */
 @JsonIgnoreProperties(ignoreUnknown = true)
 public class Asset {

   @JsonProperty("assetName")
   private String assetName;

	@JsonProperty("assetFullName")
	private String assetFullName;

	@JsonProperty("isBorrowable")
	private boolean borrowable;

	@JsonProperty("isMortgageable")
	private boolean mortgageable;

	@JsonProperty("userMinBorrow")
	private double userMinBorrow;

	@JsonProperty("userMinRepay")
	private double userMinRepay;

   public String getAssetName() {
     return assetName;
   }

	public void setAssetName(String assetName) {
		this.assetName = assetName;
   }

	public String getAssetFullName() {
		return assetFullName;
   }

	public void setAssetFullName(String assetFullName) {
		this.assetFullName = assetFullName;
   }

	public boolean isBorrowable() {
		return borrowable;
   }

	public void setBorrowable(boolean borrowable) {
		this.borrowable = borrowable;
   }

	public boolean isMortgageable() {
		return mortgageable;
   }

	public void setMortgageable(boolean mortgageable) {
		this.mortgageable = mortgageable;
   }

	public double getUserMinBorrow() {
		return userMinBorrow;
   }

	public void setUserMinBorrow(double userMinBorrow) {
		this.userMinBorrow = userMinBorrow;
   }

	public double getUserMinRepay() {
		return userMinRepay;
   }

	public void setUserMinRepay(double userMinRepay) {
		this.userMinRepay = userMinRepay;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("assetName", assetName)
				.append("assetFullName", assetFullName)
				.append("isBorrowable", borrowable)
				.append("isMortgageable", mortgageable)
				.append("userMinBorrow", userMinBorrow)
				.append("userMinRepay", userMinRepay)
				.toString();
	}
}

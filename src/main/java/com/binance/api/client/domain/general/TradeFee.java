package com.binance.api.client.domain.general;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An TradeFee Binance supports.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TradeFee {

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("makerCommission")
	private double maker;

	@JsonProperty("takerCommission")
	private double taker;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getMaker() {
		return maker;
	}

	public void setMaker(double maker) {
		this.maker = maker;
	}

	public double getTaker() {
		return taker;
	}

	public void setTaker(double taker) {
		this.taker = taker;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
				.append("id", symbol)
				.append("symbol", symbol)
				.append("maker", maker)
				.append("taker", taker)
				.toString();
	}
}

package com.leftranservice.service.query.domain;

import java.io.Serializable;
import java.util.Date;

public class PositionResponse implements Serializable {

	private static final long serialVersionUID = -5868700716327223325L;
	/** 会员账号（清算中心） */
	private String memCodeClear;
	/** 会员账号（交易所） */
	private String memCode;
	/** 资金账户（清算中心） */
	private String fundAccountClear;
	/** 持仓产品 */
	private String productCode;
	/** 持仓数量 */
	private Double holdQuantity;
	/** 持仓成本 */
	private Double holdPrice;
	/** 市值 */
	private Double marketValue;
	/** 市场单价 */
	private Double marketPrice;
	/** 盈亏 */
	private Double profitAndLoss;
	/** jbcc变更时间，用于页面显示 格式 yyyy-MM-dd HH:mm:ss */
	private String changeTime;

	public String getMemCodeClear() {
		return memCodeClear;
	}

	public void setMemCodeClear(String memCodeClear) {
		this.memCodeClear = memCodeClear;
	}

	public String getFundAccountClear() {
		return fundAccountClear;
	}

	public void setFundAccountClear(String fundAccountClear) {
		this.fundAccountClear = fundAccountClear;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Double getHoldQuantity() {
		return holdQuantity;
	}

	public void setHoldQuantity(Double holdQuantity) {
		this.holdQuantity = holdQuantity;
	}

	public Double getHoldPrice() {
		return holdPrice;
	}

	public void setHoldPrice(Double holdPrice) {
		this.holdPrice = holdPrice;
	}

	public String getMemCode() {
		return memCode;
	}

	public void setMemCode(String memCode) {
		this.memCode = memCode;
	}

	public Double getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(Double marketValue) {
		this.marketValue = marketValue;
	}

	public Double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Double getProfitAndLoss() {
		return profitAndLoss;
	}

	public void setProfitAndLoss(Double profitAndLoss) {
		this.profitAndLoss = profitAndLoss;
	}

	@Override
	public String toString() {
		return "Position [memCodeClear=" + memCodeClear + ", memCode=" + memCode + ", fundAccountClear="
				+ fundAccountClear + ", productCode=" + productCode + ", holdQuantity=" + holdQuantity + ", holdPrice="
				+ holdPrice + ", marketValue=" + marketValue + ", marketPrice=" + marketPrice + ", profitAndLoss="
				+ profitAndLoss + "]";
	}

	public String getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(String changeTime) {
		this.changeTime = changeTime;
	}

}

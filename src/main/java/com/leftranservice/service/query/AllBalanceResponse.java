package com.leftranservice.service.query;

import java.io.Serializable;
import java.util.List;

import com.leftranservice.service.query.domain.PositionResponse;

public class AllBalanceResponse implements Serializable {

  private static final long serialVersionUID = 1237835025751227163L;
  /** 用户交易账号 */
  private String fundAccount;
  /** 交易所代码 */
  private String exchangeId;
  /** 资金账号 */
  private String exchangeFundAccount;
  /** 资产总余额 */
  private Double assetTotalBal;
  /** 可用金额 */
  private Double ableBal;
  /** 冻结金额 */
  private Double frozenBal;
  /** 可提余额 */
  private Double advanceBal;
  /** 总市值 */
  private Double marketValue;
  /** 总盈亏 */
  private Double profitAndLoss;
  /** 持仓情况 */
  private List<PositionResponse> position;


  /**
   * @return the exchangeId
   */
  public String getExchangeId() {
    return exchangeId;
  }

  /**
   * @param exchangeId
   *          the exchangeId to set
   */
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }

  /**
   * @return the exchangeFundAccount
   */
  public String getExchangeFundAccount() {
    return exchangeFundAccount;
  }

  /**
   * @param exchangeFundAccount
   *          the exchangeFundAccount to set
   */
  public void setExchangeFundAccount(String exchangeFundAccount) {
    this.exchangeFundAccount = exchangeFundAccount;
  }

  /**
   * @return the position
   */
  public List<PositionResponse> getPosition() {
    return position;
  }

  /**
   * @param position
   *          the position to set
   */
  public void setPosition(List<PositionResponse> position) {
    this.position = position;
  }

public String getFundAccount() {
	return fundAccount;
}

public void setFundAccount(String fundAccount) {
	this.fundAccount = fundAccount;
}

public Double getAssetTotalBal() {
	return assetTotalBal;
}

public void setAssetTotalBal(Double assetTotalBal) {
	this.assetTotalBal = assetTotalBal;
}

public Double getAbleBal() {
	return ableBal;
}

public void setAbleBal(Double ableBal) {
	this.ableBal = ableBal;
}

public Double getFrozenBal() {
	return frozenBal;
}

public void setFrozenBal(Double frozenBal) {
	this.frozenBal = frozenBal;
}

public Double getAdvanceBal() {
	return advanceBal;
}

public void setAdvanceBal(Double advanceBal) {
	this.advanceBal = advanceBal;
}

public Double getMarketValue() {
	return marketValue;
}

public void setMarketValue(Double marketValue) {
	this.marketValue = marketValue;
}

public Double getProfitAndLoss() {
	return profitAndLoss;
}

public void setProfitAndLoss(Double profitAndLoss) {
	this.profitAndLoss = profitAndLoss;
}

@Override
public String toString() {
	return "AllBalanceResponse [fundAccount=" + fundAccount + ", exchangeId=" + exchangeId + ", exchangeFundAccount="
			+ exchangeFundAccount + ", assetTotalBal=" + assetTotalBal + ", ableBal=" + ableBal + ", frozenBal="
			+ frozenBal + ", advanceBal=" + advanceBal + ", marketValue=" + marketValue + ", profitAndLoss="
			+ profitAndLoss + ", position=" + position + "]";
}



}
